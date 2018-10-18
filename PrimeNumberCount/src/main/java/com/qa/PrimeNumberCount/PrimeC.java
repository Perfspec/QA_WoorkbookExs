package com.qa.PrimeNumberCount;

import java.util.ArrayList;

public class PrimeC {

	public void nextPrime(Integer lastToCheck, ArrayList<Integer> primes) {
		
		Integer numPrimes = primes.size();
		Integer previousEnd = numPrimes-1;
		if(lastToCheck > previousEnd) {
			boolean potentiallyPrime;
			Integer start = primes.get(previousEnd)+1;
			for(Integer i=start; i<=lastToCheck; i++) {
				potentiallyPrime = true;
				innerloop:
					for(Integer p : primes) {
						if(i%p==0) {
							potentiallyPrime = false;
							break innerloop;
						}
					}
				if(potentiallyPrime) {
					primes.add(i);
					numPrimes++;
				}
			}
		}
	}
	
	public ArrayList<Integer> updatePrimes(Integer lastToCheck, ArrayList<Integer> primes) {
		
		Integer numPrimes = primes.size();
		Integer previousEnd = numPrimes-1;
		if(lastToCheck > previousEnd) {
			boolean potentiallyPrime;
			Integer start = primes.get(previousEnd)+1;
			for(Integer i=start; i<=lastToCheck; i++) {
				potentiallyPrime = true;
				innerloop:
					for(Integer p : primes) {
						if(i%p==0) {
							potentiallyPrime = false;
							break innerloop;
						}
					}
				if(potentiallyPrime) {
					primes.add(i);
					numPrimes++;
				}
			}
		}
		return primes;
	}
}
