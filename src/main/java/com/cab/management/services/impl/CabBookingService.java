package com.cab.management.services.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cab.management.enums.CabState;
import com.cab.management.exceptions.CabNotAvailableException;
import com.cab.management.exceptions.CityNotFoundException;
import com.cab.management.exceptions.CustomerNotFoundException;
import com.cab.management.model.Cab;
import com.cab.management.model.CabBookDetails;
import com.cab.management.model.City;
import com.cab.management.model.Customer;
import com.cab.management.model.Trip;
import com.cab.management.repository.ICabRepository;
import com.cab.management.repository.ICityRepository;
import com.cab.management.repository.ICustomerRepository;
import com.cab.management.services.ICabBookingService;
import com.cab.management.services.ITripService;

@Service
public class CabBookingService implements ICabBookingService {

	private ICustomerRepository customerRepository;
	private ICabRepository cabRepository;
	private ICityRepository cityRepository;
	private ITripService tripService;

	public CabBookingService(ICustomerRepository customerRepository, ICabRepository cabRepository,
			ICityRepository cityRepository, ITripService tripService) {
		this.customerRepository = customerRepository;
		this.cabRepository = cabRepository;
		this.cityRepository = cityRepository;
		this.tripService = tripService;
	}

	@Override
	public Cab bookCab(String id, CabBookDetails cabBookDetails) throws CabNotAvailableException, CityNotFoundException, CustomerNotFoundException {

		Customer customer = customerRepository.getCustomer(id);
		
		if(customer == null) {
			throw new CustomerNotFoundException("Customer does not exist");
		}

		City fromCity = cityRepository.getCity(cabBookDetails.getFrom());
		if(fromCity == null) {
			throw new CityNotFoundException("We do not support from city " + cabBookDetails.getFrom());
		}
		City toCity = cityRepository.getCity(cabBookDetails.getTo());
		if(toCity == null) {
			throw new CityNotFoundException("We do not support to city " + cabBookDetails.getTo());
		}

		Optional<Cab> cab = cabRepository.getCabToBook(fromCity, cabBookDetails.getType());
		if (!cab.isPresent()) {
			throw new CabNotAvailableException("Cab not available at this time, please try again later");
		}

		Cab bookedCab = cab.get();
		bookedCab.setCabState(CabState.ON_TRIP);
		bookedCab.setCity(toCity);
		bookedCab.setLastTrip(cabBookDetails.getStart());
		Trip trip = new Trip();
		updateTrip(trip, customer, fromCity, toCity, cabBookDetails, bookedCab);
		tripService.addTrip(trip);
		
		return bookedCab;
	}

	private void updateTrip(Trip trip, Customer customer, City fromCity, City toCity, CabBookDetails cabBookDetails, Cab bookedCab) {
		trip.setCab(bookedCab);
		trip.setFrom(fromCity);
		trip.setTo(toCity);
		trip.setRider(customer);
		trip.setStart(cabBookDetails.getStart());
		trip.setEnd(cabBookDetails.getEnd());
	}

}
