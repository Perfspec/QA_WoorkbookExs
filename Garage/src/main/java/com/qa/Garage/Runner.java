package com.qa.Garage;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car fiat = new Car("Maroon","WM52 NWR");
		Car fiat2 = new Car("Maroon1","WM52 NWR");
		Drones quadCopter = new Drones("Gold","FL7 H1GH");
		GarethsShoulder left = new GarethsShoulder("Gareth");
		
		
		List<Vehicle> lv = new ArrayList<Vehicle>();
		
		Garagio bigOlShack = new Garagio(lv);
		
		bigOlShack.add(fiat);
		bigOlShack.add(fiat2);
		bigOlShack.add(quadCopter);
		bigOlShack.add(left);
		
		// System.out.println(bigOlShack.cost());
		
		// bigOlShack.rm(fiat);
		
		bigOlShack.rm("WM52 NWR");
		// bigOlShack.empty();
		bigOlShack.printList();
		
		
		
		
		
	}

}
