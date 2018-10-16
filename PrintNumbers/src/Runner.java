
public class Runner {
	public static void main(String[] args) {
		
		printWordIntFromTo(1,999);
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
			int y = x/100;
			switch(y) {
			case 1:
				System.out.print("one hundred ");
				break;
			case 2:
				System.out.print("two hundred ");
				break;
			case 3:
				System.out.print("three hundred ");
				break;
			case 4:
				System.out.print("four hundred ");
				break;		
			case 5:
				System.out.print("five hundred ");
				break;
			case 6:
				System.out.print("six hundred ");
				break;
			case 7:
				System.out.print("seven hundred ");
				break;
			case 8:
				System.out.print("eight hundred ");
				break;
			case 9:
				System.out.print("nine hundred ");
				break;
			}
			
			y = x%100;
			if(y>0) {
				System.out.print("and ");
			}
			
			int z = y/10;
			y = x%10;
			switch(z) {
			case 1:
				switch(y) {
				case 0:
					System.out.print("ten");

					break;
				case 1:
					System.out.print("eleven");

					break;
				case 2:
					System.out.print("twelve");
					break;
				case 3:
					System.out.print("thirteen");
					break;
				case 4:
					System.out.print("fourteen");
					break;
				case 5:
					System.out.print("fifteen");
					break;
				case 6:
					System.out.print("sixteen");
					break;
				case 7:
					System.out.print("seventeen");
					break;
				case 8:
					System.out.print("eightteen");
					break;
				case 9:
					System.out.print("nineteen");
					break;
				}
				break;
			case 2:
				System.out.print("twenty ");
				break;
			case 3:
				System.out.print("thirty ");
				break;
			case 4:
				System.out.print("fourty ");
				break;
			case 5:
				System.out.print("fifty ");
				break;
			case 6:
				System.out.print("sixty ");
				break;
			case 7:
				System.out.print("seventy ");
				break;
			case 8:
				System.out.print("eighty ");
				break;
			case 9:
				System.out.print("ninety ");
				break;
			}
			
			if(z!=1) {
				
				switch(y) {
				case 1:
					System.out.print("one");
					break;
				case 2:
					System.out.print("two");
					break;
				case 3:
					System.out.print("three");
					break;
				case 4:
					System.out.print("four");
					break;
				case 5:
					System.out.print("five");
					break;
				case 6:
					System.out.print("six");
					break;
				case 7:
					System.out.print("seven");
					break;
				case 8:
					System.out.print("eight");
					break;
				case 9:
					System.out.print("nine");
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
}
