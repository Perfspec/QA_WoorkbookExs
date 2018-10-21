package com.qa.PrintNums;

public class PrintNumbers {
	
	public static String[] singles = {"one", "two", "three", "four", "five", "six", "seven", "eight",
			"nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
			"eighteen", "nineteen"};
	public static String[] tens = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	public static String[] powersOfTen = {"hundred", "thousand"};
	
	private int printThis;
	private int numThousands;
	private int numHundreds;
	private int rightmostTwoDigits;
	private int numTens;
	private int rightmostDigit;
	
	public PrintNumbers(int x) {
		set(x);
	}
	
	public int get() {
		return printThis;
	}
	
	public int getRD() {
		return rightmostDigit;
	}
	
	public int getR2D() {
		return rightmostTwoDigits;
	}
	
	public int getnumTens() {
		return numTens;
	}
	
	public int getnumHundreds() {
		return numHundreds;
	}
	
	public int getnumThousands() {
		return numThousands;
	}
	

	public void set(int x) {
		this.printThis = x;
		this.numThousands = x/1000;
		this.numHundreds = (x/100)%10;
		this.rightmostTwoDigits = x%100;
		this.numTens = (x/10)%10;
		this.rightmostDigit = x%10;
	}

	public String printWordInt() {
		if(printThis<1 || printThis >= 10000) {
			return "out of range";
		}
		else {
			String output = new String();
			return outSmalls(outHundreds(outThousands(output)));
		}
	}
	
	public String outSmalls(String input) {
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
									return input + " " + singles[j-1];
								}
							}
						}
					}
				}
			}
		}
		return input;
	}
		
	public String outHundreds(String input) {
		if(numHundreds > 0) {
			for(int i = 1; i<10; i++) {
				if(i==numHundreds) {
					input += singles[i-1] +" "+ powersOfTen[0];
					if(rightmostTwoDigits > 0) {
						input += " and ";
					}
					return input;
				}
			}
		}
		return input;
	}
	
	public String outThousands(String input) {
		if(numThousands > 0) {
			for(int i = 1; i<10; i++) {
				if(i==numThousands) {
					input += singles[i-1] +" "+ powersOfTen[1];
					if(printThis%1000 > 0) {
						if(numHundreds == 0) {
							input += " and";
						}
						input += " ";
					}
					return input;
				}
			}
			
		}
		return input;
	}
	
	
}
