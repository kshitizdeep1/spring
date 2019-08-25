package com.spring.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
	
		ApplicationContext ap=new ClassPathXmlApplicationContext("component.xml");//xml file name
		Car c=(Car)ap.getBean("car");//same as bean id
		c.running();
	}
}
