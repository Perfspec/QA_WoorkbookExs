package com.qa.Garage;

public class Drones extends Vehicle{
	
	Drones(String c,String d) {
		this.setWheels(0);
		this.setColour(c);
		this.setID(d);
	}

	public void secretMessage() {
		System.out.println("Push the button! Let the Drone go, honey.");
		System.out.println("I'm a flyin'. It's so God damn funny!");
		System.out.println();
	}
}
