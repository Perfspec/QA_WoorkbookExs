
public class Runner2 {
	
	public static void main(String[] args) {
		
		System.out.println(add(2,4));
		System.out.println(subt(2,4));
		System.out.println(mult(2,4));
		System.out.println(divd(2,4));
		System.out.println(binaryOperations(2,4,0));
		System.out.println(binaryOperations(2,4,1));
		System.out.println(binaryOperations(2,4,2));
		System.out.println(binaryOperations(2,4,3));
		System.out.println(binaryOperations(2,4,50));
		System.out.println(divd(2.0,4.0));
		division(6,7);
	}
	
	public static int add(int a, int b) {
		
		return a+b;
	}
	
	public static int subt(int a, int b) {
		
		return a-b;
	}
	
	public static int mult(int a, int b) {
		
		return a*b;
	}
	
	public static int divd(int a, int b) {
		
		return a/b;
	}

	public static void division(int a, int b) {
		
		if(a>b) { System.out.println(a/b);}
		else System.out.println("error: " + a + " is not greater than "+ b);
	}
	
	public static int binaryOperations(int a, int b, int iSwitch) {
		switch(iSwitch) {
		case 0:
			return add(a,b);
			
		case 1:
			return subt(a,b);
		
		case 2:
			return mult(a,b);
			
		case 3:
			return divd(a,b);
			
		default:
			return 0;
		}
	}
	
	
	
	public static double divd(double a, double b) {
		
		return a/b;
	}
	
}