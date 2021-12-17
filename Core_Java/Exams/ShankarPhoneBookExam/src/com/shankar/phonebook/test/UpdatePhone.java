package com.shankar.phonebook.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.shankar.phonebook.dao.PhoneBookDao;
import com.shankar.phonebook.dao.PhoneBookDaoImpl;
import com.shankar.phonebook.model.PhoneBook;

public class UpdatePhone {
	public static void main(String[] args) {
		PhoneBookDao pbd = new PhoneBookDaoImpl();
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter ID which you wanto update : ");
		int id = sc.nextInt();
		System.out.println("\nEnter the New Name : ");
		String name = sc.next();
		System.out.println("\nEnter the phone New Number : ");
		long phoneNumber = sc.nextLong();
		
		PhoneBook phone = new PhoneBook();
		phone.setId(id);
		phone.setName(name);
		phone.setPhoneNumber(phoneNumber);
		
		try {
			int flag = pbd.updatePhone(phone);
			if (flag > 0) {
				System.out.println("Done"); 
			}
			else {
				System.out.println("Error");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
