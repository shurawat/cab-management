package com.cab.management.services.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cab.management.model.Trip;
import com.cab.management.repository.ITripRepository;
import com.cab.management.services.ITripService;

@Service
public class TripService implements ITripService{
	
	@Autowired
	ITripRepository tripRepository;

	@Override
	public Set<Trip> getTrips() {
		return tripRepository.getTrips();
	}

	@Override
	public void addTrip(Trip trip) {
		tripRepository.addTrip(trip);
	}
	

	
}
