package com.naveen;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopes {
	public static void main(String[] args) {
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("Beans.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");

		EmployeeBean emp1 = (EmployeeBean) context.getBean("employee");
		emp1.setEmpName("Naveen");
		System.out.println("Emp 1 is " + emp1.getEmpName());

		EmployeeBean emp2 = (EmployeeBean) context.getBean("employee");
		emp2.setEmpName("kumar");
		System.out.println("Emp 2 is " + emp1.getEmpName());

		context.registerShutdownHook();

	}
}
