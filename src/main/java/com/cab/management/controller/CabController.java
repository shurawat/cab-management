package com.cab.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cab.management.enums.CabState;
import com.cab.management.exceptions.CabAlreadyRegisteredException;
import com.cab.management.exceptions.CabNotFoundException;
import com.cab.management.exceptions.CityNotFoundException;
import com.cab.management.model.Cab;
import com.cab.management.services.ICabFetchService;
import com.cab.management.services.ICabModificationService;
import com.cab.management.services.ICabRegistrationService;

@RestController
public class CabController {

	@Autowired
	ICabRegistrationService cabRegistrationService;

	@Autowired
	ICabModificationService cabModificationService;
	
	@Autowired
	ICabFetchService cabFetchService;

	@PostMapping("/cab/register")
	public String bookCab(@RequestBody Cab cab) throws CabAlreadyRegisteredException {
		cabRegistrationService.registerNewCab(cab);
		return "Successfully registerd the cab";
	}

	@PutMapping("/cab/{cabId}/city/{cityId}")
	public String updateCabCity(@PathVariable("cabId") String cabId, @PathVariable("cityId") String cityId)
			throws CabAlreadyRegisteredException, CityNotFoundException, CabNotFoundException {
		return cabModificationService.modifyCity(cabId, cityId);
	}

	@PutMapping("/cab/{cabId}/state/{stateId}")
	public String updateCabState(@PathVariable("cabId") String cabId, @PathVariable("stateId") CabState cabState)
			throws CabAlreadyRegisteredException, CityNotFoundException, CabNotFoundException {
		return cabModificationService.modifyCabState(cabId, cabState);
	}
	
	@GetMapping("/cabs")
	public List<Cab> getCabs(){
		return cabFetchService.getCabs();
	}

}
