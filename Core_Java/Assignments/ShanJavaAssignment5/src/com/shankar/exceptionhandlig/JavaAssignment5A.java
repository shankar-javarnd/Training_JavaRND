/*******************************************************************************
Author : Shankar Thombare
Assignment 5 SET A
		Write a program to calculate the simple interest.
1.      In this program make the application capable of handling non-integer and negative values.
2.      Make a custom exception class which handles the non-integer and negative values for parameters in case of 
		calculating Simple Interest and prints the custom message
*****************************************************************************/
package com.shankar.exceptionhandlig;
import java.util.*;

public class JavaAssignment5A {
	
	class SimpleIntrest{ //inner class
		double si, p = 0, r = 0, t = 0;
		//inner class constructor
		public SimpleIntrest(double p, double r, double t) {
			super();
			this.p = p;
			this.r = r;
			this.t = t;
		}
		
		double calSimpleInterest() { //function for calculating simple interest
			si = ((p * r * t) / 100);
			return si;
		} 
		
	}

	public static void main(String[] args) { //main method
		double pa, r, t;
		Scanner sc = new Scanner(System.in);
		JavaAssignment5A obj;
		JavaAssignment5A.SimpleIntrest sio;
		
		try {
			System.out.print("Enter Principal Amount : ");
			pa = sc.nextDouble();
			System.out.print("Enter Rate per Annum : ");
			r = sc.nextDouble();
			System.out.print("Enter Number of Years : ");
			t = sc.nextDouble();
			
			if (pa < 0 || r < 0 || t < 0) { //checking negative exception
				System.out.println("ksajksaj");
				throw new IllegalArgumentException("Input can not be Negative!!!");
			}
			
			obj = new JavaAssignment5A();
			//initializing inner class object
			sio = obj.new SimpleIntrest(pa, r, t);
			
			//calling inner class method
			System.out.println("\nSimple Interest : " + sio.calSimpleInterest());
		} 
		catch ( InputMismatchException e )
		{
			System.out.println("Bad Input!!!");
		}
	}

}
