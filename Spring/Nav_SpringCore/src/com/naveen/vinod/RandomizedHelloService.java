package com.naveen.vinod;

import java.util.Random;


public class RandomizedHelloService implements HelloService {

	public RandomizedHelloService() {
		System.out.println("RandomizedHelloService instanciated.");
	}
	
	@Override
	public void sayHello(String name) {
		
		String []msgs = {
			"Hello %s, how are you?",
			"Hi %s, hope you ar doing good!",
			"Howdy %s!",
			"Holla %s, Welcome!",
			"Greetings %s, have a nice day"
		};
		
		int index = new Random().nextInt(msgs.length);
		System.out.printf(msgs[index], name);
		System.out.println();
		
	}
}
