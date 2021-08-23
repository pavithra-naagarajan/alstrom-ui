package com.servlet.demos;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PrintName extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public PrintName() {
        super();
      
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		for (int i = 0; i <5; i++) {
			out.println("<html><body>");
			out.println("<h2>Hi,Pavithra.N! ");
			out.println("</br>");
			out.println("</body></html>");
		}
	}

}
