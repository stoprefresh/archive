package com.skilldistillery.jdbc.examples;

import java.sql.*;

public class GeneratedKeys {
	
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
			
			System.out.println("********************** " + st);
			
			int uc = st.executeUpdate();
			
			System.out.println(uc + " actor records created.");
			// Now get the auto-generated actor IDs:
			ResultSet keys = st.getGeneratedKeys();
			
			sql = "SELECT first_name, last_name FROM actor WHERE id = ?";
			
			st = conn.prepareStatement(sql);
			
			while (keys.next()) {
				System.out.println("\nNew actor ID: " + keys.getInt(1));
				
				st.setInt(1, keys.getInt(1));
				ResultSet rs = st.executeQuery();
				
				System.out.println(rs.next() ? "Name: " + rs.getString("first_name") +  " "
				+ rs.getString("last_name") : " " );
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		GeneratedKeys demo = new GeneratedKeys();
		demo.runSQL();
	}
}