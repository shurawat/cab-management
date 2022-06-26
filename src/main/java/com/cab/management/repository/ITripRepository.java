package com.cab.management.repository;

import java.util.Set;

import com.cab.management.model.Trip;

public interface ITripRepository {
	
	public void addTrip(Trip trip);
	public Set<Trip> getTrips();

}
