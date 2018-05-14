package com.shell.geodetic.exception;

public class ValidationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2204702861160751953L;
	
	private String message;
	
	public ValidationException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {		
		return this.message;
	}
}
