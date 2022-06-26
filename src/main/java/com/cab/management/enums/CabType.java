package com.cab.management.enums;

public enum CabType {
	
	HATCHBACK("HATCHBACK"), SEDAN("SEDAN"), PRIME_SEDAN("PRIME_SEDAN"), SEVEN_SEATER("SEVEN_SEATER");
	
	CabType(String value) {
		
		this.value = value;
		
	}

	String value;
	
	 @Override 
	 public String toString() {
         return value;
    }
	 
	
	
}
