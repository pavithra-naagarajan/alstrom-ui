package com.revature.training.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OrdersDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public OrdersDetailServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("DOGET METHOD- OrdersDetailServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("DOPOST METHOD- OrdersDetailServlet");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body bgcolor=aqua>");
		out.println("<h2>Hi,Pavithra.N! Welcome to servlet ");
		out.println("</body></html>");

	}

}
