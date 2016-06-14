package com.mypackage.beans;

import org.springframework.beans.factory.annotation.Value;

public class MyClass {
	@Value(value="hello")
	private String myMessage;

	@Value(value="test message")
	private String testMessage;
	
	
	public String getMyMessage() {
		return myMessage;
	}

	public void setMyMessage(String myMessage) {
		this.myMessage = myMessage;
	}

	public String getTestMessage() {
		return testMessage;
	}

	public void setTestMessage(String testMessage) {
		this.testMessage = testMessage;
	}
	
}
