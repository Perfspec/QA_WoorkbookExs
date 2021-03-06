
import java.util.function.BiFunction;
public class Runner {
	public static void main(String[] args) {
		
		BiFunction<Integer,Integer,Integer> add = (a,b) -> a+b;
		BiFunction<Integer,Integer,Integer> subt = (a,b) -> a-b;
		BiFunction<Integer,Integer,Integer> mult = (a,b) -> a*b;
		BiFunction<Integer,Integer,Integer> divd = (a,b) -> a/b;
		
//		System.out.println(add.apply(10,5));
		
		MathOperation addition = (i , j) -> i + j;
		
		MathOperation subtraction = (i , j) -> i - j;
		
		System.out.println(binaryOperations(10, 10, addition));
		
		System.out.println(binaryOperations(10, 10, subtraction));
		
		System.out.println(binaryOperations(10, 10, mult));
		
		
		
	}
	public static int binaryOperations(int a, int b, MathOperation iSwitch) {
		return iSwitch.opera(a, b);
	}

	
	public static Object binaryOperations(int a, int b, BiFunction iSwitch) {
		return iSwitch.apply(a, b);
	}

}
