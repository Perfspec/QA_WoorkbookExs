package com.qa.CountLettersInWordNums;

import static org.junit.Assert.*;
import org.junit.Test;


public class AppTest {
    
	@Test
    public void testPrint22()
    {
		int x = 22;
		CountWordNumbers cwn = new CountWordNumbers(x);
		// "twenty two" has 9 
		assertEquals(9, cwn.outSmalls(0));
    }
	
	@Test
    public void testPrint65()
    {
		int x = 65;
		int y = 79;
		CountWordNumbers cwn = new CountWordNumbers(x);
		// "sixty five" has 9 
		assertEquals(9+y, cwn.outSmalls(y));
    }
	
	@Test
    public void testPrint357()
    {
		int x = 357;
		int y = 10002;
		CountWordNumbers cwn = new CountWordNumbers(x);
		// "three5 hundred12 and15 fifty20 seven25" has 25 
		assertEquals(25+y, cwn.countWordNum(y));
    }
	
	@Test
	public void testPrint2357()
    {
		int x = 2357;
		CountWordNumbers cwn = new CountWordNumbers(x);
		// "two3 thousand11" has 11
		assertEquals(11, cwn.outThousands(0));
    }
	
	@Test
	public void testPrint2357Whole()
    {
		int x = 2357;
		CountWordNumbers cwn = new CountWordNumbers(x);
		// "two3 thousand11 three16 hundred23 and26 fifty31 seven36" has 36
		assertEquals(36, cwn.countWordNum(0));
    }
	
	@Test
    public void testApp2()
    {
		int expected = 51;
		// "one3 two6 three11 four15 five19 six22 seven27 eight32 nine36 ten39 eleven45 twelve51";
    	CountWordNumsIn cwni = new CountWordNumsIn(1,12);
        assertEquals( expected, cwni.total() );
    }
	
	@Test
    public void testApp3()
    {
		int expected = 32;
		//"nineteen8 twenty14 twenty20 one23 twenty29 two32";
		CountWordNumsIn cwni = new CountWordNumsIn(19,22);
        assertEquals( expected, cwni.total() );
    }
	
	@Test
    public void testApp4()
    {
		int expected = 92+44;
		//"three hundred and nineteen three hundred and twenty three hundred and twenty one three hundred and twenty two "
		CountWordNumsIn cwni = new CountWordNumsIn(2319,2322);
        assertEquals( expected, cwni.total() );
    }
	
	@Test
    public void testApp5()
    {
		int expected = 6;
		// "one two" are all that are counted if start >= stop
		CountWordNumsIn cwni = new CountWordNumsIn(400,50);
        assertEquals( expected, cwni.total() );
    }
}
