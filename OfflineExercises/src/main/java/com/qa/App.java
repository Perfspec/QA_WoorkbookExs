package com.qa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	List<Integer> trio = Arrays.asList(4,6,2);
		System.out.println(trio.stream().sorted().collect(Collectors.toList()));
		System.out.println(trio.stream().sorted().collect(Collectors.toList()) instanceof List<?>);
    }
}
