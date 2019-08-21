package com.spring.trai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("inherit.xml");
		Traingle t=(Traingle)ap.getBean("trai");
		t.drawTrai();
	}

}
