import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
	public static void main(String[] args) {
		printList(listFromTo(100,999).stream().map(n -> n*10).collect(Collectors.toList()));
	}

	public static int[] createArray(int length) {
		int[] nums = new int[length];
		for(int k = 0; k <100; k++) {
			nums[k] = k+1;
		}
		return nums;
	}
	
	public static List<Integer> listFromTo(int start, int stop){
		List<Integer> numbers = new ArrayList<>();
		for(int i = start; i <=stop; i++) {
			numbers.add(i);
		}
		return numbers;
	}
	
	public static void printList(List<Integer> nums) {
		nums.stream().forEach(n ->System.out.printf("%s ", n));
		System.out.println();
	}
	
}
