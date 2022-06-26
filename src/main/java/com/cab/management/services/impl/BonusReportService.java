package com.cab.management.services.impl;

import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cab.management.enums.CabState;
import com.cab.management.model.Trip;
import com.cab.management.repository.ITripRepository;
import com.cab.management.services.IBonusReportService;

@Service
public class BonusReportService implements IBonusReportService{
	
	@Autowired
	ITripRepository tripRepository;

	@Override
	public List<Trip> searchCab(String cabId, CabState cabState, Date start, Date end) {
		Set<Trip> trips = tripRepository.getTrips();
		
		List<Trip> cabTrips = trips.stream()
				.filter(t -> t.getCab().getId().equals(cabId) && t.getStart().after(start) && t.getEnd().before(end))
				.collect(Collectors.toList());		
		return cabTrips;
	}

}
