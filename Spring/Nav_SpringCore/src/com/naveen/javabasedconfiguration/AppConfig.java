package com.naveen.javabasedconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Employee employee(){
		return new Employee("101", name("Naveen", "kumar"));
		
	}
	
	
	@Bean
	public Name name(String fName, String lName){
		return new Name(fName, lName);
	}
}
