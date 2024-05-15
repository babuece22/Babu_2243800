package com.servlet.in;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;


public class Calculator extends HttpServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		int x= Integer.parseInt(req.getParameter("num1"));
		int y= Integer.parseInt(req.getParameter("num2"));
		res.getWriter().print("The addition is: "+ (x+y));
			
	}

}
