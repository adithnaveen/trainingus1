package com.naveen.javabasedconfig;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;


@Configurable
@Import(OtherWorldConfig.class)
public class HelloWorldConfig {
	@Bean
	public HelloWorld helloWorld(){
		return new HelloWorld();
	}
}
