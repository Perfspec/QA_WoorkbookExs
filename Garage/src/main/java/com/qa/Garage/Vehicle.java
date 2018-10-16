package com.qa.Garage;

public abstract class Vehicle {
	private Integer numWheels;
	private String colour;
	private String iDPlate;
	
	Vehicle() {	}
	
	public int getWheels() {
		return numWheels;
	}
	public String getColour() {
		return colour;
	}
	public String getID() {
		return iDPlate;
	}
	
	
	public void setWheels(int w) {
		numWheels = w;
	}	
	
	public void setColour(String w) {
		colour = w;
	}
	public void setID(String w) {
		iDPlate = w;
	}
	
	public double calculateCost() {
		double extra = 0;
		if(colour.equals("Gold")) {
			extra = 100.0;
		}
		return 100.0*numWheels + extra + iDPlate.length()*2.0;
	}
	
	public abstract void secretMessage();
	
	public void printVehicle() {
		System.out.println(numWheels.toString()+" "+colour+" "+iDPlate);
	}
	

}
