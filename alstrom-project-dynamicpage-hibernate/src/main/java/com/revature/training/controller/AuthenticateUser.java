package com.revature.training.controller;





import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthenticateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AuthenticateUser() {
        super();
       
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		boolean alreadyVisited=false;
		Cookie allCookies[]=request.getCookies();
		
		
		
		out.println("<html><body>");
		out.println("<h2>You have logged in at : "+ new java.util.Date());
		out.println("<br><h3>Your username is : "+ username);
		
		if(allCookies==null) {
			
		}
		else {
			for(Cookie c:allCookies) {
				if(c.getName().equals(username)) {
					alreadyVisited=true;
					break;
				}
			}
		}
		if(alreadyVisited) {
			out.println("you have already visited my website: "+username);
		}
		else {
			out.println("you are first time visitor: "+username);
			Cookie c=new Cookie(username,username);
			c.setMaxAge(1000*60*60*24);
			response.addCookie(c);

		}
		
		out.println("Your username length is : "+ username.length());
		out.println("Your password is : "+ password);
		out.println("<br/><br/><a href=ProductForm.html>Add Product</a>");
		out.println("</body></html>");
	}

}