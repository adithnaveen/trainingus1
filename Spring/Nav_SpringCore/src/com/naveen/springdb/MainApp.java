package com.naveen.springdb;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		StudentJDBCTemplate sjt = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
		sjt.create("Kanchan", 28);
		List<Student> slist = sjt.listStudents();
		
		for(Student temp : slist){
			System.out.println("id " + temp.getId() + ", Name " + temp.getName());
		}
	}
}
