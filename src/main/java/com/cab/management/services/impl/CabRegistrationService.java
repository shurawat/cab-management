package com.cab.management.services.impl;

import org.springframework.stereotype.Service;

import com.cab.management.exceptions.CabAlreadyRegisteredException;
import com.cab.management.model.Cab;
import com.cab.management.repository.ICabRepository;
import com.cab.management.services.ICabRegistrationService;

@Service
public class CabRegistrationService implements ICabRegistrationService {
	
	private ICabRepository cabRepository;
		
	public CabRegistrationService(ICabRepository cabRepository) {
		super();
		this.cabRepository = cabRepository;
	}

	@Override
	public void registerNewCab(Cab cab) throws CabAlreadyRegisteredException {
		if(cabRepository.getCabById(cab.getId()) != null) {
			throw new CabAlreadyRegisteredException("Cab already registered with Id " + cab.getId());
		}
		cabRepository.insert(cab);

	}

}
