package com.qa.PrimeNumberCount;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class AppTest {
	@Test
    public void testApp1()
    {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		PrimeC p = new PrimeC();
		int lastToCheck = 11;
		primes.add(2);
		primes.add(3);
		primes.add(5);
		primes.add(7);
		p.nextPrime(lastToCheck, primes);
		int expected = 5;
		assertEquals(expected, primes.size());
    }
	
	@Test
    public void testApp2()
    {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		PrimeC count = new PrimeC();
		int lastToCheck = 19;
		primes.add(2);
		primes.add(3);
		primes.add(5);
		primes.add(7);
		count.nextPrime(lastToCheck, primes);
		int expected = 8;
		assertEquals(expected, primes.size());
    }

}
