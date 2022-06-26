package com.cab.management.repository;

import java.util.List;
import java.util.Optional;

import com.cab.management.enums.CabState;
import com.cab.management.enums.CabType;
import com.cab.management.exceptions.CabNotFoundException;
import com.cab.management.model.Cab;
import com.cab.management.model.City;

public interface ICabRepository {


	public Cab getCabById(String id);

	public void insert(Cab cab);

	public void updateCabCity(String cabId, String cityName);

	public void updateCabState(String cabId, CabState cabState) throws CabNotFoundException;

	public Optional<Cab> getCabToBook(City from, CabType type);
	
	public List<Cab> getCabs();

}
