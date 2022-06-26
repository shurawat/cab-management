package com.cab.management.services.impl;

import org.springframework.stereotype.Service;

import com.cab.management.exceptions.CityAlreadyPresentException;
import com.cab.management.model.City;
import com.cab.management.repository.ICityRepository;
import com.cab.management.services.ICityOnboardingService;

@Service
public class CityOnboardingService implements ICityOnboardingService {

	private ICityRepository cityRepository;
	
	public CityOnboardingService(ICityRepository cityRepository) {
		this.cityRepository = cityRepository;
	}

	@Override
	public void addNewCity(City city) throws CityAlreadyPresentException {
		if(cityRepository.getCity(city.getName()) != null) {
			throw new CityAlreadyPresentException("Cannot create new city as City already exist with name " + city.getName());
		}
		cityRepository.insert(city);
	}

}
