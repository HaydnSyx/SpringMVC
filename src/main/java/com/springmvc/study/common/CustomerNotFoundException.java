package com.springmvc.study.common;

public class CustomerNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 2383017774039974092L;

	public CustomerNotFoundException() {
	}

	public CustomerNotFoundException(String message) {
		super(message);
	}
}
