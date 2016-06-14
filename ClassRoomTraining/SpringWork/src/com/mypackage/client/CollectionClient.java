package com.mypackage.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mypackage.beans.JavaCollection;

public class CollectionClient {
	public static void main(String[] args) {

		AbstractApplicationContext ctx = new
					ClassPathXmlApplicationContext(new String[]{"Beans.xml"});
		
		JavaCollection jc = ctx.getBean("collection", JavaCollection.class);
		
		
		System.out.println(jc.getAddressList());
		System.out.println(jc.getAddressSet());
		System.out.println(jc.getAddressMap());
	}
}
