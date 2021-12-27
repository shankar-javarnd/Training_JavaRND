package com.training.project.test;

import java.sql.SQLException;
import java.util.Scanner;

import com.training.project.dao.UserDao;
import com.training.project.dao.UserDaoImpl;
import com.training.project.model.Product;
import com.training.project.service.ProductService;
import com.training.project.service.ProductServiceImpl;

public class AddProduct {

	public static void main(String[] args) {
		
		UserDao userDao = new UserDaoImpl();
		ProductService ps = new ProductServiceImpl();
		Scanner sc = new Scanner(System.in);
		Product p = new Product();
		
		System.out.println("\n Enter P name : ");
		String pname = sc.next();
		p.setpName(pname);
		System.out.println("\n Enter Price : ");
		double price = sc.nextDouble();
		p.setPrice(price);
		System.out.println("\n Enter quantity : ");
		int qnt = sc.nextInt();
		p.setQuantity(qnt);
		System.out.println("\n Enter  vendor : ");
		String vendor = sc.next();
		p.setVendor(vendor);
		System.out.println("\n Enter warranty : ");
		int wrnt = sc.nextInt();
		p.setWarranty(qnt);
		
		
		try {
			
			int add = ps.addProduct(p);// Add the particular product into database
			if(add != 0) {
				System.out.println("Success!!!");
				//session.setAttribute("product", product); 
				//request.getRequestDispatcher("report").forward(request, response);	
				
			}
			 
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
