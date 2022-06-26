package com.cab.management.exceptions;

public class CustomerNotFoundException extends Exception {

	private static final long serialVersionUID = 11L;

	private String message;

	public CustomerNotFoundException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
