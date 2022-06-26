package com.cab.management.services;

import com.cab.management.exceptions.CityAlreadyPresentException;
import com.cab.management.model.City;

public interface ICityOnboardingService {
	
	public void addNewCity(City city) throws CityAlreadyPresentException;

}
