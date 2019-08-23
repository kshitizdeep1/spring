package com.spring.constructor;

public class Car {

	Audi audi1;//ref of Audi
	
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
