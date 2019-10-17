package com.skilldistillery.jdbc.examples;

import java.sql.*;

public class ActorAdder {

	public static void main(String[] args) {
		ActorAdder ac = new ActorAdder();
		ac.runSQL();

	}

	public void runSQL() {

		String url = "jdbc:mysql://localhost:3306/sdvid?useSSL=false";
		String user = "student";
		String pword = "student";
		
		String firstName = "Ryan", lastName = "Something";
		
		// Employees at store 4 were in a movie, now they're actors!
		String sql = "INSERT INTO actor (first_name, last_name) "
				+ " values(? ,?)";
		
		String sql2 = "SELECT last_insert_id()";
		
		Connection conn = null;

		try {
			conn = DriverManager.getConnection(url, user, pword);
			conn.setAutoCommit(false); // Start transaction

			PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			st.setString(1, firstName);
			st.setString(2, lastName);
			
			int uc = st.executeUpdate();
			
			System.out.println(uc + " actor records created.");
			// Now get the auto-generated actor IDs:
			ResultSet keys = st.getGeneratedKeys();
			
			System.out.println(keys);
			
			PreparedStatement pstmt = conn.prepareStatement(sql2);
			ResultSet rs = pstmt.executeQuery();
			
			System.out.println(rs.getInt("id"));

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

}
