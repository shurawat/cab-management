package com.cab.management.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cab.management.model.Cab;
import com.cab.management.repository.ICabRepository;
import com.cab.management.services.ICabFetchService;

@Service
public class CabFetchService implements ICabFetchService{
	
	@Autowired
	ICabRepository cabRepository;
	
	@Override
	public List<Cab> getCabs() {
		return cabRepository.getCabs();
	}


	
}
