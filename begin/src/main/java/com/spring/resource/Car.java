package com.spring.resource;

import javax.annotation.Resource;

public class Car {

	@Resource(name="b")
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
