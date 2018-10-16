
public class Runner {
	public static void main(String[] args) {
		int A = 1002;
		
		
	}
	
	public static int dependsFunction(int a, int b, boolean choice) {
		if (choice) {
			return a+b;
		} else {
			return a*b;
		}
	}
	
	public static void dependsPrintInt(int a, int b, boolean choice) {
		if (choice) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
	
	public static void dependsPrintChar(char a, char b, boolean choice) {
		if (choice) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}
	
	public static void dependsPrintMixed(int a, char b, boolean choice) {
		if (choice) {
			System.out.println(a);
		} else {
			System.out.println(b);
		}
	}

}
