package com.spring.set;

import java.util.List;

public class Car {
	private List<Audi> audi;
	
	public List<Audi> getAudi() {
		return audi;
	}

	public void setAudi(List<Audi> audi) {
		this.audi = audi;
	}
	public void display()
	{
		for(Audi audi1:audi)
		{
			System.out.println("audi "+audi1.getColour());
		}
	}
	
}
