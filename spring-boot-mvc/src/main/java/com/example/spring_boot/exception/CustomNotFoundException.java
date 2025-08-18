package com.example.spring_boot.exception;

public class CustomNotFoundException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomNotFoundException(String message) {
		super(message);
	}

}
