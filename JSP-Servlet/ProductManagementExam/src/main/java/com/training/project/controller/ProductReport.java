package com.training.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.project.model.Product;
import com.training.project.model.User;
import com.training.project.service.ProductService;
import com.training.project.service.ProductServiceImpl;
import com.training.project.service.UserService;
import com.training.project.service.UserServiceImpl;

public class ProductReport extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		User user = (User) session.getAttribute("user");
	    //String userName = user.getUserName();
		UserService service = new UserServiceImpl();  
		ProductService pservice = new ProductServiceImpl();  
		try {
				
			List<Product> productList = pservice.getAllProduct(); //Get all the products added by a particular user
			session.setAttribute("productList", productList);
			out.print("---------------------------");
			System.out.print("---------------------------");
			for(Product p:productList) {
				out.print(p.getPid());
				out.print(p.getpName());
				out.print(p.getPrice());
				out.print(p.getQuantity());
				out.print(p.getVendor());
				out.print(p.getWarranty());
			}
			request.getRequestDispatcher("productReport.jsp").forward(request, response);
			
			//session.setAttribute("productList", productList);
			//request.getRequestDispatcher("report.jsp").forward(request, response);
			
		} catch (SQLException e1) {
				
				e1.printStackTrace();
				
		}
		 
	}

}
