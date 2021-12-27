package com.training.project.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.project.db.DBUtility;
import com.training.project.model.User;

public class UserDaoImpl implements UserDao {

	DBUtility db = new DBUtility();
	PreparedStatement pst;
	ResultSet rs;
	
	@Override
	public int regUser(User user) throws SQLException {
		
		String sql = "insert into puser(name,mobile,email,userName,password)values(?,?,?,?,?)";
		pst = db.createPST(sql);
		pst.setString(1, user.getName());
		pst.setLong(2, user.getMobile());
		pst.setString(3, user.getEmail());
		pst.setString(4, user.getUserName());
		pst.setString(5, user.getPassword());
	    return db.update(pst);
	}
	@Override
	public int updateUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int deletUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public List<User> getAllUsers() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public User authenticate(String loginName, String password) throws SQLException {
		
		String sql = "select * from puser where userName=? and password=?";
		pst = db.createPST(sql);
		pst.setString(1, loginName);
		pst.setString(2, password);
		rs = db.query(pst);
		if (rs.next()) {
			
			User user = new User();
			user.setName(rs.getString("name"));
			user.setMobile(rs.getLong("mobile"));
			user.setEmail(rs.getString("email"));
			user.setUserName(rs.getString("userName"));
			user.setPassword(rs.getString("password"));
			return user;
			
		} else {
			
			return null;
			
		}
	}
	
}
