package com.skilldistillery.jdbc.examples;

import java.sql.*;

public class JDBCLabs {

	public static void main(String[] args) {
		JDBCLabs jlab = new JDBCLabs();
		jlab.runSQL();
	}

	public void runSQL() {
		String url = "jdbc:mysql://localhost:3306/sdvid?useSSL=false";
		String user = "student";
		String pword = "student";
		double costTotal = 0.0;

		// Employees at store 4 were in a movie, now they're actors!
		String sql = "SELECT title, replacement_cost FROM film";

		Connection conn = null;

		try {
			conn = DriverManager.getConnection(url, user, pword);

			conn.setAutoCommit(false); // Start transaction

			PreparedStatement st = conn.prepareStatement(sql);

			ResultSet keys = st.executeQuery();

			
			// Now get the auto-generated actor IDs:

			while (keys.next()) {

				System.out.println("\nTitle: " + keys.getString("title") + " R Cost: " + keys.getDouble("replacement_cost"));

				costTotal += keys.getDouble("replacement_cost");

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println("\nThe Total Replacement Cost of all Movies: " + costTotal);
		}
	}

}
