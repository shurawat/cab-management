package com.cab.management.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cab.management.model.Trip;
import com.cab.management.services.ITripService;

@RestController
public class TripController {
	
	@Autowired
	ITripService iTripService;
	
	@GetMapping("/trips")
	public Set<Trip> getTrips() {
		return iTripService.getTrips();
	}

}
