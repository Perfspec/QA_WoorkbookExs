package com.qa.Hospital;

import java.util.ArrayList;

public class TeamManager {

	private ArrayList<Doctor> allDoctors;
	
	public TeamManager(ArrayList<Doctor> allDoctors) {
		setAllDoctors(allDoctors);
		
	}

	public ArrayList<Doctor> getAllDoctors() {
		return allDoctors;
	}

	public void setAllDoctors(ArrayList<Doctor> allDoctors) {
		this.allDoctors = allDoctors;
	}

}
