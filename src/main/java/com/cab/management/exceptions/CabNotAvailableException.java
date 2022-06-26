package com.cab.management.exceptions;

public class CabNotAvailableException extends Exception {

	private static final long serialVersionUID = 11L;

	private String message;

	public CabNotAvailableException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
