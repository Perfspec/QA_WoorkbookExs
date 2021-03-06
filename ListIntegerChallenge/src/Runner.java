import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;


public class Runner {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5,9,8,12);
		iterateNumbers(numbers);
	}
	
	


	public static void printList(List<Integer> nums) {
		for(int i=0; i < nums.size(); i++) {
			int eachNum = nums.get(i);
			System.out.print(eachNum + " ");
		}
		System.out.println();
	}

	public static void iterateNumbers(List<Integer> nums) {
		int eachNum = 0;
		List<Integer> squared = new ArrayList();
		Set<Integer> uniqueNums = new HashSet<Integer>(nums);
		List<Integer> uniqueSquared = new ArrayList();
		for(int i=0; i < nums.size(); i++) {
			eachNum = nums.get(i);
			System.out.print(eachNum + " ");
		}
		System.out.println();
		for(int i=0; i < nums.size(); i++) {
			eachNum = nums.get(i);
			if(eachNum%2==0) {
				System.out.print(eachNum + " ");
			}
		}
		System.out.println();
		for(int i=0; i < nums.size(); i++) {
			eachNum = nums.get(i);
			System.out.print(eachNum*10 + " ");
		}
		System.out.println();
		
		
		
		System.out.println(Collections.max(nums));
		System.out.println(Collections.min(nums));
		
		
		for(int i=0; i < nums.size(); i++) {
			eachNum = nums.get(i);
			squared.add(i,eachNum*eachNum);
		}
		printList(squared);
		
		for( int k: uniqueNums) {
			uniqueSquared.add(k*k);
		}
		printList(uniqueSquared);
	}
	
}