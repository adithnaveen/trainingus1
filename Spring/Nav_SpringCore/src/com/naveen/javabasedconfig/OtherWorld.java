package com.naveen.javabasedconfig;

public class OtherWorld {
	private String message;

	public String getMessage() {
		System.out.println("Message from other world");
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init(){
		System.out.println("init other world");
	}
	
	public void destroy(){
		System.out.println("Destroy other world");
	}
}
