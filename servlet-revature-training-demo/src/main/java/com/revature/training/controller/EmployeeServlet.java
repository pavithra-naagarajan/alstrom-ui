package com.revature.training.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public EmployeeServlet() {
        super();
    }

	
	public void init() throws ServletException {
		System.out.println("Welcome to Revature!");
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		init();
		System.out.println("DOGET METHOD Called-EmployeeServlet");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body bgcolor=lightgreen>");
		out.println("<h2>Hi,Pavithra.N! Welcome to servlet");
		out.println("</body></html>");

	}

}
