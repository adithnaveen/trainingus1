package com.naveen.vinod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Program01 {

	public static void main(String[] args) {

		// this application depends on HelloService and
		// not on any specific implementation

		HelloService service = null;

		// create a spring container
		ApplicationContext ctx = null;
		ctx = new ClassPathXmlApplicationContext("vinbeans.xml");

		service = (HelloService) ctx.getBean("helloService");

		for (int i = 0; i < 10; i++) {
			service.sayHello("Vinod");
		}

	}
}
