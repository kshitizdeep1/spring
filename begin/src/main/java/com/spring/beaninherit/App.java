package com.spring.beaninherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap=new ClassPathXmlApplicationContext("beaninherit.xml");
		Car c=(Car)ap.getBean("car");
		System.out.println(c.toString());
	}

}
