package com.training.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.project.model.User;
import com.training.project.service.UserService;
import com.training.project.service.UserServiceImpl;


public class Registration extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		UserService service = new UserServiceImpl();
		User user = new User();
		
		user.setName(request.getParameter("name"));
		user.setMobile(Long.parseLong(request.getParameter("mobile")));
		user.setEmail(request.getParameter("email"));
		user.setUserName(request.getParameter("userName"));
		user.setPassword(request.getParameter("password"));
		try {
			
				int register = service.regUser(user); // Registering the details of new user
				if(register != 0) {
					
					RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
					rd.include(request, response);
					out.println("<h4 style='color:green'>You are successfully Registered !!</h4> Please Login");
					
				}
				
		} catch (SQLException e) {
				
				e.printStackTrace();
		}
				
	}
}
