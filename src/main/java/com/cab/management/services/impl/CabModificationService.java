package com.cab.management.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cab.management.enums.CabState;
import com.cab.management.exceptions.CabNotFoundException;
import com.cab.management.exceptions.CityNotFoundException;
import com.cab.management.model.Cab;
import com.cab.management.model.City;
import com.cab.management.repository.ICabRepository;
import com.cab.management.repository.ICityRepository;
import com.cab.management.services.ICabModificationService;

@Service
public class CabModificationService implements ICabModificationService{
	
	@Autowired
	ICabRepository cabRepository;
	
	@Autowired
	ICityRepository cityRepository;

	@Override
	public String modifyCity(String cabId, String cityName) throws CityNotFoundException, CabNotFoundException {
		City city = cityRepository.getCity(cityName);
		if(city == null) {
			throw new CityNotFoundException("Invalid city name provided");
		}
		Cab cab = cabRepository.getCabById(cabId);
		if(cab == null) {
			throw new CabNotFoundException("Invalid cab id provided");
		}
		cab.setCity(city);
		return "Successfully updated the city";
	}

	@Override
	public String modifyCabState(String cabId, CabState state) throws CabNotFoundException {
		Cab cab = cabRepository.getCabById(cabId);
		if(cab == null) {
			throw new CabNotFoundException("Invalid cab id provided");
		}
		cab.setCabState(state);
		return "Successfully updated the cab state";
	}
	

	
}
