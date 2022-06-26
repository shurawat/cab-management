package com.cab.management.model;

public class City {
	
	private int id;
	private String name;
	private Location location;
	
	public City(int id, String name, Location location) {
		this.id = id;
		this.name = name;
		this.location = location;
	}
	
	public Double distance(City city) {
		return this.location.distance(city.location);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}
