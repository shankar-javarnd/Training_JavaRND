package com.training.project.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.training.project.dao.UserDao;
import com.training.project.dao.UserDaoImpl;
import com.training.project.model.User;

public class UserServiceImpl implements UserService {
	UserDao userDao = new UserDaoImpl();
	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public List<User> getAllUsers() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public User authenticate(String loginName, String password) throws SQLException {
		User user = userDao.authenticate(loginName, password);
		if(user!=null){
			
			return user;
			
		}
		return null;
	
	}
	@Override
	public int regUser(User user) throws SQLException {
		return userDao.regUser(user);
	}
	@Override
	public int updateUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int deletUser(User User) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
