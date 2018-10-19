package com.qa.PrimeRecursiveCounter;

public class App 
{
    public static void main( String[] args )
    {
    	PrimeRecursive pr = new PrimeRecursive();
    	long startTime = System.nanoTime();
    	System.out.println(pr.countPrimes(30000));
    	long endTime = System.nanoTime();
		System.out.println((endTime-startTime)/1000000);
    }
}
