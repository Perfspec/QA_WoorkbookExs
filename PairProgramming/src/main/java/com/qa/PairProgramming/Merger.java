package com.qa.PairProgramming;

import java.util.ArrayList;

public class Merger {

	public String merge(String s1, String s2) {
		if(s1.length() > 1 && s2.length() > 1) {
			char s1_nminus2 = s1.charAt(s1.length()-2);
			char s1_nminus1 = s1.charAt(s1.length()-1);
			char s2_0 = s2.charAt(0);
			char s2_1 = s2.charAt(1);
			
			if(s1_nminus2 == s2_0 && s1_nminus1 == s2_1) {
			return s1.substring(0, s1.length()-2)+s2;
			} else {
				return s1 + " " + s2;
			}
		} else {
			return s1 + " " + s2;
		}
		
	}

	public ArrayList<String> split(String sentence, String string) {
		
		String[] array = sentence.split(" ");
		ArrayList<String> aList = new ArrayList<String>();
		for(String s : array) {
			aList.add(s);
		}
		
		return aList;
	}

	public String full(String sentence) {
		ArrayList<String> aList = this.split(sentence," ");
		String s = aList.get(0);
		for(int i = 1; i < aList.size(); i++) {
			s = this.merge(s, aList.get(i));
		}
		
		return s;
	}

}
