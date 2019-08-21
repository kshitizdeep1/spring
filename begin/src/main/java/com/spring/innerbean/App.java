package com.spring.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("innerbean.xml");
		Traingle t=(Traingle)ap.getBean("traingle");
		t.drawTrai();

	}

}
