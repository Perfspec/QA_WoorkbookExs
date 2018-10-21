
public class PrintNums {
	
	public String printWordInt(int x) {
		if(x<0) {
			return "Non Positive ------------------------------";
		}
		else {
			String output = new String();
			int numHundreds = x/100;
			switch(numHundreds) {
			case 1:
				output += "one hundred ";
				break;
			case 2:
				output += "two hundred ";
				break;
			case 3:
				output += "three hundred ";
				break;
			case 4:
				output += "four hundred ";
				break;		
			case 5:
				output += "five hundred ";
				break;
			case 6:
				output += "six hundred ";
				break;
			case 7:
				output += "seven hundred ";
				break;
			case 8:
				output += "eight hundred ";
				break;
			case 9:
				output += "nine hundred ";
				break;
			}
			
			int rightmostTwoDigits = x%100;
			
			if(numHundreds > 0 && rightmostTwoDigits > 0) {
				output += "and ";
			}
			
			int numTens = rightmostTwoDigits/10;
			int rightmostDigit = x%10;
			
			switch(numTens) {
			case 1:
				switch(rightmostDigit) {
				case 0:
					output += "ten";

					break;
				case 1:
					output += "eleven";

					break;
				case 2:
					output += "twelve";
					break;
				case 3:
					output += "thirteen";
					break;
				case 4:
					output += "fourteen";
					break;
				case 5:
					output += "fifteen";
					break;
				case 6:
					output += "sixteen";
					break;
				case 7:
					output += "seventeen";
					break;
				case 8:
					output += "eightteen";
					break;
				case 9:
					output += "nineteen";
					break;
				}
				break;
			case 2:
				output += "twenty ";
				break;
			case 3:
				output += "thirty ";
				break;
			case 4:
				output += "fourty ";
				break;
			case 5:
				output += "fifty ";
				break;
			case 6:
				output += "sixty ";
				break;
			case 7:
				output += "seventy ";
				break;
			case 8:
				output += "eighty ";
				break;
			case 9:
				output += "ninety ";
				break;
			}
			
			if(numTens!=1) {
				
				switch(rightmostDigit) {
				case 1:
					output += "one";
					break;
				case 2:
					output += "two";
					break;
				case 3:
					output += "three";
					break;
				case 4:
					output += "four";
					break;
				case 5:
					output += "five";
					break;
				case 6:
					output += "six";
					break;
				case 7:
					output += "seven";
					break;
				case 8:
					output += "eight";
					break;
				case 9:
					output += "nine";
					break;
				}
			}
		}
	}
	
	public String printWordIntFromTo(int start, int stop) {
		String output = new String();
		if(start < stop) {
			for(int i = start; i <= stop; i++) {
				output += this.printWordInt(i);
			}
		} else {
			for(int i = stop; i <= start; i++) {
				output += this.printWordInt(i);
			}
		}
		return output;
	}
	
	

}
