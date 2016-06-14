package com.mypackage.postprocessing;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.mypackage.beans.Employee;
import com.mypackage.beans.Name;

public class InitializeBean implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("In After initialization - InitializeBean");
		
		if(arg0 instanceof Employee){
			Employee em = (Employee) arg0;
			Name name = em.getName();
			name.setFirstName(name.getFirstName().toUpperCase());
			em.setName(name);
			return em;
		}
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("In Before initialization - InitializeBean");
		return arg0;
	}

}
