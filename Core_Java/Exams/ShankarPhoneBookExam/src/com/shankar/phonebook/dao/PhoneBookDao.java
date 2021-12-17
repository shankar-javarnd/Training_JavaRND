package com.shankar.phonebook.dao;
import java.util.List;
import java.sql.SQLException;
import com.shankar.phonebook.model.PhoneBook;

public interface PhoneBookDao {
	
	public int addPhone(PhoneBook phone) throws SQLException;
	
	public int updatePhone(PhoneBook phone) throws SQLException;
	
	public int deletePhone(PhoneBook phone) throws SQLException;
	
	public PhoneBook getPhoneById(int id) throws SQLException;
	
	public PhoneBook getPhoneByNumber(long number) throws SQLException;
	
	public List<PhoneBook> getPhoneByName(String name) throws SQLException;
	
	public List<PhoneBook> getAllRecords() throws SQLException;
}
