package com.ty;

public class InsufficientTickets extends RuntimeException{
	private String message;
	public InsufficientTickets(String message) {
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
}
