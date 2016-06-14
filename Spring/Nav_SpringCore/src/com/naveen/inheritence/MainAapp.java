package com.naveen.inheritence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAapp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans_Inheritence.xml");
		
		Animal ani = (Animal) context.getBean("animal");
		System.out.println(ani.getTalk());
		System.out.println(ani.getWalk());
		
		Human human = (Human) context.getBean("human");
		System.out.println(human.getParty());
		System.out.println(human.getRide());
		System.out.println(human.getTalk());
		System.out.println(human.getWalk());
		
		
		// if you have observed in this case we have not passed talk  in the .xml file and still it is taken
		// if you dont want to create an object of the class animal you can specify as abstract in .xml file 
		
	}
}
