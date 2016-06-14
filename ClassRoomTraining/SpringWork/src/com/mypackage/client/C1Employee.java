package com.mypackage.client;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.mypackage.beans.Employee;

public class C1Employee {
	public static void main(String[] args) {
		// we want an object called Employee 
		/// by not with new 
		
		
	/*	XmlBeanFactory factory = new XmlBeanFactory
				(new ClassPathResource("Beans.xml"));
		*/
		// ApplicationContext
		AbstractApplicationContext ctx = new
					ClassPathXmlApplicationContext(new String[]{"Beans.xml", "postjobs.xml"});
		
		// Employee emp = (Employee) ctx.getBean("emp");
		Employee emp = ctx.getBean("emp", Employee.class);
		
		
		
		System.out.println("Emp id : " + emp.getEmpId());
		System.out.println("Emp First Name " + emp.getName().getFirstName());
		System.out.println("Emp Last Name " + emp.getName().getLastName());
		System.out.println("Emp Middle Name " + emp.getName().getMiddleName());

		
		// if the bean scope is protype the 
		// destruction is not done 
		
		ctx.registerShutdownHook();
		System.out.println("other business logic goes... ");
		
	}
}





