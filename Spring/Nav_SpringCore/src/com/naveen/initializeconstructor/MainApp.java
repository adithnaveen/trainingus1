package com.naveen.initializeconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");

		Student student = (Student) context.getBean("student");

		System.out.println(student.getsId());
		System.out.println(student.getsName());
	}
}
