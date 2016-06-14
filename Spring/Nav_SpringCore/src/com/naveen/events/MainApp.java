package com.naveen.events;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("Beans_Inheritence.xml");
		
		ctx.start();
		ctx.stop();

		HelloWorld obj = (HelloWorld) ctx.getBean("HelloWorld");
		obj.getMessage();
	}
}
