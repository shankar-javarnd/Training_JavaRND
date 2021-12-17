package com.shankar.phonebook.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtility {
	private static Connection con;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shan_db","rshan","Shan@123");			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public PreparedStatement createPST(String sql) throws SQLException {
		return con.prepareStatement(sql);
	} 
	
	public int update(PreparedStatement pst) throws SQLException {
		return pst.executeUpdate();
	}
	
	public ResultSet query(PreparedStatement pst) throws SQLException {
		return pst.executeQuery();
	}
	
	public boolean testCon() {
		if(con!=null ) {
			return true;
		}
		else {
			return false;
		}
	}
}
