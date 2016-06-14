package com.naveen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppInitialization {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld hello = (HelloWorld) context.getBean("helloWorld");
		
		System.out.println("Message got is " + hello.getMessage());
	}
}
