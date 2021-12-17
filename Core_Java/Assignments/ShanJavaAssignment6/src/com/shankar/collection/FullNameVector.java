package com.shankar.collection;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class FullNameVector {
	String fname, lname;
	Vector<FullNameVector> fullname = new Vector<FullNameVector>();

	public FullNameVector() {
		empMenu();
	}
	
	public FullNameVector(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	
	public void addName(FullNameVector name) {
		fullname.add(name);
	}
	
	public void display() {
		int records = 0;
		System.out.println("\n________________________________________________________\n");
		System.out.println("\nFull Name List");
		System.out.println("\n________________________________________________________\n");
		for (FullNameVector obj : fullname) {
        	System.out.println(obj.fname + " " + obj.lname);
        	records++;
        }
		System.out.println("\n________________________________________________________\n");
		System.out.println("\n||  Total Number of Name Records : " + records + "   ||");
		System.out.println("\n________________________________________________________\n");
	}
	
	public void empMenu() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\n==========Full Name Details[Vector]==========");
			System.out.println("\n1. Add Names\n2. Display \n3. Back to Main Menu\n4. Exit");
			System.out.print("\nEnter your choice : ");
			int ch = sc.nextInt();
			switch(ch) {
				case 1 : 
					System.out.print("\nEnter First Name : ");
					String fname = sc.next();
					System.out.print("Enter Last Name : ");
					String lname = sc.next();
					FullNameVector name = new FullNameVector(fname, lname);
					addName(name);
					break;
				case 2:
					display();
					break;
				case 3:
					ShanJavaAssignment6 obj = new ShanJavaAssignment6();
					obj.mainMenu();
				case 4:
					System.exit(0);
				default :
					System.out.println("Enter Cprrect Choice!!!");
			}
		}   
	}
}
