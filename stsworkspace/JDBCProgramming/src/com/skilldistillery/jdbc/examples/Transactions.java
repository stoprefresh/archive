package com.skilldistillery.jdbc.examples;

import java.sql.*;

public class Transactions {
	
	public void runSQL() {
		String url = "jdbc:mysql://localhost:3306/sdvid?useSSL=false";
		String user = "student";
		String pword = "student";
		int storeId = 4;
		// Employees at store 4 were in a movie, now they're actors!
		String sql = "INSERT INTO actor (first_name, last_name) "
				+ " SELECT first_name, last_name FROM staff WHERE store_id=?";
		Connection conn = null;

		try {
			conn = DriverManager.getConnection(url, user, pword);
			conn.setAutoCommit(false); // Start transaction

			PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			st.setInt(1, storeId);
			int uc = st.executeUpdate();

			System.out.println(uc + " actor records created.");
			ResultSet keys = st.getGeneratedKeys();

			String sql2 = "INSERT INTO film_actor (film_id, actor_id) " + " VALUES (?,?)";

			PreparedStatement stmt2 = conn.prepareStatement(sql2);

			int filmId = 859;

			stmt2.setInt(1, filmId); // They were all in this film

			while (keys.next()) {
				int actorId = keys.getInt(1);
				System.out.println("New actor ID: " + actorId);
				stmt2.setInt(2, actorId);
				uc = stmt2.executeUpdate();
				if (uc == 1) {
					System.out.println("Actor " + actorId + " added to film " + filmId);
				}
			}
			// If we made it this far, no exception occurred.
			conn.commit(); // Commit the transaction

		} catch (SQLException e) {
			// Something went wrong.
			System.err.println("Error during inserts.");
			e.printStackTrace();
			// Need to rollback, which also throws SQLException.
			if (conn != null) {
				try {
					conn.rollback();
				} catch (SQLException e1) {
					System.err.println("Error rolling back.");
					e1.printStackTrace();
				}
			}
		}
	}

	public static void main(String args[]) {
		Transactions demo = new Transactions();
		demo.runSQL();
	}
}