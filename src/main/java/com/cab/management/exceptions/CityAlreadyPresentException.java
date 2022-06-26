package com.cab.management.exceptions;

public class CityAlreadyPresentException extends Exception {

	private static final long serialVersionUID = 10L;

	private String message;

	public CityAlreadyPresentException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
