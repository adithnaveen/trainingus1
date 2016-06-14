package com.naveen.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans_interfaces.xml");
		
		AreaApp myArea = new AreaApp();
		Figure figure = (Figure) ctx.getBean("figure");
		//figure.area();
		myArea.setFigure(figure);
		myArea.giveArea();
	}
}
