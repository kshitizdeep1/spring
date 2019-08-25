package com.spring.beannameaware;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class Car implements BeanNameAware {

	public void running()
	{
		System.out.println("car is running");
	}

	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Bean Name = "+name);
	}
}
