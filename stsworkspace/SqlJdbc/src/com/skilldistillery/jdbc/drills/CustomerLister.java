package com.skilldistillery.jdbc.drills;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CustomerLister {
	private static String url = "jdbc:mysql://localhost:3306/sdvid";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CustomerLister test = new CustomerLister();
		
		test.getCustomers();

	}

	public void getCustomers() throws SQLException {
		String user = "student";
		String pass = "student";

		Connection conn = DriverManager.getConnection(url, user, pass);
		String sql = "SELECT id, first_name, last_name from Staff WHERE customer_id =?";

		PreparedStatement pstmt = conn.prepareStatement(sql);

		ResultSet rs = pstmt.executeQuery();
		
		int count = 0;

		while (rs.next() && count++ < 10) {
			System.out.println(
					rs.getString("id") + " " + rs.getString("first_name") + " " + " " + rs.getString("last_name"));
		}
	}

	public CustomerLister() throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
	}

}
