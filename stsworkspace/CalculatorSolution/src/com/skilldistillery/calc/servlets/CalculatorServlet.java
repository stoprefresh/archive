package com.skilldistillery.calc.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculatorServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String num1 = request.getParameter("number1");
		String num2 = request.getParameter("number2");

		double num1d = Double.parseDouble(num1);
		double num2d = Double.parseDouble(num2);
		double result;
		if (isNotNullOrEmpty(request.getParameter("add"))) {
			result = num1d + num2d;
		} else if (isNotNullOrEmpty(request.getParameter("subtract"))) {
			result = num1d - num2d;
		} else if (isNotNullOrEmpty(request.getParameter("multiply"))) {
			result = num1d * num2d;
		} else if (isNotNullOrEmpty(request.getParameter("divide"))) {
			result = num1d / num2d;
		}
		else {
			result = Double.NaN;
		}
		PrintWriter pw = response.getWriter();
		pw.println("<!doctype html><html><head><title>Calculation</title></head><body>");
		pw.println("<h2>"+result+"</h2>");
		pw.println("</body></html>");
		pw.close();
		}

	private boolean isNotNullOrEmpty(String op) {
		return op != null && op.length() > 0;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
