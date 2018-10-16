package com.qa.Garage;

public class GarethsShoulder extends Vehicle {
	
	GarethsShoulder(String d){
		this.setWheels(0);
		this.setColour("Blue");
		this.setID(d);
		
	}
	
	public void secretMessage() {
		System.out.println("It's so high up here, its like everyone is an ant!");
		System.out.println();
	}

}
