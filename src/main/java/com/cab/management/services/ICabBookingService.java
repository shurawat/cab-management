package com.cab.management.services;

import com.cab.management.exceptions.CabNotAvailableException;
import com.cab.management.exceptions.CityNotFoundException;
import com.cab.management.exceptions.CustomerNotFoundException;
import com.cab.management.model.Cab;
import com.cab.management.model.CabBookDetails;

public interface ICabBookingService {
	
	public Cab bookCab(String id, CabBookDetails cabBookDetails) throws CabNotAvailableException, CityNotFoundException, CustomerNotFoundException;

}
