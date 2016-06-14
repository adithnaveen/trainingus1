package com.naveen.aop1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"AOPBeans1.xml");

		Student student = (Student) context.getBean("student");

		student.setName("NAVEEN KUMAR KS");
		System.out.println(student.getAge());
		System.out.println(student.getName());
		
		
		
//		try {
//			student.printThrowException();
//		} catch (Exception e) {
//			System.out
//					.println("Exception caught in main thrown from printThrowException");
//		}
	}
}
