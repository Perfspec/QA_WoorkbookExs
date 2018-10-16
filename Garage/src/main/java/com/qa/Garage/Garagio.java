package com.qa.Garage;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Garagio {
	private List<Vehicle> myVehics;
	
	Garagio(List<Vehicle> d) {
		myVehics = d;
	}
	
	public List<Vehicle> getList() {
		return myVehics;
	}
	
	public void setList(List<Vehicle> d) {
		myVehics = d;
	}
	
	public Optional<Double> cost() {
		return myVehics.stream().map(n ->n.calculateCost()).reduce((a,b)->a+b);
	}
	
	public void add(Vehicle a) {
		myVehics.add(a);
	}
	
	public void rm(Vehicle a) {
		myVehics.remove(a);
	}
	
	public void rm(String iD) {
		myVehics.removeIf(v -> v.getID().equals(iD));
	}
	
	public void empty() {
		myVehics = new ArrayList<Vehicle>();
		System.out.println("The Garage has been emptied");
	}
	
	
	public void printList() {
		this.getList().stream().forEach(n ->n.printVehicle());
		System.out.println();
	}

}
