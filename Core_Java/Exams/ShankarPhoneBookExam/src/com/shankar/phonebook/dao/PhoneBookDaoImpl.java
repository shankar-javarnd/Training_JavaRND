package com.shankar.phonebook.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shankar.phonebook.db.DBUtility;
import com.shankar.phonebook.model.PhoneBook;

public class PhoneBookDaoImpl implements PhoneBookDao {
	
	DBUtility db = new DBUtility();
	PreparedStatement pst;
	ResultSet rs;
		
	@Override
	public int addPhone(PhoneBook phone) throws SQLException {
		String sql = "insert into phone_book(name, phoneNumber)values(?,?)";
		pst = db.createPST(sql);
		pst.setString(1, phone.getName());
		pst.setLong(2, phone.getPhoneNumber());
		return db.update(pst);
	}

	@Override
	public int updatePhone(PhoneBook phone) throws SQLException {
		String sql = "update phone_book set name=?,phoneNumber=? where id=?";
		pst = db.createPST(sql);
		pst.setString(1, phone.getName());
		pst.setLong(2, phone.getPhoneNumber());
		pst.setInt(3, phone.getId());
		return db.update(pst);
	}

	@Override
	public int deletePhone(PhoneBook phone) throws SQLException {
		String sql = "delete from phone_book where id=?";
		pst = db.createPST(sql);
		pst.setInt(1, phone.getId());
		return db.update(pst);
	}

	@Override
	public PhoneBook getPhoneById(int id) throws SQLException {
		String sql = "select * from phone_book where id=?";
		pst = db.createPST(sql); 
		pst.setInt(1, id);
		rs = db.query(pst);
		
		if(rs.next()) {
			PhoneBook pb = new PhoneBook();
			pb.setId(rs.getInt("id"));
			pb.setName(rs.getString("name"));
			pb.setPhoneNumber(rs.getLong("phoneNumber"));
			return pb;
		}
		return null;
	}

	@Override
	public PhoneBook getPhoneByNumber(long number) throws SQLException {
		String sql = "select * from phone_book where phoneNumber=?";
		pst = db.createPST(sql); 
		pst.setLong(1, number);
		rs = db.query(pst);
		
		if(rs.next()) {
			PhoneBook pb = new PhoneBook();
			pb.setId(rs.getInt("id"));
			pb.setName(rs.getString("name"));
			pb.setPhoneNumber(rs.getLong("phoneNumber"));
			return pb;
		}
		return null;
	}

	@Override
	public List<PhoneBook> getPhoneByName(String name) throws SQLException {
		String sql = "select * from phone_book where name=?";
		pst = db.createPST(sql); 
		pst.setString(1, name);
		rs = db.query(pst);
		
		List<PhoneBook> pbList = new ArrayList<PhoneBook>();
		while(rs.next()) {
			PhoneBook pb = new PhoneBook();
			pb.setId(rs.getInt("id"));
			pb.setName(rs.getString("name"));
			pb.setPhoneNumber(rs.getLong("phoneNumber"));
			pbList.add(pb);
		}
		return pbList;
	}

	@Override
	public List<PhoneBook> getAllRecords() throws SQLException {
		String sql = "select * from phone_book";
		pst = db.createPST(sql);
		rs = db.query(pst);
		
		List<PhoneBook> pbList = new ArrayList<PhoneBook>();
		while(rs.next()) {
			PhoneBook pb = new PhoneBook();
			pb.setId(rs.getInt("id"));
			pb.setName(rs.getString("name"));
			pb.setPhoneNumber(rs.getLong("phoneNumber"));
			pbList.add(pb);
		}
		return pbList;
	}

	
}
