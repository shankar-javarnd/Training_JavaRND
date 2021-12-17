package com.shankar.collection;
import java.util.*;

public class StudentArrayList {
	int id;
	String name, address;
	ArrayList<StudentArrayList> studList = new ArrayList<StudentArrayList>();

	public StudentArrayList() {
		studMenu();
	}
	
	public StudentArrayList(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void addStudent(StudentArrayList stud) {
		studList.add(stud);
	}
	
	public void display() {
		System.out.println("\n___________________________________________________________");
		System.out.println("\nID\tName\t\tAddress");
		System.out.println("\n____________________________________\n");
		for (StudentArrayList obj : studList) {
        	System.out.println(obj.id + "\t "+obj.name +"\t\t "+obj.address);
        }
		System.out.println("\n___________________________________________________________");
	}
	
	public void searchStud(int id) {
		System.out.println("\n___________________________________________________________");
		int flag = 0;
		for (StudentArrayList obj : studList) {
			if(obj.id == id) {
				System.out.println("\n"+obj.id + " "+obj.name +" "+obj.address);
				flag = 1;
			}
		}
		if (flag != 1) {
			System.out.println("\nEnterd ID Not Found!!!");
		}
		System.out.println("\n___________________________________________________________");
	}
	
	public void studMenu() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\n==========Student Details[ArrayList]==========");
			System.out.println("\n1. Add Student\n2. Display \n3. Search Student\n4. Back to Main Menu\n5. Exit");
			System.out.print("\nEnter your choice : ");
			int ch = sc.nextInt();
			switch(ch) {
				case 1 : 
					System.out.print("\nEnter Student ID : ");
					int id = sc.nextInt();
					System.out.print("Enter Student Name : ");
					String name = sc.next();
					System.out.print("Enter Student Address : ");
					String address = sc.next();
					StudentArrayList stud = new StudentArrayList(id, name, address);
					addStudent(stud);
					break;
				case 2:
					display();
					break;
				case 3:
					System.out.print("\nEnter Student ID for Search : ");
					int sid = sc.nextInt();
					searchStud(sid);
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
