package com.qa.Hospital;

public class Doctor {

	private int dGrade;
	private boolean dIsConsultant;
	private boolean dAllocated;
	public Doctor(int grade, boolean isConsultant, boolean allocated) {
		setGrade(grade);
		setIsConsultant(isConsultant);
		setAllocated(allocated);
	}
	public int getGrade() {
		return dGrade;
	}
	public void setGrade(int dGrade) {
		this.dGrade = dGrade;
	}
	public boolean isConsultant() {
		return dIsConsultant;
	}
	public void setIsConsultant(boolean dIsConsultant) {
		this.dIsConsultant = dIsConsultant;
	}
	public boolean isAllocated() {
		return dAllocated;
	}
	public void setAllocated(boolean dAllocated) {
		this.dAllocated = dAllocated;
	}

}
