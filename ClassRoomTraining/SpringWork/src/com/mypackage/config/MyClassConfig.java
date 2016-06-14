package com.mypackage.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import com.mypackage.beans.MyClass;

@Configurable
@Import(YourClassConfig.class)
public class MyClassConfig {
	@Bean
	public MyClass myClass(){
		return new MyClass();
	}
}

/*
 * <bean class="com.mypackage.beans.MyClass" id="myClass"></bean>
 * */
