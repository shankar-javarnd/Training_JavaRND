/***********************************************************************
Author : Shankar Thombare.
ASSIGNMENT 4 SET C :

1.      Return true if the given string contains between 1 and 3 'e' chars. 

2.      Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". 
		The original string will be length 1 or more. 

3.      Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx". 
*************************************************************************************/
package com.shankar.string;

public class JavaAssignment4C {
	public static boolean stringE(String str) {// function for counting 'e' in given string
		int len = str.length();
		int counter = 0;
		System.out.println("\nOriginal String : " + str);
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == 'e')
				counter++;
		}
		if (counter >= 1 && counter <= 3)
			return true;
		else
			return false;
	}
	
	public static String backAround(String str) { //function for adding last char of given string to first and last 
		System.out.println("\nOriginal String : " + str);
		char temp = str.charAt(str.length() - 1);
		return temp + str + temp;
	}
	
	public static int countXX(String str) {//function for counting XX in given string 
		int count = 0;
		System.out.println("\nOriginal String : " + str);
		for (int i = 0; i < str.length()-1; i++) {
			if (str.substring(i, i+2).equals("xx")) 
				count++;
		}
		return count;
	}


	public static void main(String[] args) {
		System.out.println("______________________________________________");
		System.out.println("String contains between 1 and 3 'e' chars : " + stringE("Heelle"));
		System.out.println("String contains between 1 and 3 'e' chars : " + stringE("Heelele"));
		System.out.println("______________________________________________");
		System.out.println("After Adding last char at first and last : " + backAround("Hello"));
		System.out.println("______________________________________________");
		System.out.println("Counting XX in Given string : " + countXX("xxxx") );
		System.out.println("______________________________________________");
	}

}
