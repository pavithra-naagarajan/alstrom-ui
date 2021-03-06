package com.revature.pms.controller.customer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.pms.service.CustomerService;
import com.revature.pms.service.CustomerServiceImpl;
import com.revature.pms.service.EmployeeService;
import com.revature.pms.service.EmployeeServiceImpl;

/**
 * Servlet implementation class CustomerWithdraw
 */
public class CustomerWithdraw extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CustomerWithdraw() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		int customerId=(int) session.getAttribute("customerId");
		String customerPassword= (String) session.getAttribute("customerPassword");
		
		//int customerId = Integer.parseInt(request.getParameter("customerId"));
		int customerAmount = Integer.parseInt(request.getParameter("amount"));
		//String customerPassword = request.getParameter("customerPassword");
		boolean result = false;

		PrintWriter out = response.getWriter();

		response.setContentType("text/html");
		out.println("<html><body bgcolor=lightblue>");
		CustomerService customerService = new CustomerServiceImpl();
		result = customerService.isCustomerExists(customerId);

		int balance = customerService.checkBalanceOfCustomer(customerId);
		
		if (result == true) {
			if (customerAmount < 0)
				out.println("<h3>You cannot withdraw negative amount!");

			if (balance > customerAmount) {
				balance = customerService.withdrawalOfCustomer(customerId, customerPassword, customerAmount);
				out.println("<h3>Amount is withdrawn successfully!");
				out.println("<h3>After withdrawal the balance is :" + balance);
			}
			if (balance < customerAmount)
				out.println("your balance is insufficient to make withdraw!");

		} else
			out.println("<h3>customer not exist for given customer Id!");
		out.println("<br><br><br><a href=CustomerPage.html>Customer Page </a>");

	}

	/**
	 * @see HttpServlet#doPos{t(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
