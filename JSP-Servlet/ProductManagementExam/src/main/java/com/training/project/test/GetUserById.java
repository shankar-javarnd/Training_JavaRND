package com.training.project.test;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.training.project.dao.ProductDao;
import com.training.project.dao.UserDao;
import com.training.project.dao.UserDaoImpl;
import com.training.project.model.Product;
import com.training.project.model.User;
import com.training.project.service.ProductService;
import com.training.project.service.ProductServiceImpl;

public class GetUserById {
	public static void main(String[] args) {
		UserDao userDao = new UserDaoImpl();
		//ProductDao productDao
		ProductService ps = new ProductServiceImpl();
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the id which you want to display");
		//int id =sc.nextInt();
//		try {
//			User u = userDao.getUserById(id);
//			if(u!=null)
//			{
//				System.out.println(u.getId()+"\t"+u.getFirstName()+"\t"+u.getLastName());
//			}
//			else {
//				System.out.println("user not found");
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			List<Product> plist = ps.getAllProduct();
			for(Product p:plist) {
				System.out.println(p.getPid() +"    "+ p.getpName()+"    "+p.getPrice()+"    "+p.getQuantity()+"    "+p.getVendor()+"    "+p.getWarranty());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//productDao.getAllProduct();

	}

}
