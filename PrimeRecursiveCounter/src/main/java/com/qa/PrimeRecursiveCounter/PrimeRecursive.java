package com.qa.PrimeRecursiveCounter;

import java.util.ArrayList;

public class PrimeRecursive {
	
	private boolean potentiallyPrime;
	
	public void addUntil(Integer stop) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		primes.add(3);
		primes.add(5);
		primes.add(7);
		int current = 11;
		while(current <= stop) {
			primes.add(nextPrime(current, primes));
		}
		System.out.println(primes.size());
	}
	
	public Integer nextPrime(Integer current, ArrayList<Integer> primes) {
	
		potentiallyPrime = true;
		innerloop:
			for(Integer p : primes) {
				if(current%p==0) {
					potentiallyPrime = false;
					break innerloop;
				}
			}
		if(potentiallyPrime) {
			return current;
		} else {
			return nextPrime(++current,primes);
		}		
	}

}
