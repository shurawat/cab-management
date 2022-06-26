package com.cab.management.exceptions;

public class CabNotFoundException extends Exception {

	private static final long serialVersionUID = 11L;

	private String message;

	public CabNotFoundException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
