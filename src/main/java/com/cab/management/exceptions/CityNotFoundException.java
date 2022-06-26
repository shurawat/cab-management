package com.cab.management.exceptions;

public class CityNotFoundException extends Exception {

	private static final long serialVersionUID = 10L;

	private String message;

	public CityNotFoundException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
