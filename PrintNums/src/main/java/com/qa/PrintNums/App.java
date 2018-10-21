package com.qa.PrintNums;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int x = 22;
    	PrintNumsInRange p = new PrintNumsInRange(1,1000);
    	
		String[] words = p.printWordInts().split(" ");
		int output = 0;
		for(String w : words) {
			output+=w.length();
		}
		System.out.println(output);
    }
}
