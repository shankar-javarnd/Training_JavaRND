package com.shankar.phonebook.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.shankar.phonebook.dao.PhoneBookDao;
import com.shankar.phonebook.dao.PhoneBookDaoImpl;
import com.shankar.phonebook.model.PhoneBook;

public class GetByID {
	public static void main(String[] args) {
		PhoneBookDao pbd = new PhoneBookDaoImpl();
		Scanner sc = new Scanner(System.in); 
		
		/////////////////////////////
		System.out.print("\nEnter ID for Search : ");
		int id = sc.nextInt();
		
		PhoneBook phone = new PhoneBook();
		phone.setId(id);
		
		try {
			PhoneBook pb = pbd.getPhoneById(id);
			if(pb != null) {
				System.out.println("\n"+pb.getId()+"\t"+pb.getName()+"\t"+pb.getPhoneNumber());
			}
			else {
				System.out.println("\nUser Not Found !!!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
		/////////////////////////////////////////////////	
		System.out.print("\nEnter phone Number for Search : ");
		long phoneNumber = sc.nextLong();
		
		//PhoneBook phone = new PhoneBook();
		phone.setPhoneNumber(phoneNumber);
		
		try {
			PhoneBook pb = pbd.getPhoneByNumber(phoneNumber);
			if(pb != null) {
				System.out.println("\n"+pb.getId()+"\t"+pb.getName()+"\t"+pb.getPhoneNumber());
			}
			else {
				System.out.println("\nUser Not Found !!!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++");
		/////////////////////////////////////////////////	
		System.out.print("\nEnter Name for Search : ");
		String name = sc.next();
		
		//PhoneBook phone = new PhoneBook();
		phone.setName(name);
		List<PhoneBook> pbList = new ArrayList<PhoneBook>(); 
		try {
			pbList = pbd.getPhoneByName(name);
		if(pbList != null) {
			for(PhoneBook pb : pbList) {
				System.out.println("\n"+pb.getId()+"\t"+pb.getName()+"\t"+pb.getPhoneNumber());
			}
		}
		else {
		System.out.println("\nUser Not Found !!!");
		}
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}

}
