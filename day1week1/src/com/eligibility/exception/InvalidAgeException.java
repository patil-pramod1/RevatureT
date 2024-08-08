package com.eligibility.exception;

public class InvalidAgeException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage(){
		return "not valid";
	}
}
