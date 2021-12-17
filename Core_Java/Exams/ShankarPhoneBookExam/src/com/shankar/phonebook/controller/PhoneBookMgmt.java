package com.shankar.phonebook.controller;

import java.sql.SQLException;
import java.util.Scanner;
import com.shankar.phonebook.service.PhoneBookService;
import com.shankar.phonebook.service.PhoneBookServiceImpl;

public class PhoneBookMgmt {

	public static void main(String[] args) throws SQLException {
		PhoneBookService pbs = new PhoneBookServiceImpl();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("\n=========================================");
			System.out.println(" !!!Welcome To Phone Book Management!!!");
			System.out.println("=========================================");
			System.out.println("\n1. Add New");
			System.out.println("2. Search");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			System.out.println("5. List All Entries");
			System.out.println("6. Exit");
			System.out.println("___________________________");
			System.out.print("\nEnter Your Choice : ");
			int ch = sc.nextInt();
			
			
			switch (ch) {
			case 1:
				pbs.addPhone();
				break;
			case 2:
				System.out.println("\n===========================");
				System.out.println("Search By : ");
				System.out.println("===========================");
				System.out.println("\n1. Search By ID");
				System.out.println("2. Search By Name");
				System.out.println("3. Search By Phone Number");
				System.out.println("___________________________");
				System.out.print("\nEnter Your Choice : ");
				ch = sc.nextInt();
				switch (ch) {
					case 1:
						pbs.getPhoneById();
						break;
					case 2:
						pbs.getPhoneByName();
						break;
					case 3:
						pbs.getPhoneByNumber();
						break;
				}
				break;
			case 3:
				pbs.updatePhone();
				break;
			case 4:
				pbs.deletePhone();
				break;
			case 5:
				pbs.getAllRecords();
				break;
			case 6:
				System.out.println("\nHave Wonderfull Day!!!");
				flag = false;
				System.exit(0);
				break;

			default:
				System.out.println("\nPlease Enter Correct Choice!!!");
				break;
			}
		}
		
	}

}
