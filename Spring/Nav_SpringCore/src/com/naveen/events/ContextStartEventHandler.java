package com.naveen.events;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class ContextStartEventHandler implements ApplicationListener<ContextStartedEvent>{

	@Override
	public void onApplicationEvent(ContextStartedEvent arg0) {
		System.out.println("Context start event called");
	}
	
}
