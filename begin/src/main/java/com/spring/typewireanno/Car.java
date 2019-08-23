package com.spring.typewireanno;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {

	Audi audi1;//ref of Audi
	public Audi getAudi1() {
		return audi1;
	}
	@Autowired
	public void setAudi1(Audi audi1) {
		this.audi1 = audi1;
	}
	@Override
	public String toString() {
		return "Car [Audi1()=" + getAudi1().getColour() + "]";
	}
	
}
