/***********************************************************************
Author : Shankar Thombare.
ASSIGNMENT 4 SET B :
1.	Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo". 

2.	Given a non-empty string and an int n, return a new string where the char at index n has been removed. 
	The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive). 

3.	Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien". 

*************************************************************************************/
package com.shankar.string;

public class JavaAssignment4B {
	
	public static String stringBits(String str) { //function for Deletion of Every other character
		System.out.println("Original String : " + str);
	    int len = str.length();
	    String temp = "";
	    for (int i = 0; i < len; i = i + 2) {
	    	temp += str.charAt(i);
	    	}
	    return temp;
	}
	
	public static String missingChar(String str, int n) { ////function for removing char at index
		System.out.println("Original String : " + str);
		return str.substring(0,n) + str.substring(n+1,str.length());
	}

	public static String altPairs(String str) { //function for string made of the chars at indexes 0,1, 4,5, 8,9 ... so
		String result = "";
		System.out.println("Original String : " + str);
		for (int i=0; i<str.length(); i += 4) {
			int end = i + 2;
		    if (end > str.length()) {
		    	end = str.length();
		    }
		    result = result + str.substring(i, end);
		}
		return result;
	}


	public static void main(String[] args) {
		System.out.println("______________________________________________");
		System.out.println("After Deleteing Every other character : " + stringBits("Heeololeo"));
		System.out.println("______________________________________________");
		System.out.println("After Removing character at given Index : " + missingChar("kitten", 4));
		System.out.println("______________________________________________");
		System.out.println("String at indexes 0,1, 4,5, 8,9  and so : " + altPairs("CodingHorror"));
		System.out.println("______________________________________________");
	}

}
