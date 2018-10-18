package com.qa.LibraryTDD;

public class Book extends Item {

	private String bookISBN;
	
	public Book(String name, String iSBN) {
		super(name);
		setISBN(iSBN);
	}
	
	public String getISBN() {
		return bookISBN;
	}
	
	public void setISBN(String iSBN) {
		this.bookISBN = iSBN;
	}
	
	

}
