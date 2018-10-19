package com.qa.PrimeRecursiveCounter;

public class PrimeRecursive {
	
	public int countPrimes(int stop) {
		int primeCounter=0;
		for(int current = 2; current <= stop; current++) {
			if(checkPrime(current)) {
				primeCounter++;
			}
		}
		return primeCounter;
	}
	
	public boolean checkPrime(int subject) {
		return	(rPrime(subject, subject-1)==1);
	}
	
	public static int rPrime(int n, int i) {
		if(i==1)
			return 1;
		else if(n%i==0)
			return 0;
		else
			return rPrime(n,i-1);
	}

}
