package com.naveen.javabasedconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee emp = context.getBean(Employee.class);
		
		
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName().getfName());
		System.out.println(emp.getName().getlName());
	}
}
