package com.naveen.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
	
	 ApplicationContext context = 
             new ClassPathXmlApplicationContext("AOPBeans.xml");
 
	 Student student = (Student) context.getBean("student");

	 student.getAge();
	 student.getName();
	 try{
	 student.printThrowException();
	 }catch(Exception e){
		 System.out.println("Exception caught in main thrown from printThrowException");
	 }
   }
}
