package com.spring.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	@Autowired
	@Qualifier("a")
	Audi audi1;//ref of Audi
	public Audi getAudi1() {
		return audi1;
	}
	public void setAudi1(Audi audi1) {
		this.audi1 = audi1;
	}
	@Override
	public String toString() {
		return "Car [Audi1()=" + getAudi1().getColour() + "]";
	}
	
}
