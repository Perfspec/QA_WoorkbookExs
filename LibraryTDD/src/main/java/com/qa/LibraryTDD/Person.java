package com.qa.LibraryTDD;

import java.util.ArrayList;

public class Person {

	private String personName;
	private ArrayList<Item> itemList;
	
	public Person(String name, Item item) {
		setName(name);
		itemList = new ArrayList<Item>();
		addItem(item);
	}
	
	public Person(String name, ArrayList<Item> items) {
		setName(name);
		setItems(items);
	}

	public String getName() {
		return personName;
	}

	public void setName(String personName) {
		this.personName = personName;
	}

	public ArrayList<Item> getItems() {
		return itemList;
	}

	public void setItems(ArrayList<Item> items) {
		this.itemList = items;
	}
	
	public Item getItem(int i) {
		return itemList.get(i);
	}
		
	public void addItem(Item item) {
		this.itemList.add(item);
	}

	public void setItem(int i, Item item) {
		this.itemList.set(i, item);		
	}

}
