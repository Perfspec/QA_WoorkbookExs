package com.qa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String output = new String();
		for(int i=0; i < input.length(); i++) {
			output += input.substring(i, i+1)
					+ input.substring(i, i+1)
					+ input.substring(i, i+1);
		}
		
		return output;
	}
	//
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "elivc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
		String output = new String();
		for(int i = 0; i < input.length(); i++) {
			
		}
		return "";
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
		List<Integer> trio = Arrays.asList(a,b,c);
		trio.stream().sorted().collect(Collectors.toList());
		Integer gap = trio.get(1)-trio.get(0);
		return gap.equals(trio.get(2)-trio.get(1));
	}

	// Given a string and an int n, return a string made of the first and last n
	// chars from the string. The string length will be at least n.

	// nTwice("Hello", 2) → "Helo"
	// nTwice("Chocolate", 3) → "Choate"
	// nTwice("Chocolate", 1) → "Ce"

	public String nTwice(String input, int a) {
		return "";
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("cooldev") → true
	// endsDev("jh") → false
	// endsDev("coolev") → false

	public boolean endsDev(String input) {
		return false;
	}



	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		int n = input.length();
		if(n == 1) {
			return 1;
		} else if(n>1) {
			String previous = input.substring(0,1);
			String current;
			Integer old;
			List<Integer> blockLengths = new ArrayList<Integer>();
			int blockIndex = 0;
			for(int i = 1; i < input.length(); i++) {
				current = input.substring(i, i+1);
				if(current.equals(previous)) {
					old = blockLengths.get(blockIndex);
					blockLengths.set(blockIndex, old+1);
				} else {
					blockIndex++;
					blockLengths.add(1);					
				}
				previous = current;
			}
			return max(blockLengths);
			
		} else {
			return 0;
		}
		

	}
	
	public int max(List<Integer> list) {
		Integer largest = 0;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) > largest) {
				largest = list.get(i);
			}
		}
		return largest;
	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") → 1
	//amISearch("I am in Amsterdam am I?") → 2
	//amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
		String[] inputs = arg1.split(" ");
		int counter = 0;
		for(int i = 0; i < inputs.length; i++) {
			switch(inputs[i]) {
			case "Am":
				counter++;
				break;
			case "am":
				counter++;
				break;
			case "AM":
				counter++;
				break;
			case "aM":
				counter++;
				break;
			}
		}
		return counter;
		
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) → "fizz"
	//fizzBuzz(10) → "buzz"
	//fizzBuzz(15) → "fizzbuzz"
	
	public String fizzBuzz(int arg1) {
		if(arg1%15==0) {
			return "fizzbuzz";
		} else if(arg1%5==0) {
			return "buzz";
		} else if(arg1%3==0) {
			return "fizz";
		} else
			return "";
		
	}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") → 14
	//largest("15 72 80 164") → 11
	//largest("555 72 86 45 10") → 15
	
	public int largest(String arg1) {
		String[] inputs = arg1.split(" ");
		String digits;
		int l = inputs.length;
		int[] sums = new int[l];
		for(int i = 0; i < l; i++) {
			digits = inputs[i];
			for(int j = 0; j < digits.length(); j++) {
				sums[i] +=  convert(digits.substring(i, i+1));
			}
		}
		return max(sums);
		
	}
	
	public int max(int[] arr) {
		int largest = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}
	
	public int convert(String a) {
		switch (a) {
		case "1":
			return 1;
		case "2":
			return 2;
		case "3":
			return 3;
		case "4":
			return 4;
		case "5":
			return 5;
		case "6":
			return 6;
		case "7":
			return 7;
		case "8":
			return 8;
		case "9":
			return 9;
		default:
			return 0;
		}
	}
	
	
}
