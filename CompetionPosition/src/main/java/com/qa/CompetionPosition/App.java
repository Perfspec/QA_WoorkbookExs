package com.qa.CompetionPosition;

public class App {
	public static void main(String[] args) {
		
		printWordIntFromToSkip(1,100, 10);
	}
	
	public static void printIntFromTo(int start, int stop) {
		if(start < stop) {
			for(int i = start; i <= stop; i++) {
				System.out.println(i);
			}
		} else {
			for(int i = stop; i <= start; i++) {
				System.out.println(i);
			}
		}
	}

	
	public static void printWordInt(int x) {
		if(x<0) {
			System.out.println("Non Positive");
		}
		else { 
			int y = x%10;
			
			int z = x/10;
			if(x==100) {
				System.out.println("one hundredth");
			}
			
			switch(z) {
			case 1:
				switch(y) {
				case 0:
					System.out.print("tenth");

					break;
				case 1:
					System.out.print("eleventh");

					break;
				case 2:
					System.out.print("twelfth");
					break;
				case 3:
					System.out.print("thirteenth");
					break;
				case 4:
					System.out.print("fourteenth");
					break;
				case 5:
					System.out.print("fifteenth");
					break;
				case 6:
					System.out.print("sixteenth");
					break;
				case 7:
					System.out.print("seventeenth");
					break;
				case 8:
					System.out.print("eightteenth");
					break;
				case 9:
					System.out.print("nineteenth");
					break;
				}
				break;
			case 2:
				if(y == 0) {
					System.out.print("twentieth ");
				} else {
					System.out.print("twenty ");
				}
				
				break;
			case 3:
				if(y == 0) {
					System.out.print("thirtieth ");
				} else {
					System.out.print("thirty ");
				}
				break;
			case 4:
				if(y == 0) {
					System.out.print("fourtieth ");
				} else {
					System.out.print("fourty ");
				}
				break;
			case 5:
				if(y == 0) {
					System.out.print("fiftieth ");
				} else {
					System.out.print("fifty ");
				}
				break;
			case 6:
				if(y == 0) {
					System.out.print("sixtieth ");
				} else {
					System.out.print("sixty ");
				}
				break;
			case 7:
				if(y == 0) {
					System.out.print("seventieth ");
				} else {
					System.out.print("seventy ");
				}
				break;
			case 8:
				if(y == 0) {
					System.out.print("eightieth ");
				} else {
					System.out.print("eighty ");
				}
				break;
			case 9:
				if(y == 0) {
					System.out.print("ninetieth ");
				} else {
					System.out.print("ninety ");
				}
				break;
			}
			
			if(z!=1) {
				
				switch(y) {
				case 1:
					System.out.print("first");
					break;
				case 2:
					System.out.print("second");
					break;
				case 3:
					System.out.print("third");
					break;
				case 4:
					System.out.print("fourth");
					break;
				case 5:
					System.out.print("fifth");
					break;
				case 6:
					System.out.print("sixth");
					break;
				case 7:
					System.out.print("seventh");
					break;
				case 8:
					System.out.print("eighth");
					break;
				case 9:
					System.out.print("nineth");
					break;
				}
			}
		}
	System.out.println();
	}
	
	public static void printWordIntFromTo(int start, int stop) {
		if(start < stop) {
			for(int i = start; i <= stop; i++) {
				printWordInt(i);
			}
		} else {
			for(int i = stop; i <= start; i++) {
				printWordInt(i);
			}
		}
	}
	
	public static void printWordIntFromToSkip(int start, int stop, int skip) {
		if(start < stop) {
			for(int i = start; i <= stop; i++) {
				if(i!= skip) {

					printWordInt(i);
				}
			}
		} else {
			for(int i = stop; i <= start; i++) {
				if(i!= skip) {

					printWordInt(i);
				}
			}
		}
	}
}