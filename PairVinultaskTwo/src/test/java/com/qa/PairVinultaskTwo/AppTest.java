package com.qa.PairVinultaskTwo;

import static org.junit.Assert.*;
import org.junit.Test;
public class AppTest {
	
	@Test
    public void testApp()
    {
    	Morse m1 = new Morse();
    	assertEquals("SOS", m1.toEnglish("... --- ..."));
    	assertEquals("... --- ...", m1.toMorse("SOS"));
        
    }
}
