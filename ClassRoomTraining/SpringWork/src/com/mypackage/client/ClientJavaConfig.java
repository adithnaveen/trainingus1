package com.mypackage.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.mypackage.beans.MyClass;
import com.mypackage.beans.YourClass;
import com.mypackage.config.MyClassConfig;

public class ClientJavaConfig {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = 
				new AnnotationConfigApplicationContext
						(MyClassConfig.class);
		
		MyClass mc = ctx.getBean(MyClass.class);
		YourClass yc= ctx.getBean(YourClass.class);
		
//		mc.setMyMessage("from client setting message");
		System.out.println(mc.getMyMessage());
		System.out.println(mc.getTestMessage());
		
		ctx.registerShutdownHook();
		
		
	}
}
