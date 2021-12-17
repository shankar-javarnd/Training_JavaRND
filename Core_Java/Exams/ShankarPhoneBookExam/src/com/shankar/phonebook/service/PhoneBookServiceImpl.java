package com.shankar.phonebook.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.shankar.phonebook.dao.PhoneBookDao;
import com.shankar.phonebook.dao.PhoneBookDaoImpl;
import com.shankar.phonebook.model.PhoneBook;

public class PhoneBookServiceImpl implements PhoneBookService {
	
	PhoneBookDao pbd = new PhoneBookDaoImpl();
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void addPhone() throws SQLException {
		
		System.out.print("\nEnter the Name : ");
		String name = sc.next();
		System.out.print("Enter the phone Number : ");
		long phoneNumber = sc.nextLong();
		
		PhoneBook phone = new PhoneBook();
		phone.setName(name);
		phone.setPhoneNumber(phoneNumber);
		
		try {
			int flag = pbd.addPhone(phone);
			if (flag > 0) {
				System.out.println("\nRecord Successfully Added!"); 
			}
			else {
				System.out.println("Error!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void updatePhone() throws SQLException {
		
		System.out.print("\nEnter ID which you wanto update : ");
		int id = sc.nextInt();
		System.out.print("\nEnter the New Name : ");
		String name = sc.next();
		System.out.print("Enter the phone New Number : ");
		long phoneNumber = sc.nextLong();
		
		PhoneBook phone = new PhoneBook();
		phone.setId(id);
		phone.setName(name);
		phone.setPhoneNumber(phoneNumber);
		
		try {
			int flag = pbd.updatePhone(phone);
			if (flag > 0) {
				System.out.println("\nRecord Successfully Updated!"); 
			}
			else {
				System.out.println("Error");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deletePhone() throws SQLException {
		 
		System.out.print("\nEnter ID which you wanto Delete : ");
		int id = sc.nextInt();
		
		PhoneBook phone = new PhoneBook();
		phone.setId(id);

		try {
			int flag = pbd.deletePhone(phone);
			if (flag > 0) {
				System.out.println("\nRecord Successfully Deleted!"); 
			}
			else {
				System.out.println("Error");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void getPhoneById() throws SQLException {
		
		System.out.print("\nEnter ID for Search : ");
		int id = sc.nextInt();
		
		PhoneBook phone = new PhoneBook();
		phone.setId(id);
		
		try {
			PhoneBook pb = pbd.getPhoneById(id);
			if(pb != null) {
				System.out.println("\n=========================================");
				System.out.println("ID    \tName    \tPhone Number");
				System.out.println("=========================================");
				System.out.println("\n"+pb.getId()+"    \t"+pb.getName()+"    \t"+pb.getPhoneNumber());
			}
			else {
				System.out.println("\nID Not Found !!!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void getPhoneByNumber() throws SQLException {
		
		System.out.print("\nEnter phone Number for Search : ");
		long phoneNumber = sc.nextLong();
		
		PhoneBook phone = new PhoneBook();
		phone.setPhoneNumber(phoneNumber);
		
		try {
			PhoneBook pb = pbd.getPhoneByNumber(phoneNumber);
			if(pb != null) {
				System.out.println("\n=========================================");
				System.out.println("ID    \tName    \tPhone Number");
				System.out.println("=========================================");
				System.out.println("\n"+pb.getId()+"    \t"+pb.getName()+"    \t"+pb.getPhoneNumber());
			}
			else {
				System.out.println("\nNumber Not Found !!!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void getPhoneByName() throws SQLException {
		
		System.out.print("\nEnter Name for Search : ");
		String name = sc.next();
		
		PhoneBook phone = new PhoneBook();
		phone.setName(name);
		List<PhoneBook> pbList = new ArrayList<PhoneBook>(); 
		try {
			pbList = pbd.getPhoneByName(name);
			if(pbList.isEmpty()) {
				System.out.println("\nRecord is Not Found!!!");
			}
			else {
				System.out.println("\n=========================================");
				System.out.println("ID    \tName    \tPhone Number");
				System.out.println("=========================================");
				for(PhoneBook pb : pbList) {
					System.out.println("\n"+pb.getId()+"    \t"+pb.getName()+"    \t"+pb.getPhoneNumber());
				}
			}
		
		} catch (SQLException e) {
		e.printStackTrace();
		}
	}

	@Override
	public void getAllRecords() throws SQLException {
		
		List<PhoneBook> pbList = new ArrayList<PhoneBook>(); 
		try {
			pbList = pbd.getAllRecords();
			System.out.println("\n=========================================");
			System.out.println("ID    \tName    \tPhone Number");
			System.out.println("=========================================");
			for(PhoneBook pb : pbList) {
				System.out.println("\n"+pb.getId()+"    \t"+pb.getName()+"    \t"+pb.getPhoneNumber());
			}
		} catch (SQLException e) {
		e.printStackTrace();
		}

	}
}
