package com.spring.map;

import java.util.Iterator;
import java.util.Map;

public class Car {
	private Map<Integer,Audi> audi;
	
	public Map<Integer, Audi> getAudi() {
		return audi;
	}

	public void setAudi(Map<Integer, Audi> audi) {
		this.audi = audi;
	}

	public void display()
	{
		System.out.println(audi);
	}
	
}
