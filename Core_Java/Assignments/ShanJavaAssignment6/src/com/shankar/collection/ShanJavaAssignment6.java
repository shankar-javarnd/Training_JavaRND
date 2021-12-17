/*********************************************************************************
Author : Shankar Thombare
Assignment 6 : Collections Framework -
1. Student Details [ArrayList]
2. Product Details [Hash Table]
3. Employee Details [Vector]
4. Print Full Name [Vector]
5. Phone Book [HashMap]\n6. Exit"
********************************************************************************/
package com.shankar.collection;
import java.util.*;

public class ShanJavaAssignment6 {
	public void mainMenu(){
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("\n==================Collection Framework==================");
			System.out.println("\n1. Student Details [ArrayList]\n2. Product Details [Hash Table]\n3. Employee Details [Vector]\n4. Print Full Name [Vector]\n5. Phone Book [HashMap]\n6. Exit");
			System.out.print("\nEnter Your Choice : ");
			int ch = sc.nextInt();
			
			switch(ch) {
				case 1:
					new StudentArrayList();
					break;
				case 2:
					new ProductHashTable();
					break;
				case 3:
					new EmployeeVector();
					break;
				case 4:
					new FullNameVector();
					break;
				case 5:
					new PhoneBookHashMap();
					break;
				case 6:
					System.exit(0);
					break;
				default :
					System.out.println("Enter Correct Choice!!!");
			}
		}
	}
	public static void main(String[] args) {
		ShanJavaAssignment6 obj = new ShanJavaAssignment6();
		obj.mainMenu();
	}

}
