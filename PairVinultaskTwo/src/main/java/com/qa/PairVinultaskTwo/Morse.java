package com.qa.PairVinultaskTwo;

import java.util.ArrayList;

public class Morse {
	
	String[][] keyArray = {
			{" ",	"/"},
			{"A",   ".-"},
			{"B",	"-..."},
			{"C",	"-.-."},
			{"D",	"-.."},
			{"E",	"."},
			{"F",	"..-."},
			{"G",	"--."},
			{"H",	"...."},
			{"I",    ".."},
			{"J",	".---"},
			{"K",	"-.-"},
			{"L",	".-.."},
			{"M",	"--"},
			{"N",	"-."},
			{"O",	"---"},
			{"P",	".--."},
			{"Q",	"--.-"},
			{"R",	".-."},
			{"S",	"..."},
			{"T",	"-"},
			{"U",	"..-"},
			{"V",	"...-"},
			{"W",	".--"},
			{"X",	"-..-"},
			{"Y",	"-.--"},
			{"Z",	"--.."}, };

	public String toEnglish(String sentence) {
		String result = "";
		String[] array = sentence.split(" ");
		for(String s : array) {
			for (int i = 0; i < 27; i++) {
				  if(keyArray[i][1].equals(s)) {
					  result += keyArray[i][0];
					  break;
				  }
			  }
		}
		
	  
		
		return result;
	} 
	
	public String toMorse(String sentence) {
		String result = "";
		String[] array = sentence.split("");
		for(String s : array) {
			for (int i = 0; i < 27; i++) {
				  if(keyArray[i][0].equals(s)) {
					  result += keyArray[i][1] + " ";
					  break;
				  }
			  }
		}
		
	  
		
		return result;
	} 
}
