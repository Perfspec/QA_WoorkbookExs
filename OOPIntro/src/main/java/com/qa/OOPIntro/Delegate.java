package com.qa.OOPIntro;

public class Delegate {
	private String name;
	private Integer age;
	private String jobTitle;
	
	public Delegate(String n, Integer a, String t) {
		this.name = n;
		this.age = a;
		this.jobTitle = t;
	}
	
	public void out()
	{
		System.out.println(name + " "+ age.toString() + " "+ jobTitle);
	}
	
	public String getName() {
		return this.name;
	}
	

}
