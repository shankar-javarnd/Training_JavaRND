/*******************************************************************************
Author : Shankar Thombare
Assignment 5 SET B
		Write a program to calculate the salary.
1.      In this program make the application capable of handling non-integer and negative values.

2.      Make a custom exception class which handles the non-integer and negative values for parameters in case of 
		calculating salary and prints the custom message
********************************************************************************/
package com.shankar.exceptionhandlig;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.shankar.exceptionhandlig.JavaAssignment5A.SimpleIntrest;

public class JavaAssignment5B {
	
	class Salary {
		double basicsalary, HRA, DA, GS, incometax, netsalary;
		int id;
		String name;
		
		public Salary(int id, String name, double basicsalary) {
			super();
			this.basicsalary = basicsalary;
			this.id = id;
			this.name = name;
		}

		public double calSalary() {  //calculating all the parameters
		
			HRA=(10.0/100.0)*basicsalary;
			HRA = ((10.0/100.0) * basicsalary);
	        DA=(73.0/100.0)*basicsalary;
	        GS=basicsalary+DA+HRA;
	        incometax=(30.0/100.0)*GS;
	        netsalary=GS-incometax;
	        return 0;
	    }
		
		public void display() {
			System.out.println("______________________________________________");
			System.out.println("\nEmployee ID : " + id);
			System.out.println("Employee Name : " + name);
			System.out.println("House rent allowance : " + HRA);
			System.out.println("Dearness allowance : " + DA);
			System.out.println("Gross Salary : " + GS);
			System.out.println("Proffesion Tax : " + incometax);
			System.out.println("\n__Neat Salary__ : " + netsalary);
			System.out.println("______________________________________________");
		}
	}

	public static void main(String[] args) {
		double bs;
		int id;
		String name;
		Scanner sc = new Scanner(System.in);
		JavaAssignment5B obj;
		JavaAssignment5B.Salary sal;
		
		try {
			System.out.print("Enter Employee Id : ");
			id = sc.nextInt();
			System.out.print("Enter Employee Name : ");
			name = sc.next();
			System.out.print("Enter Basic Salary : ");
			bs = sc.nextDouble();
			
			if (id < 0 || bs < 0 ) { //checking negative exception
				System.out.println("ksajksaj");
				throw new IllegalArgumentException("Input can not be Negative!!!");
			}
			
			obj = new JavaAssignment5B();
			//initializing inner class object
			sal = obj.new Salary(id, name, bs);
			
			//calling inner class method
			sal.calSalary();
			sal.display();
		} 
		catch ( InputMismatchException e )
		{
			System.out.println("Bad Input!!!");
		}

	}

}
