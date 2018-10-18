package com.qa.LibraryTDD;

public class Item {
	private String itemName;
	
	public Item(String string) {
		setName(string);
	}

	public String getName() {
		return itemName;
	}
	
	public void setName(String string) {
		this.itemName = string;		
	}
}
