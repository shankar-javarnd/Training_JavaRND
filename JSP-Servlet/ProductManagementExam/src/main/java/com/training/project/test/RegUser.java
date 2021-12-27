package com.training.project.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.training.project.dao.UserDao;
import com.training.project.dao.UserDaoImpl;
import com.training.project.model.User;

public class RegUser {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Name");
		String firstName= sc.next();
		System.out.println("Enter the Last Name");
		String lastName= sc.next();
		System.out.println("Enter the Mobile");
		long mobile = sc.nextLong();
		System.out.println("Enter the login Name");
		String loginName= sc.next();
		System.out.println("Enter the password");
		String password= sc.next();
		System.out.println("Enter the email");
		String email= sc.next();

		User user = new User();
//		user.setEmail(email);
//		user.setFirstName(firstName);
//		user.setLastName(lastName);
//		user.setMobile(mobile);
//		user.setPassword(password);
//		user.setLoginName(loginName);
		try {
			int flag = userDao.regUser(user);
			if(flag>0)
			{
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
