package com.cab.management.repository;

import java.util.List;
import java.util.Map;

import com.cab.management.exceptions.CabNotFoundException;
import com.cab.management.model.City;

public interface ICityRepository {

	public void insert(City city);

	public Map<String, City> getCityMap();

	public City getCity(String name);

	public void checkCityPresent(String cityName) throws CabNotFoundException;

	public List<City> getCities();

}
