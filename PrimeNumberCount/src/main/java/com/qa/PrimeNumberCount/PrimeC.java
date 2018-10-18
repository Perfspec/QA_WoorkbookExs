package com.qa.PrimeNumberCount;

import java.util.ArrayList;

public class PrimeC {

	public void updatePrimes(Integer lastToCheck, ArrayList<Integer> primes) {
		
		Integer numPrimes = primes.size();
		Integer previousEnd = numPrimes-1;
		if(lastToCheck > previousEnd) {
			boolean potentiallyPrime;
			Integer start = primes.get(previousEnd)+1;
			
		}
	}
	
	
	
	
}
