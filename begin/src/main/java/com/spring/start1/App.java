package com.spring.start1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class App {

	public static void main(String[] args) {
	
		BeanFactory ap=new XmlBeanFactory(new ClassPathResource("start1.xml"));//xml file name
		Car c=(Car)ap.getBean("carcar");//same as bean id
		c.running();
	}
}
