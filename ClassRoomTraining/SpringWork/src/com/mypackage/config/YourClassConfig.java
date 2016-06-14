package com.mypackage.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import com.mypackage.beans.YourClass;

@Configurable
public class YourClassConfig {
	
	@Bean(initMethod="init", destroyMethod="destroy")
	public YourClass yourClass(){
		return new YourClass();
	}
}
