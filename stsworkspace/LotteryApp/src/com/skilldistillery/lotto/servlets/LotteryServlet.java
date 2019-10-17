package com.skilldistillery.lotto.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skilldistillery.lotto.powerball.PowerBallDrawing;

public class LotteryServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw = resp.getWriter();

		PowerBallDrawing pbd = new PowerBallDrawing();

		pw.print("<html><head><title>The Winning Numbers</title></head>");
		pw.print("<body>");
		pw.print("<h1><em>This is the Lottery!!!!!</em></h1>");
		pw.print("<br><br>");
		pw.print("<h2>Are you winner?</h2>");
		pw.print("<br><br>");
		pw.print(pbd.getResults());
		pw.print("<br>");
		pw.print("</body></html>");

		pw.close();
	}
}
