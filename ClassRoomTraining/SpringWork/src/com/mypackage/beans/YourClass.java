package com.mypackage.beans;

public class YourClass {
	private String yourMessage;

	public String getYourMessage() {
		return yourMessage;
	}

	public void setYourMessage(String yourMessage) {
		this.yourMessage = yourMessage;
	}
	
	public void init(){
		System.out.println("init in your class");
	}
	
	public void destroy(){
		System.out.println("Destroy in your class");
	}
}
