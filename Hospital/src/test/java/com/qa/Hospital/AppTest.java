package com.qa.Hospital;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void testDoctorCreation()
    {
    	int grade = 1;
    	boolean isConsultant = true;
    	boolean allocated = false;
        Doctor junior = new Doctor(grade, isConsultant, allocated);
        assertEquals(false, junior.isConsultant());
    }
    
    @Test
    public void testTeamCreation()
    {
    	boolean isConsultant = false;
    	boolean allocated = false;
    	ArrayList<Doctor> allDoctors = new ArrayList<Doctor>();
    	TeamManager teamManager = new TeamManager(allDoctors);
    	teamManager.add(new Doctor(1, isConsultant, allocated));
    	teamManager.add(new Doctor(2, isConsultant, allocated));
    	teamManager.add(new Doctor(3, isConsultant, allocated));
    	teamManager.add(new Doctor(4, isConsultant, allocated));
    	isConsultant = true;
    	teamManager.add(new Doctor(3, isConsultant, allocated));
    	teamManager.add(new Doctor(6, isConsultant, allocated));
    	
    	teamManager.create
    }
}
