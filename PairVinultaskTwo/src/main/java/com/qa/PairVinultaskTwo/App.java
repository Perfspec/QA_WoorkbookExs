package com.qa.PairVinultaskTwo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String toDecrypt = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. /" +
    			" --. --- --- -.. / .-.. ..- -.-. -.- / " +
    			"--- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--";
    	
    	Morse m = new Morse();
    	System.out.println(m.toEnglish(toDecrypt));
    	
    	String toEncrypt = "VINUL IS AWESOME";
    	System.out.println(m.toMorse(toEncrypt));
    	System.out.println(m.toEnglish(m.toMorse(toEncrypt)));
    	
    }
}
