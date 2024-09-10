package org.sample;

import java.util.Iterator;

public class prsctice {
	
	public static void main(String[]args) {
		String word = "3456";
		String word2 = "";
		for (int i = word.length()-1; i <= 0; i--) {
			word2 = word2+ word.charAt(i);
			
		}
		System.out.println(word2);
}    
	
	
}
	