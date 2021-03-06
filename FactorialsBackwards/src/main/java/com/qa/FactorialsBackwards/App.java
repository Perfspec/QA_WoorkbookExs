package com.qa.FactorialsBackwards;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println(reverse(3628800));
        System.out.println(reverse(479001600));
        System.out.println(reverse(6));
        System.out.println(reverse(18));
    }
    
    public static String reverse(Integer x) {
    	Integer currentValue = x;
    	Integer nextValue;
    	Integer counter = 2;
    	while(currentValue > 1) {
    	
    		nextValue =  currentValue/counter;
    		if(counter*nextValue == currentValue) {
    			counter++;
    			currentValue = nextValue;
    		} else {
    			return "NONE";
    		}    		
    	}
    	counter--;
    	return counter.toString()+"!";
    }
    
    
}
