package com.cab.management.model;

public class Driver extends Account{
	
	public Driver(String id, String firstName, String lastName, String aadharNumber, String mobileNumber, String license) {
		super(id, firstName, lastName, aadharNumber, mobileNumber);
		this.licenseNumber = license;
	}
	private String licenseNumber;
	

	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	
	

}
