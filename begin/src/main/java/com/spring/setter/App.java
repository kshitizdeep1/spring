package com.spring.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap=new ClassPathXmlApplicationContext("setter.xml");
		Car c=(Car)ap.getBean("carcar");
		System.out.println(c.toString());
	}

}
