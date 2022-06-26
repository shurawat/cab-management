package com.cab.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cab.management.exceptions.CityAlreadyPresentException;
import com.cab.management.model.City;
import com.cab.management.services.ICityFetchService;
import com.cab.management.services.ICityOnboardingService;

@RestController
public class CityController {
	
	@Autowired
	ICityOnboardingService cityOnboardingService;
	
	@Autowired
	ICityFetchService cityFetchService;
	
	@PostMapping("/city")
	public String onBoardCity(@RequestBody City city) throws CityAlreadyPresentException {
		cityOnboardingService.addNewCity(city);
		return "Successfully Added city";
	}
	
	@GetMapping("/cities")
	public List<City> getCities() {
		return cityFetchService.getCities();
	}

}
