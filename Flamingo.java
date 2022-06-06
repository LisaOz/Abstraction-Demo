package com.qa.abstraction;
	// Flamingo will inherit the values from our abstract class Bird
	// to tell my flamingo to use the interface, implements <interface name>

public class Flamingo  extends Bird implements EatPrawns, LayEgg {
	private String colour;
	public Flamingo (String colour) {
	
		
	// Inherits the Bird constructor
	// There is not bird constructor because you can't
	// make an object from an abstract class
				
		
	super();
		this.colour = colour;
	}
	public String getColour() {
		return colour;
		
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	// Made a new method called noise() that is not abstract
	@Override 
	public void noise() {
		System.out.println("roar + flamingo noise");
		System.out.println("*slurps down prawns*");
	}
		
	
	@Override
	public void eatPrawns() {
		
	}
	
}
	
	
	
		
		


		