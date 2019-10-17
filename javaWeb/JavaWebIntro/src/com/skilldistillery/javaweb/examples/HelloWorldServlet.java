package com.skilldistillery.javaweb.examples;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String name = req.getParameter("nm");
    String outputText = "Hello " + name;
    PrintWriter pw = resp.getWriter();
    // HTML text added to response
    pw.println("<html>");
    pw.println("<head><title>Hello World</title></head>");
    pw.println(" <body>" + outputText + "</body>");
    pw.println("</html>");
    pw.close();
  }
  
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    // Handle POST same as GET
    doGet(req, resp);
  }
}
