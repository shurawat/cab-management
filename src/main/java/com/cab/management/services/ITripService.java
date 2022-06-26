package com.cab.management.services;

import java.util.Set;

import com.cab.management.model.Trip;

public interface ITripService {

	public Set<Trip> getTrips();
	
	public void addTrip(Trip trip);

}
