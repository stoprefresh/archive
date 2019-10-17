package com.skilldistillery.lotto.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skilldistillery.lottery.powerball.PowerBallDrawing;
import com.skilldistillery.lottery.powerball.PowerBallDrawingResult;

public class LotteryServlet extends HttpServlet {
  
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    PowerBallDrawing drawing = new PowerBallDrawing();
    PowerBallDrawingResult results = drawing.getResults();
    PrintWriter pw = resp.getWriter();
    pw.println("<html>");
    pw.println("<head><title>Lotto</title></head>");
    pw.println(" <body>");
    pw.println(results);
    pw.println(" </body>");
    pw.println("</html>");
    pw.close();
  }
}
