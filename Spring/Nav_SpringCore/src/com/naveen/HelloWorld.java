package com.naveen;

public class HelloWorld {
	private String message;

	public HelloWorld() {
		System.out.println("object created");
	}
	HelloWorld(String message){
		this.message = message;
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
