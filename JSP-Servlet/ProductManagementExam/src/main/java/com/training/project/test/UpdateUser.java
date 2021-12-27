package com.training.project.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.training.project.dao.UserDao;
import com.training.project.dao.UserDaoImpl;
import com.training.project.model.User;

public class UpdateUser {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id which you want to update");
		int id =sc.nextInt();

		System.out.println("Enter the udpated first Name");
		String firstName= sc.next();
		System.out.println("Enter the udpated Last Name");
		String lastName= sc.next();
		System.out.println("Enter the udpated Mobile");
		long mobile = sc.nextLong();
		System.out.println("Enter the udpated login Name");
		String loginName= sc.next();
		System.out.println("Enter the udpated password");
		String password= sc.next();
		System.out.println("Enter the udpated email");
		String email= sc.next();
		System.out.println("Enter the udpated role");
		int  role= sc.nextInt();
		System.out.println("Enter the udpated status");
		int  status= sc.nextInt();

		User user = new User();
		user.setId(id);
		user.setEmail(email);
//		user.setFirstName(firstName);
//		user.setLastName(lastName);
//		user.setMobile(mobile);
//		user.setPassword(password);
//		user.setLoginName(loginName);
//		 user.setRole(role);
//		 user.setStatus(status);
		try {
			int flag = userDao.updateUser(user);
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
