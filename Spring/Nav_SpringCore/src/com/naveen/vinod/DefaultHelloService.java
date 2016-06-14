package com.naveen.vinod;


public class DefaultHelloService implements HelloService {
	
	public DefaultHelloService() {
		System.out.println("DefaultHelloService instanciated.");
	}

	@Override
	public void sayHello(String name) {
		System.out.println("Hello, " + name + ".");
	}
}
