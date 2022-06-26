package com.cab.management.exceptions;

public class CustomerAlreadyPresentException extends Exception {

	private static final long serialVersionUID = 10L;

	private String message;

	public CustomerAlreadyPresentException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
