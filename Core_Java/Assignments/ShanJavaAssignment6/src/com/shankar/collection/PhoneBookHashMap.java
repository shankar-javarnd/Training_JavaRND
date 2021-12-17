package com.shankar.collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookHashMap {
	int id, key = 0;
	long phone;
	String name;
	Map<Integer, PhoneBookHashMap> phonebook = new Hashtable<Integer, PhoneBookHashMap>();

	public PhoneBookHashMap() {
		studMenu();
	}
	
	public PhoneBookHashMap(int id, String name, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	
	public void addPhone(PhoneBookHashMap phone) {
		key = key + 1;
		phonebook.put(key, phone);
	}
	
	public void display() {
		System.out.println("\n___________________________________________________________");
		System.out.println("\nID\tName        \t Phone Number");
		System.out.println("____________________________________________\n");
		for(Map.Entry<Integer, PhoneBookHashMap> entry:phonebook.entrySet()){
			int key = entry.getKey();  
			PhoneBookHashMap b = entry.getValue(); 
		    System.out.println(b.id+"\t "+b.name+"\t "+b.phone);
		}    
		System.out.println("\n___________________________________________________________");
	}
	
	public void searchPhone(String name) {
		System.out.println("\n___________________________________________________________");
		int flag = 0;
		for(Map.Entry<Integer, PhoneBookHashMap> entry:phonebook.entrySet()){
			int key = entry.getKey();  
			PhoneBookHashMap b = entry.getValue();
			if(b.name.equals(name)) {
			    System.out.println("\n"+b.id+"\t "+b.name+"\t\t "+b.phone);
				flag = 1;
			}
		}
		if (flag != 1) {
			System.out.println("\nEnterd Name  Not Found in Pone Book!!!");
		}
		System.out.println("\n___________________________________________________________");
	}
	
	public void studMenu() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\n==========Phone Book[Hash Map]==========");
			System.out.println("\n1. Add Phone\n2. Display All  \n3. Search Phone Number By Name\n4. Back to Main Menu\n5. Exit");
			System.out.print("\nEnter your choice : ");
			int ch = sc.nextInt();
			switch(ch) {
				case 1 : 
					System.out.println("\nEnter Phone Details : ");
						System.out.print("\nEnter Phone Book ID : ");
						int id = sc.nextInt();
						System.out.print("Enter Name of the Person : ");
						String name = sc.next();
						System.out.print("Enter Phone Number : ");
						long phone = sc.nextLong();
						PhoneBookHashMap phoneobj = new PhoneBookHashMap(id, name, phone);
						addPhone(phoneobj);
					break;
				case 2:
					display();
					break;
				case 3:
					System.out.print("\nEnter Name for Search Phone Number : ");
					String sname = sc.next();
					searchPhone(sname);
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
