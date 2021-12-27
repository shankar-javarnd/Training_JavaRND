package com.training.project.controller;

import java.io.IOException;
import java.sql.SQLException;

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


public class UpdateServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession(false);
		User user = (User) session.getAttribute("user");
		UserService service = new UserServiceImpl();
		ProductService pservice = new ProductServiceImpl();
		try {
			Product product = new Product();
			
			//Set the details of product into product1 object for updation
			
			product.setPid(Integer.parseInt(request.getParameter("pid")));
			product.setpName(request.getParameter("pname"));
			product.setPrice(Integer.parseInt(request.getParameter("price")));
			product.setQuantity(Integer.parseInt(request.getParameter("quantity")));
			product.setVendor(request.getParameter("vendor"));
			product.setWarranty(Integer.parseInt(request.getParameter("warranty")));
			//product.setUserName(user.getUserName());
			int update = pservice.updateProduct(product); //Update the product details
			if(update != 0) {
				
				request.getRequestDispatcher("report").forward(request, response);	
				
			}
			
		 } catch (SQLException e) {
			 
			e.printStackTrace();
			
		}
				  
	}

}
