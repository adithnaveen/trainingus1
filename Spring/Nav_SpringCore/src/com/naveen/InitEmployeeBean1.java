package com.naveen;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitEmployeeBean1 implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println("---------After initialization of " + arg1);
		return arg0;
		// or after manipulation you can return any other object also
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {

		System.out.println("------------Before initialization of " + arg1);
		return arg0;
		// or after manipulation you can return any other ojbect also
	}

}
