package com.cab.management.repository.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.cab.management.model.Trip;
import com.cab.management.repository.ITripRepository;

@Component
public class TripRepository implements ITripRepository {
	Set<Trip> trips = new HashSet<>();

	@Override
	public void addTrip(Trip trip) {
		trips.add(trip);
	}

	@Override
	public Set<Trip> getTrips() {
		Set<Trip> temp = new HashSet<>();
		temp.addAll(trips);
		return temp;
	}

}
