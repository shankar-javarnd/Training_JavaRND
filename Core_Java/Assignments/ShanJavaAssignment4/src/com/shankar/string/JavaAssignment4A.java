/***********************************************************************
Author : Shankar Thombare.
ASSIGNMENT 4 SET A :
1--. Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return 
	 the string unchanged.
2--. Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
3--. Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths,
     omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
*************************************************************************************/

package com.shankar.string;

public class JavaAssignment4A {
	
	public static String delDel(String str) {	//delete substring function
		String description = str;//
        String replace = description.replace("del", "");
        System.out.println("Original String : " + description);
		    return replace;
	}
	
	public static String middleThree(String str) { //return middle 3 letters function 
		int len = str.length() / 2;
		System.out.println("Original String : " + str);
		return str.substring(len-1,len+2);
	}
	
	public static String minCat(String str1, String str2) { //minimum concatenation of two string function
		String s1 = null, s2 = null;
		int len1 = str1.length();
		int len2 = str2.length(); 
		System.out.println("Original Two Strings : " + str1 + " and "  +str2);
		if (str1.length() > str2.length()) {
			s1 = str1.substring(len1-len2);
			return (s1 + str2);
		}
		else if(str1.length() < str2.length()) {
			s2 = str2.substring(len2-len1);
			return (str1 + s2);
		}
		else {
			return str1 + str2;
		}
	}

	public static void main(String[] args) {
		System.out.println("______________________________________________");
		System.out.println("After Deleteing Del : " + delDel("adelHello"));
		System.out.println("______________________________________________");
		System.out.println("Middle Three Letters of String : " + middleThree("solving"));
		System.out.println("______________________________________________");
		System.out.println("Concatenation of two min Strings : " + minCat("java", "Hello"));
		System.out.println("______________________________________________");
	}

}
