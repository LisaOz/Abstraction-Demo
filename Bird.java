package com.qa.abstraction;

public abstract class Bird {
	

// To make this class an abstract class
// use the word abstract in front of class
	
// Bird is now a blueprint, will not have a constructor but can have methods and variables
// Standard method
//	public void layEgg() {
//	System.out.println("Laid an egg!");
//	}

// Abstract method - an abstract method with no body
// Any child classes that use this MUST SPECIFY WHAT noise() does
// ensure all child classes have a method called noise() with each class specifying what it does 
		
	public abstract void noise();

		public void eatPrawns() {
	
		
	}

		public String layEgg() {
	
			return null;
	}

	// Standard variable
		public int wingSpan;

		public int getWingSpan() {
			return wingSpan;
	}

		public void setWingSpan(int wingSpan) {
			this.wingSpan = wingSpan;
	}
}
	
