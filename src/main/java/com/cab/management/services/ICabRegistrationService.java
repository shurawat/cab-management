package com.cab.management.services;

import com.cab.management.exceptions.CabAlreadyRegisteredException;
import com.cab.management.model.Cab;

public interface ICabRegistrationService {
	
	public void registerNewCab(Cab cab) throws CabAlreadyRegisteredException; 

}
 