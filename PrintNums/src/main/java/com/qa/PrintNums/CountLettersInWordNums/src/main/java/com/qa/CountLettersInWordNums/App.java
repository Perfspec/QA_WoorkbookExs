package com.qa.CountLettersInWordNums;



public class App 
{
    public static void main( String[] args )
    {
    	CountWordNumsIn cwni = new CountWordNumsIn(1,1000);
        
        System.out.println( cwni.total() );
    }
}
