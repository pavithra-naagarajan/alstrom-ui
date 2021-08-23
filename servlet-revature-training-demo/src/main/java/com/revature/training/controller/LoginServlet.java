package com.revature.training.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("uname");
		String password = request.getParameter("password");
		 
		  HttpSession session=request.getSession();
		  session.setAttribute("customerName", userName);
		  session.setAttribute("loginDateTime", new Date());
		  
		System.out.println("DOPOST method called-login servlet");
		out.println("<html><body bgcolor=lightgreen>");
		
		if (userName.equalsIgnoreCase("pavi") || userName.startsWith("P")) {
			
			out.println("<h2>Hi! Welcome to servlet :" + userName);
			out.println("DOPOST method called-login servlet");
			RequestDispatcher dispatcher = request.getRequestDispatcher("ValidUser");
			//dispatcher.include(request, response);
			dispatcher.forward(request, response);
		} else {
			out.println("Sorry,try again later!");
			out.println("<a href=LoginPage.html>TryAgain</a>");
		}

		out.println("<br/>your password is : " + password);
		out.println("</body></html></br></br>");

	}
	
	  protected void doGet(HttpServletRequest request, HttpServletResponse
	  response) throws ServletException, IOException {
	  
	  
	  PrintWriter out = response.getWriter(); String userName =
	  request.getParameter("uname"); String password =
	  request.getParameter("password");
	  
		/*
		 * HttpSession session=request.getSession();
		 * session.setAttribute("customerName", userName);
		 */
	  
	  response.setContentType("text/html");
	  out.println("<html><body bgcolor=orange>");
	  System.out.println("DOGET method called-login servlet");
	  out.println("<h2>Hi! Welcome to servlet :" + userName);
	  out.println("DOGET method called-login servlet"); RequestDispatcher
	  dispatcher = request.getRequestDispatcher("ValidUser");
	  dispatcher.include(request, response); out.println("<br/>your password is : "
	  + password); out.println("</body></html></br></br>"); }
	 
	}
