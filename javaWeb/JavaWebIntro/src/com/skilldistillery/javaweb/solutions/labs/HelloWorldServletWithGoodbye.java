package com.skilldistillery.javaweb.solutions.labs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServletWithGoodbye extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String name = req.getParameter("nm");
    String outputText = "Hello " + name;
    PrintWriter pw = resp.getWriter();
    pw.println("<html>");
    pw.println("<head><title>Hello World</title></head>");
    pw.println(" <body>" + outputText);
    
    pw.println("<p><a href=\"byebye.do\">Say Goodbye</a></p>");
    pw.println("</body>");
    pw.println("</html>");
    pw.close();
  }
}
