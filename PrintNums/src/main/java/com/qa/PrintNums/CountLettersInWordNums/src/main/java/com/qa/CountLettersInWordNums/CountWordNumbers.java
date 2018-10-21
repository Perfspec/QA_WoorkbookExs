package com.qa.CountLettersInWordNums;

public class CountWordNumbers {

	public static int[] singles = {3, 3, 5, 4, 4, 3, 5, 5, 4, 3,
								   6, 6, 8, 8, 7, 7, 9,	8, 8};
	public static int[] tens = {6, 6, 5, 5, 5, 7, 6, 6};
	public static int[] powersOfTen = {7, 8};
	
	private int countThis;
	private int numThousands;
	private int numHundreds;
	private int rightmostTwoDigits;
	private int numTens;
	private int rightmostDigit;
	
	public CountWordNumbers(int x) {
		set(x);
	}

	public int get() {
		return countThis;
	}

	public int getNumThousands() {
		return numThousands;
	}


	public int getNumHundreds() {
		return numHundreds;
	}
	
	public int getNumTens() {
		return numTens;
	}
	
	public int getRD() {
		return rightmostDigit;
	}
	
	public int getR2D() {
		return rightmostTwoDigits;
	}

	public void set(int x) {
		this.countThis = x;
		this.numThousands = x/1000;
		this.numHundreds = (x/100)%10;
		this.rightmostTwoDigits = x%100;
		this.numTens = (x/10)%10;
		this.rightmostDigit = x%10;
	}

	public int outSmalls(int input) {
		if(rightmostTwoDigits > 0) {
			if(numTens < 2) {
				for(int i = 0; i<20; i++) {
					if(i==rightmostTwoDigits) {
						return (input + singles[i-1]);
					}
				}
			} else {
				for(int i = 2; i<10; i++) {
					if(i==numTens) {
						input += tens[i-2];
						if(0==rightmostDigit) {
							return input;
						} else {
							for(int j = 1; j<10; j++) {
								if(j==rightmostDigit) {
									return input + singles[j-1];
								}
							}
						}
					}
				}
			}
		}
		return input;
	}

	public int outHundreds(int input) {
		if(numHundreds > 0) {
			for(int i = 1; i<10; i++) {
				if(i==numHundreds) {
					input += singles[i-1] + powersOfTen[0];
					if(rightmostTwoDigits > 0) {
						input += 3;
					}
					return input;
				}
			}
		}
		return input;
	}

	public int outThousands(int input) {
		if(numThousands > 0) {
			for(int i = 1; i<10; i++) {
				if(i==numThousands) {
					input += singles[i-1] + powersOfTen[1];
					if(countThis%1000 > 0) {
						if(numHundreds == 0) {
							input += 3;
						}

					}
					return input;
				}
			}
			
		}
		return input;
	}

	public int countWordNum(int input) {
		if(countThis<1 || countThis >= 10000) {
			return input;
		}
		else {
			return outSmalls(outHundreds(outThousands(input)));
		}
	}

}
