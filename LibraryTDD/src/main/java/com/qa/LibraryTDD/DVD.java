package com.qa.LibraryTDD;

public class DVD extends Item {
	
	private String ageRating;

	public DVD(String name, String rating) {
		super(name);
		setAgeRating(rating);
	}

	public String getAgeRating() {
		return ageRating;
	}

	public void setAgeRating(String rating) {
		this.ageRating = rating;
	}

}
