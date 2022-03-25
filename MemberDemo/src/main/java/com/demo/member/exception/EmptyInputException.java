package com.demo.member.exception;

public class EmptyInputException extends RuntimeException {

	private String message;

	EmptyInputException() {

	}

	EmptyInputException(String message) {
		super();
		this.message = message;
	}

}
