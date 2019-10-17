package com.skilldistillery.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NameChooserServlet extends HttpServlet {
  private String[] firstNames = {
      "Stacie",
      "Youlanda",
      "Loma",
      "Jeri",
      "Erin",
      "Damon",
      "Marielle",
      "India",
      "America",
      "Quinn",
      "Vallie",
      "Shalon",
      "Alonzo",
      "Ruthie",
      "Lindsey",
      "Richard",
      "Dorthy",
      "Devona",
      "Judi",
      "Caterina",
      "Rossana",
      "Aracely",
      "Clara",
      "Ebonie",
      "Sindy",
      "Stephnie",
      "Blythe",
      "Lakendra",
      "Marget",
      "Tommy"
  };
  private String[] lastNames = {
      "Anderson",
      "Weber",
      "Holt",
      "Dennis",
      "Gentry",
      "Levy",
      "Roy",
      "Arellano",
      "Molina",
      "Simon",
      "Salazar",
      "Heath",
      "Haley",
      "Williams",
      "Graves",
      "Malone",
      "Thomas",
      "Farley",
      "Young",
      "Bryant",
      "Keith",
      "Clayton",
      "Warren",
      "Hartman",
      "Daugherty",
      "Grimes",
      "Hall",
      "Medina",
      "Patrick",
      "Salinas"
  };
  
  
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    PrintWriter pw = resp.getWriter();
    pw.println("<html>");
    pw.println("<head><title>Names</title></head>");
    pw.println(" <body>");
    pw.println(getRandomName(firstNames));
    pw.println(" ");
    pw.println(getRandomName(lastNames));
    
    pw.println(" </body>");
    pw.println("</html>");
    pw.close();
  }
  
  private String getRandomName(String[] names) {
    String result = null;
    int index = (int) (Math.random() * names.length);
    result = names[index];
    return result;
  }
}
