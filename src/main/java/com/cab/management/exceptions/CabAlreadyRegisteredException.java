package com.cab.management.exceptions;

public class CabAlreadyRegisteredException extends Exception {

	private static final long serialVersionUID = 10L;

	private String message;

	public CabAlreadyRegisteredException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
