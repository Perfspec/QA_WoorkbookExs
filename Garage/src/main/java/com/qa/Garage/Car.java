package com.qa.Garage;

public class Car extends Vehicle {
	
	Car(String c, String d) {
		this.setWheels(4);
		this.setColour(c);
		this.setID(d);
	}
	
	public void secretMessage() {
		System.out.println("I've been driving in my car!");
		System.out.println();
	}

}
