package com.training.project.service;

import java.sql.SQLException;
import java.util.List;

import com.training.project.model.User;

public interface UserService {
	
	public int regUser(User user) throws SQLException;

	public int updateUser(User user) throws SQLException;

	public int deletUser(User User) throws SQLException;

	public List<User> getAllUsers() throws SQLException;

	public User authenticate(String loginName,String password) throws SQLException;

}
