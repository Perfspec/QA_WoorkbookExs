package com.qa.LibraryTDD;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class AppTest {
	
    @Test
    public void testApp1()
    {
    	Item hat = new Item("WoolyHat");
        assertEquals("WoolyHat", hat.getName());
        hat.setName("Budge");
        assertEquals("Budge", hat.getName());
    }
    
    @Test
    public void testApp2()
    {
    	String lotrName = "The Lord of the Rings";
    	String lotrISBN = "978-0261103252";
    	Book lotr = new Book(lotrName, lotrISBN);
        assertEquals(lotrName, lotr.getName());
        assertEquals(lotrISBN, lotr.getISBN());
    }
    
    @Test
    public void testApp3()
    {
    	String lotrName = "The Lord of the Rings";
    	String lotrRating = "PG";
    	DVD lotr = new DVD(lotrName, lotrRating);
        assertEquals(lotrName, lotr.getName());
        assertEquals(lotrRating, lotr.getAgeRating());
    }
    
    @Test
    public void testApp4()
    {
    	String mapName = "Middle Earth";
    	String scale = "colossal";
    	Maps lotr = new Maps(mapName, scale);
        assertEquals(mapName, lotr.getName());
        assertEquals(scale, lotr.getMapScale());
    }
    
    @Test
    public void testApp5()
    {
    	String personName = "Ahilan";
    	String mapName = "Middle Earth";
    	String scale = "colossal";
    	Maps lotr = new Maps(mapName, scale);
    	Person alan = new Person(personName, lotr);
    	assertEquals(scale, ((Maps) alan.getItems().get(0)).getMapScale());
    	String lotrName = "The Lord of the Rings";
    	String lotrRating = "PG";
    	DVD lotr1 = new DVD(lotrName, lotrRating);
    	alan.addItem(lotr1);
    	assertEquals(lotrRating, ((DVD) alan.getItem(1)).getAgeRating());
    }
    
    @Test
    public void testApp6()
    {
    	String personName = "Ahilan";
    	String mapName = "Middle Earth";
    	String scale = "colossal";
    	Maps lotr = new Maps(mapName, scale);
    	String lotrName = "The Lord of the Rings";
    	String lotrRating = "PG";
    	DVD lotr1 = new DVD(lotrName, lotrRating);
    	ArrayList<Item> lotrList = new ArrayList<Item>();
    	
    	
    	lotrList.add(lotr);
    	lotrList.add(lotr1);
    	Person alan = new Person(personName, lotrList);
    	assertEquals(scale, ((Maps) alan.getItem(0)).getMapScale());
    	lotr1.setAgeRating("12");
    	alan.setItem(1,lotr1);
    	assertEquals("12", ((DVD) alan.getItem(1)).getAgeRating());
    }
}
