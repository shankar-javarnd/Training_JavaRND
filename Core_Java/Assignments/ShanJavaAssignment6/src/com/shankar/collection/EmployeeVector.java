package com.shankar.collection;

import java.util.*;

public class EmployeeVector {
	int id;
	String name, address;
	Vector<EmployeeVector> employee = new Vector<EmployeeVector>();

	public EmployeeVector() {
		empMenu();
	}
	
	public EmployeeVector(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void addEmployee(EmployeeVector stud) {
		employee.add(stud);
	}
	
	public void display() {
		System.out.println("\n___________________________________________________________");
		System.out.println("\nID\tName\t\t\tAddress");
		System.out.println("____________________________________\n");
		for (EmployeeVector obj : employee) {
        	System.out.println(obj.id + "\t "+obj.name +"\t\t "+obj.address);
        }
//		// Creating an object of enum
//		System.out.println("======enum");
//        Enumeration<EmployeeVector> en = employee.elements();
//        while (en.hasMoreElements()) {
//            System.out.println(en.nextElement().id + "\t "+en.nextElement().name +"\t\t "+en.nextElement().address);
//        }
		System.out.println("\n___________________________________________________________");
	}
	
	public void searchEmployee(int id) {
		System.out.println("\n___________________________________________________________");
		int flag = 0;
		for (EmployeeVector obj : employee) {
			if(obj.id == id) {
				System.out.println("\n"+obj.id + " "+obj.name +" "+obj.address);
				flag = 1;
			}
		}
		if (flag != 1) {
			System.out.println("\nEnterd Employee ID Not Found!!!");
		}
		System.out.println("\n___________________________________________________________");
	}
	
	public void empMenu() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\n==========Employee Details[Vector]==========");
			System.out.println("\n1. Add Employee\n2. Display \n3. Search Employee\n4. Back to Main Menu\n5. Exit");
			System.out.print("\nEnter your choice : ");
			int ch = sc.nextInt();
			switch(ch) {
				case 1 : 
					System.out.print("\nEnter Employee ID : ");
					int id = sc.nextInt();
					System.out.print("Enter Employee Name : ");
					String name = sc.next();
					System.out.print("Enter Employee Address : ");
					String address = sc.next();
					EmployeeVector emp = new EmployeeVector(id, name, address);
					addEmployee(emp);
					break;
				case 2:
					display();
					break;
				case 3:
					System.out.print("\nEnter Employee ID for Search : ");
					int sid = sc.nextInt();
					searchEmployee(sid);
					break;
				case 4:
					ShanJavaAssignment6 obj = new ShanJavaAssignment6();
					obj.mainMenu();
				case 5:
					System.exit(0);
				default :
					System.out.println("Enter Cprrect Choice!!!");
			}
		}   
	}
}
