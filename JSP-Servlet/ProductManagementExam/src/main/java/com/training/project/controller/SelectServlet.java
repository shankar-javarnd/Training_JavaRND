package com.training.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.project.dao.ProductDaoImpl;
import com.training.project.model.Product;
import com.training.project.service.ProductService;
import com.training.project.service.ProductServiceImpl;
import com.training.project.service.UserService;
import com.training.project.service.UserServiceImpl;


public class SelectServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(false);
		int id = Integer.parseInt(request.getParameter("id"));
		UserService service = new UserServiceImpl();
		ProductService pservice = new ProductServiceImpl();
		try {
			
			Product product = pservice.findProduct(id); 
			session.setAttribute("product", product);
			request.getRequestDispatcher("product-update.jsp").forward(request, response);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
