package com.cab.management.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cab.management.model.City;
import com.cab.management.repository.ICityRepository;
import com.cab.management.services.ICityFetchService;

@Service
public class CityFetchService implements ICityFetchService {

	@Autowired
	ICityRepository cityRepository;

	@Override
	public List<City> getCities() {
		return cityRepository.getCities();
	}

}
