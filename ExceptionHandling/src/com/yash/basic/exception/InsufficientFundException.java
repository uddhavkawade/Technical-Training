package com.yash.basic.exception;

public class InsufficientFundException extends RuntimeException {
	private String message;
	public InsufficientFundException(String message) {
	//this.message = message;
	super(message);
	}
}
