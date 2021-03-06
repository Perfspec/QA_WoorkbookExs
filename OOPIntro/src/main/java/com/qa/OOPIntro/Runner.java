package com.qa.OOPIntro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Runner {

	public static void main(String[] args) {
		
		Delegate d1 = new Delegate("Lyusien",23,"Legend");
		Delegate d2= new Delegate("Jon",32,"Legend");
		Delegate d3 = new Delegate("Conor",23,"IrishGangsta");
		Delegate d4 = new Delegate("Alex",26,"Legend");
		Delegate d5 = new Delegate("Aymara",20,"Legend in training");
		Delegate d6 = new Delegate("Eliane",20,"Legend in training");
		Delegate d7 = new Delegate("Queeny",20,"Legend in training");
				
		List<Delegate> team = new ArrayList<Delegate>();
		
		team.add(d1);
		team.add(d2);
		team.add(d3);
		team.add(d4);
		team.add(d5);
		team.add(d6);
		team.add(d7);
		
		// Consumer<Delegate> printThou = n -> n.out();
		
		// team.stream().forEach(printThou);
		
		searchByName("Queeny", team);
		
		
		
		

	}

	public static void searchByName(String name, List<Delegate> group){
		group.stream().filter(n -> n.getName().equals(name)).collect(Collectors.toList()).forEach(n -> n.out());
	}
	
}

