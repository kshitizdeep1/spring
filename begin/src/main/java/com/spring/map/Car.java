package com.spring.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

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
		Iterator<Map.Entry<Integer, Audi>> itr=audi.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, Audi> entry=itr.next();
			System.out.println("Audi"+entry.getKey()+" = "+entry.getValue().getColour());
		}
	}
	
}
