package com.cab.management.repository.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.cab.management.exceptions.CabNotFoundException;
import com.cab.management.model.City;
import com.cab.management.model.Location;
import com.cab.management.repository.ICityRepository;

@Component
public class CityRepository implements ICityRepository {
	

	Map<String, City> citiesMap = new HashMap<>();

	private CityRepository() {
		initialCityLoad();
	}

	public void initialCityLoad() {
		citiesMap.put("Pune", new City(1, "Pune", new Location(18.516726, 73.856255)));
		citiesMap.put("Mumbai", new City(2, "Mumbai", new Location(19.076090, 72.877426)));
		citiesMap.put("Bangalore", new City(3, "Bangalore", new Location(12.972442, 77.580643)));
	}

	@Override
	public void insert(City city) {
		citiesMap.put(city.getName(), city);
	}

	public Map<String, City> getCityMap() {
		Map<String, City> tempCitesMap = new HashMap<>();
		tempCitesMap.putAll(citiesMap);
		return tempCitesMap;
	}

	@Override
	public City getCity(String name) {
		return citiesMap.get(name);
	}

	@Override
	public void checkCityPresent(String cityName) throws CabNotFoundException {
		if (!citiesMap.containsKey(cityName)) {
			throw new CabNotFoundException("City not available in database with name " + cityName);
		}
	}

	@Override
	public List<City> getCities() {
		return citiesMap.values().stream().collect(Collectors.toList());
	}

}
