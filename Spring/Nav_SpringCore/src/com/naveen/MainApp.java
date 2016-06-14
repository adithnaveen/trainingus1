package com.naveen;

import java.util.logging.Logger;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		System.out.println("message got is " + obj.getMessage());

		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		
		HelloWorld obj1 = (HelloWorld) factory.getBean("helloWorld");
		System.out.println("Message got from bean is " + obj1.getMessage());
		
		
		ApplicationContext context1 = new FileSystemXmlApplicationContext
			("//Users/naveenkumar/Documents/workspace-ggts-3.2.0.RELEASE/SpringJava/XMLFiles/Beans.xml");
		HelloWorld obj2 = (HelloWorld) context1.getBean("helloWorld");
		System.out.println("Obj 2 " + obj2.getMessage());
	}
}
