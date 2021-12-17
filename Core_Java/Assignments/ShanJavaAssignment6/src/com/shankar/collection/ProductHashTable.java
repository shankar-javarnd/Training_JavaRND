package com.shankar.collection;

import java.util.*;

public class ProductHashTable {
	String name, pid;
	Map<Integer, ProductHashTable> product = new Hashtable<Integer, ProductHashTable>();

	public ProductHashTable() {
		studMenu();
	}
	
	public ProductHashTable(String pid, String name) {
		super();
		this.pid = pid;
		this.name = name;
	}
	
	public void addProduct(int key, ProductHashTable prod) {
		product.put(key, prod);
	}
	
	public void display() {
		System.out.println("\n___________________________________________________________");
		System.out.println("\nPid\tProduct Name");
		System.out.println("____________________________________\n");
		for(Map.Entry<Integer, ProductHashTable> entry:product.entrySet()){
			int key = entry.getKey();  
			ProductHashTable b = entry.getValue(); 
		    System.out.println(b.pid+"\t "+b.name);
		}    
		System.out.println("\n___________________________________________________________");
	}
	
	public void searchProduct(String pid) {
		System.out.println("\n___________________________________________________________");
		int flag = 0;
		for(Map.Entry<Integer, ProductHashTable> entry:product.entrySet()){
			int key = entry.getKey();  
			ProductHashTable b = entry.getValue();
			if(b.pid.equals(pid)) {
				System.out.println("\n" + b.pid+"\t "+b.name);
				flag = 1;
			}
		}
		if (flag != 1) {
			System.out.println("\nEnterd Product ID Not Found!!!");
		}
		System.out.println("\n___________________________________________________________");
	}
	
	public void removeProduct(String pid) {
		System.out.println("\n___________________________________________________________");
		int flag = 0;
		int rkey = 0;
		for(Map.Entry<Integer, ProductHashTable> entry:product.entrySet()){
			int key = entry.getKey();  
			ProductHashTable b = entry.getValue();
			if(b.pid.equals(pid)) {
				rkey = key;
				System.out.println("\n" + b.pid+"\t "+b.name);
				flag = 1;
			}
		}
		if (flag != 1) {
			System.out.println("\nEnterd Product ID Not Found!!!");
		}
		else {
			product.remove(rkey);
			System.out.println(rkey + "\n====Product Removed Successfully!!!");
		}
		System.out.println("\n___________________________________________________________");
	}
	
	public void studMenu() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\n==========Product Details[Hash Table]==========");
			System.out.println("\n1. Add Product\n2. Display \n3. Search Product\n4. Remove Product\n5. Back to Main Menu\n6. Exit");
			System.out.print("\nEnter your choice : ");
			int ch = sc.nextInt();
			switch(ch) {
				case 1 : 
					ProductHashTable[] prod = new ProductHashTable[10];
					System.out.println("\nEnter 10 Product Details : ");
					for(int i = 0; i < prod.length; i++) {
						System.out.print("\nEnter Product ID : ");
						String pid = sc.next();
						System.out.print("Enter Product Name : ");
						String name = sc.next();
						prod[i] = new ProductHashTable(pid, name);
						addProduct(i, prod[i]);
					}
					break;
				case 2:
					display();
					break;
				case 3:
					System.out.print("\nEnter Product ID for Search : ");
					String sid = sc.next();
					searchProduct(sid);
					break;
				case 4:
					System.out.print("\nEnter Product ID for Remove : ");
					String rid = sc.next();
					removeProduct(rid);
					break;
				case 5:
					ShanJavaAssignment6 obj = new ShanJavaAssignment6();
					obj.mainMenu();
				case 6:
					System.exit(0);
				default :
					System.out.println("Enter Cprrect Choice!!!");
			}
		}   
	}
}
