package com.spring.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
	
		ApplicationContext ap=new ClassPathXmlApplicationContext("beanscope.xml");//xml file name
		ap.getBean("carcar");//same as bean id
		ap.getBean("carcar");
	    ap.getBean("carcar");
	}
}
