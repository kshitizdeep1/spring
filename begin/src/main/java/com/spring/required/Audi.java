package com.spring.required;

import org.springframework.beans.factory.annotation.Required;

public class Audi {

	String Colour;

	public String getColour() {
		return Colour;
	}
	@Required
	public void setColour(String colour) {
		Colour = colour;
	}
}
