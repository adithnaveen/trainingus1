package com.naveen.javabasedconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld hw = ctx.getBean(HelloWorld.class);
		OtherWorld o = ctx.getBean(OtherWorld.class);
		hw.setMessage("hi");
		
		System.out.println(hw.getMessage()); 
		
		o.getMessage();
		
		ctx.registerShutdownHook();
	}
}
