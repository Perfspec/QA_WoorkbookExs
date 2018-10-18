package com.qa.PrimeNumberCount;

import java.io.*;
import java.util.ArrayList;

public class App 
{
	
    public static void main( String[] args )
    {
    	File file = new File("primeList.txt");
    	
    	try(Writer writer = new FileWriter(file)) {
    		long startTime = System.nanoTime();    		
    		
    		ArrayList<Integer> primes = new ArrayList<Integer>();    		

    		Reader reader = new FileReader(file);
    		    		
    		PrimeC q = new PrimeC();
    		Integer lastToCheck = 19;
    		primes.add(2);
    		primes.add(3);
    		primes.add(5);
    		primes.add(7);
    		q.nextPrime(lastToCheck, primes);
    		for(Integer p : primes) {
    			writer.write(p.toString()+" ");
    		}
    		long endTime = System.nanoTime();
    		System.out.println((endTime-startTime)/1000000000);
    		writer.close();
    	} catch (IOException e) {
			e.printStackTrace();
		}		
    }
}
