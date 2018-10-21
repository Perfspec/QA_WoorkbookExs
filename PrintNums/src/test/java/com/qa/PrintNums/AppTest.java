package com.qa.PrintNums;

import static org.junit.Assert.*;
import org.junit.Test;


public class AppTest {
    
	@Test
    public void testPrint22()
    {
		int x = 22;
		PrintNumbers pn = new PrintNumbers(x);
		assertEquals("twenty two", pn.outSmalls(""));
    }
	
	@Test
    public void testPrint65()
    {
		int x = 65;
		PrintNumbers pn = new PrintNumbers(x);
		assertEquals("sixty five", pn.outSmalls(""));
    }
	
	@Test
    public void testPrint357()
    {
		int x = 357;
		PrintNumbers pn = new PrintNumbers(x);
		assertEquals("three hundred and ", pn.outHundreds(""));
    }
	
	@Test
	public void testPrint2357()
    {
		int x = 2357;
		PrintNumbers pn = new PrintNumbers(x);
		assertEquals("two thousand three hundred and fifty seven", pn.printWordInt());
    }
	
	@Test
    public void testApp2()
    {
		String expected = "one two three four five six seven eight nine ten eleven twelve";
    	PrintNumsInRange p = new PrintNumsInRange(1,12);
        assertEquals( expected, p.printWordInts() );
    }
	
	@Test
    public void testApp3()
    {
		String expected = "nineteen twenty twenty one twenty two";
    	PrintNumsInRange p = new PrintNumsInRange(19,22);
        assertEquals( expected, p.printWordInts() );
    }
	
	@Test
    public void testApp4()
    {
		String expected = "three hundred and eighteen three hundred and nineteen "
    			+ "three hundred and twenty "
    		 + "three hundred and twenty one three hundred and twenty two "
    		 + "three hundred and twenty three three hundred and twenty four "
    		 + "three hundred and twenty five three hundred and twenty six "
    		 + "three hundred and twenty seven three hundred and twenty eight";
		PrintNumsInRange p = new PrintNumsInRange(318,328);
        assertEquals( expected, p.printWordInts() );
    }
	
    
	
}