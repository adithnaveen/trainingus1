package com.naveen.javabasedconfig;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;


@Configurable
public class OtherWorldConfig {

	
	@Bean(initMethod="init", destroyMethod="destroy")
	
	public OtherWorld otherWorld(){
		return new OtherWorld();
	}
}

