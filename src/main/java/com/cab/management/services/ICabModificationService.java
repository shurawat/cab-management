package com.cab.management.services;

import com.cab.management.enums.CabState;
import com.cab.management.exceptions.CabNotFoundException;
import com.cab.management.exceptions.CityNotFoundException;

public interface ICabModificationService {
	
	public String modifyCity(String cabId, String cityId) throws CityNotFoundException, CabNotFoundException;
	public String modifyCabState(String cabId, CabState state) throws CabNotFoundException;
	
}
