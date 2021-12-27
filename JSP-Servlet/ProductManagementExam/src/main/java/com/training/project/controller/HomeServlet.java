package com.training.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class HomeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//out.println("Under Construction....");
		
		HttpSession session = request.getSession(false);
		String loginName = (String) session.getAttribute("loginName"); 
		
		if(session != null && loginName != null) {
			
			RequestDispatcher rd = request.getRequestDispatcher("report");
			rd.include(request, response);

			out.println("<h4 style='color:blue'>Hello "+loginName+" welcome to profile!!!</h4>");
			out.println("<h1 style='color:orange'>This Is Profile Page!!!... </h1>");
		} 
		else {
	
			out.println("<h4 style='color:red'>Please Login First...</h4>");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.include(request, response);
			out.println("<h1 style='color:orange'>You can't Visit Home Page Directly!!!... </h1>");
		}
		
	}

}
