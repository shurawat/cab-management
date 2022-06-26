package com.cab.management.services;

import java.util.Date;
import java.util.List;

import com.cab.management.enums.CabState;
import com.cab.management.model.Trip;

public interface IBonusReportService {

	public List<Trip> searchCab(String cabId, CabState cabState, Date start, Date end);
	

}
