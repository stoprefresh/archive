package com.skilldistillery.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHelloServlet extends HttpServlet {

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw = resp.getWriter();
		
		pw.print("<html><head><title>My Hello</title></head>");
		pw.print("<body>");
		pw.print("Why, Hello there!");
		pw.print("</body></html>");
		
		pw.close();
	}

	
	
}
