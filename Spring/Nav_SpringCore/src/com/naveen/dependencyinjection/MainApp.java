package com.naveen.dependencyinjection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		TextEditor te = (TextEditor) context.getBean("texteditor");
		
		te.spellCheck();
		
		 context.registerShutdownHook();
	}
}
