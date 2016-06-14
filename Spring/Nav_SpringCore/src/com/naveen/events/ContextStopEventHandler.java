package com.naveen.events;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class ContextStopEventHandler implements ApplicationListener<ContextStoppedEvent>{

	@Override
	public void onApplicationEvent(ContextStoppedEvent arg0) {
		System.out.println("Stop event called");
	}
}
