package com.spring.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Car implements ApplicationContextAware,BeanNameAware {

	Audi audi1;//ref of Audi
	Audi audi2;//ref of Audi
	private ApplicationContext ap=null;
	public Car(Audi audi1, Audi audi2) {
		super();
		this.audi1 = audi1;
		this.audi2 = audi2;
	}

	public Audi getAudi1() {
		return audi1;
	}

	public Audi getAudi2() {
		return audi2;
	}

	@Override
	public String toString() {
		return "Car [Audi1()=" + getAudi1().getColour() + ", Audi2()=" + getAudi2().getColour() + "]";
	}

	public void setBeanName(String name) {
		System.out.println("Bean name is "+name);		
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.ap=applicationContext;
		Car c=(Car)ap.getBean("carcar");
		System.out.println(c.toString());
	}
	
}
