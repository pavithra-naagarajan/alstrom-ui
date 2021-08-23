package com.revature.training.controller;



import javax.servlet.http.HttpServletRequest;

import com.revature.controller.CustomerControllerAlpha;
import com.revature.controller.LoginControllerAlpha;

public class DispatcherServlet {
	
	private DispatcherServlet() {}
	
	public static Object process(HttpServletRequest request) {
		switch(request.getRequestURI()) {
		case "/FrontController/login.do":
			return ProductController.getInstance().login(request);
		case "/FrontController/logout.do":
			return LoginControllerAlpha.getInstance().logout(request);
		case "/FrontController/register.do":
			return CustomerControllerAlpha.getInstance().register(request);
		case "/FrontController/getAll.do":
			return CustomerControllerAlpha.getInstance().getAllCustomers(request);
		default:
			return "not-implemented.html";
		}
	}
}
