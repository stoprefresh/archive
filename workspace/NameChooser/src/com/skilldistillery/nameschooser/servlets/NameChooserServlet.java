package com.skilldistillery.nameschooser.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NameChooserServlet extends HttpServlet {
	String[] fNames = { "Stacie", "Youlanda", "Loma", "Jeri", "Erin", "Damon", "Marielle", "India", "America", "Quinn",
			"Vallie", "Shalon", "Alonzo", "Ruthie", "Lindsey", "Richard", "Dorthy", "Devona", "Judi", "Caterina",
			"Rossana", "Aracely", "Clara", "Ebonie", "Sindy", "Stephnie", "Blythe", "Lakendra", "Marget", "Tommy" };

	String[] lNames = { "Anderson", "Weber", "Holt", "Dennis", "Gentry", "Levy", "Roy", "Arellano", "Molina", "Simon",
			"Salazar", "Heath", "Haley", "Williams", "Graves", "Malone", "Thomas", "Farley", "Young", "Bryant", "Keith",
			"Clayton", "Warren", "Hartman", "Daugherty", "Grimes", "Hall", "Medina", "Patrick", "Salinas" };

	public String getNamesRandom() {
		String newName = "";

		newName += fNames[(int) (Math.random() * fNames.length)] + " ";
		newName += lNames[(int) (Math.random() * lNames.length)];
		return newName;
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter pw = resp.getWriter();

		pw.print("<html><head><title>Here are you're random names</title></head>");
		pw.print("<body>");
		pw.print("<br>");
		pw.print("<h1>This is what you're stuck with!</h1>");
		pw.print("<br>");
		pw.print("<h2>" + getNamesRandom() + "</h2>");
		pw.print("</body></html>");

		pw.close();

	}

}
