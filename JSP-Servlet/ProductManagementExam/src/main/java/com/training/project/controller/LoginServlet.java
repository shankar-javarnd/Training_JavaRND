package com.training.project.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.project.model.User;
import com.training.project.service.UserService;
import com.training.project.service.UserServiceImpl;


public class LoginServlet extends HttpServlet {
	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		
//
//	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//out.println("Under Construction...");
		
		String loginName = request.getParameter("loginName");
		String password = request.getParameter("password");
		
        UserService service = new UserServiceImpl();
        
		try {
			User user = service.authenticate(loginName, password);//Authenticate whether the user is valid
			HttpSession session = request.getSession();
			session.setAttribute("loginName", loginName);
			session.setAttribute("user", user);
			if (user != null) {
				
					RequestDispatcher rd = request.getRequestDispatcher("report");
					rd.forward(request, response);
					
			} else {
					
				 	out.println("<h3 style='color:red'>Incorrect Login Name and Password!!!</h3>");
				    RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				    rd.include(request, response);
				    out.println("<h3 style='color:red'>Please Enter Correct Credentials...</h3>");
					
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
	}
}


