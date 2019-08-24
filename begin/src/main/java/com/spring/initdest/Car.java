package com.spring.initdest;

public class Car {

	Audi audi1;//ref of Audi
	Audi audi2;//ref of Audi
	public Audi getAudi1() {
		return audi1;
	}
	public void setAudi1(Audi audi1) {
		this.audi1 = audi1;
	}
	public Audi getAudi2() {
		return audi2;
	}
	public void setAudi2(Audi audi2) {
		this.audi2 = audi2;
	}
	@Override
	public String toString() {
		return "Car [Audi1()=" + getAudi1().getColour() + ", Audi2()=" + getAudi2().getColour() + "]";
	}
	public void init()
	{
		System.out.println("car starts");
	}
	public void dest()
	{
		System.out.println("car stops");
	}
	
}
