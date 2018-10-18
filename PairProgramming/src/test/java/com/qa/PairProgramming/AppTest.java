package com.qa.PairProgramming;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class AppTest 
{

	@Test
    public void testApp1()
    {
		String s1 = "live";
		String s2 = "verses";
		
		Merger m1 = new Merger();
		
        assertEquals("liverses", m1.merge(s1,s2) );
        
    }
	
	@Test
    public void testApp2()
    {
		ArrayList<String> stringList = new ArrayList<String>();
		String sentence = "Deep episodes of Deep Space Nine came on the television only after the news.";
		
		String s1 = "Deep";
		String s2 = "episodes";
		String s3 = "of";
		String s4 = "Deep";
		String s5 = "Space";
		String s6 = "Nine";
		String s7 = "came";
		String s8 = "on";
		String s9 = "the";
		String s10 = "television";
		String s11 = "only";
		String s12 = "after";
		String s13 = "the";
		String s14 = "news.";
		
		stringList.add(s1);
		stringList.add(s2);
		stringList.add(s3);
		stringList.add(s4);
		stringList.add(s5);
		stringList.add(s6);
		stringList.add(s7);
		stringList.add(s8);
		stringList.add(s9);
		stringList.add(s10);
		stringList.add(s11);
		stringList.add(s12);
		stringList.add(s13);
		stringList.add(s14);
		
		
		Merger m1 = new Merger();
		
        assertEquals(stringList, m1.split(sentence," ") );
        
    }
	
	@Test
    public void testApp3()
    {
		Merger m1 = new Merger();
        String sentence = "I heard the pastor sing live verses easily.";
        
        assertEquals("I heard the pastor sing liverses easily.", m1.full(sentence));
    }
	
}
