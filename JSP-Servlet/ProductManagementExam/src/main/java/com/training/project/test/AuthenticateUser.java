package com.training.project.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.training.project.dao.UserDao;
import com.training.project.dao.UserDaoImpl;
import com.training.project.model.User;

public class AuthenticateUser {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Login Name");
		String loginName = sc.next();
		System.out.println("Enter Password");
		String password = sc.next();

		try {
			User user = userDao.authenticate(loginName, password);
			if (user != null) {
//				if (user.getRole() == 0 && user.getStatus() == 1) {
//					System.out.println(user.getFirstName() + "\t" + user.getLastName() + " is admin and active");
//				} else if (user.getRole() == 1 && user.getStatus() == 1) {
//					System.out.println(user.getFirstName() + "\t" + user.getLastName() + " is normal user and active");
//				}
//				else {
//					System.out.println("User is de-active");
//				}
			} else {
				System.out.println("User not exist");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
