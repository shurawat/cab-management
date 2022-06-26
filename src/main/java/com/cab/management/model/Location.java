package com.cab.management.model;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt; 

public class Location {
	
	private Double x;
	private Double y;
	
	public Location(Double x, Double y) {
		this.x = x;
		this.y = y;
	}
	
	public Double getX() {
		return x;
	}
	public void setX(Double x) {
		this.x = x;
	}
	public Double getY() {
		return y;
	}
	public void setY(Double y) {
		this.y = y;
	}
	
	public Double distance(Location location) {
		 return sqrt( pow(this.x - location.x, 2) + pow(this.y - location.y, 2) ); 
	}
	

}
