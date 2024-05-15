package com.dgmf.a.java.basics;

public class Variable {	
	public static void main(String[] args) {
		/*
		Variable must :
			- begin by a Letter or Underscore (_)
			- not have Special Character
		*/
		int x; // Declaration
		x = 34; // Assignment
		System.out.println(x);
		
		x = 234;
		System.out.println(x);
		
		String words;
		words = "This is a Sentence";
		System.out.println(words);
		
		int _intValue = 15; // Declaration and Assignment
		System.out.println(_intValue);
		
		// Operators
		System.out.println(x + 4);	
		System.out.println(x - 4);	
		System.out.println(x * 4);	
		System.out.println(x / 4);	
		
		System.out.println(words + ". These are some more Words."); // Concatenation
		// Error => The operator - is undefined for the argument type(s) java.lang.String
		// System.out.println(words - ". These are some more Words.");
		
	}
}
