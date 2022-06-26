package com.cab.management.model;

import java.util.Date;

import com.cab.management.enums.CabState;
import com.cab.management.enums.CabType;

public class Cab {

	private String id;
	private Driver driver;
	private City city;
	private Date lastTrip;
	private CabState cabState;
	private CabType cabType;

	public Cab(String id, CabType cabType, City city) {

		this.id = id;
		this.cabType = cabType;
		this.cabState = CabState.IDLE;
		this.city = city;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Date getLastTrip() {
		return lastTrip;
	}

	public void setLastTrip(Date lastTrip) {
		this.lastTrip = lastTrip;
	}

	public CabState getCabState() {
		return cabState;
	}

	public void setCabState(CabState cabState) {
		this.cabState = cabState;
	}

	public CabType getCabType() {
		return cabType;
	}

	public void setCabType(CabType cabType) {
		this.cabType = cabType;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}	

}
