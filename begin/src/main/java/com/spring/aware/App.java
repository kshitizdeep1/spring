package com.spring.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
	
		ApplicationContext ap=new ClassPathXmlApplicationContext("aware.xml");//xml file name
		Car c=(Car)ap.getBean("carcar");//same as bean id
		System.out.println(c.toString());
	}
}
