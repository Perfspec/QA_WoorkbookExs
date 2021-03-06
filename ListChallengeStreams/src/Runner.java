import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5,9,8,12);
		printList(evenList(numbers));
		printList(multipliedList(10,numbers));
		System.out.println(sortedList(numbers).get(numbers.size()-1));
		System.out.println(sortedList(numbers).get(0));
		printList(squaredList(numbers));
		printList(distinctSquaredList(numbers));
		

	}
	public static void printList(List<Integer> nums) {
		nums.stream().forEach(n ->System.out.printf("%s ", n));
		System.out.println();
	}

	public static List<Integer> evenList(List<Integer> nums) {
		return nums.stream().filter(n -> n%2==0).collect(Collectors.toList());
	}
	
	public static List<Integer> multipliedList(int k,List<Integer> nums) {
		return nums.stream().map(n -> n*k).collect(Collectors.toList());
	}
	
	public static List<Integer> squaredList(List<Integer> nums) {
		return nums.stream().map(n -> n*n).collect(Collectors.toList());
	}
	
	public static List<Integer> sortedList(List<Integer> nums) {
		return nums.stream().sorted().collect(Collectors.toList());
	}
	
	public static List<Integer> distinctSquaredList(List<Integer> nums) {
		return nums.stream().distinct().map(n -> n*n).collect(Collectors.toList());
	}
}