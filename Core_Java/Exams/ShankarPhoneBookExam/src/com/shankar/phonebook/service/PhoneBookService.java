package com.shankar.phonebook.service;

import java.sql.SQLException;

public interface PhoneBookService {

	public void addPhone() throws SQLException;
	
	public void updatePhone() throws SQLException;
	
	public void deletePhone() throws SQLException;
	
	public void getPhoneById() throws SQLException;
	
	public void getPhoneByNumber() throws SQLException;
	
	public void getPhoneByName() throws SQLException;
	
	public void getAllRecords() throws SQLException;
}
