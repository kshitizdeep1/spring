package com.spring.constructorwireanno;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {

	Audi audi1;//ref of Audi
	@Autowired
	public Car(Audi audi1) {
		super();
		this.audi1 = audi1;
	}
	public Audi getAudi1() {
		return audi1;
	}
	@Override
	public String toString() {
		return "Car [Audi1()=" + getAudi1().getColour() + "]";
	}
	
}
