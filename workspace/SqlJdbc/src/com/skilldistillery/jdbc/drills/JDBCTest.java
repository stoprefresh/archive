package com.skilldistillery.jdbc.drills;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.Scanner;

public class JDBCTest {

	private static final String URL = "jdbc:mysql://localhost:3306/sdvid?useSSL=false";

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		System.out.println("JDBCTest started.");

		JDBCTest tester = new JDBCTest();
//		tester.showStaff();
		 int storeId = 0;
		 Scanner input = new Scanner(System.in);
		  do {
		    System.out.print("Enter a store ID (0 to quit): ");
		    storeId = input.nextInt();
		    tester.showStaff(storeId);
		  } while (storeId != 0);
		  input.close();
	}
	
	public void showStaff(int storeId) throws SQLException {
		String user = "student";
		String pass = "student";

		Connection conn = DriverManager.getConnection(URL, user, pass);

		String sqltxt;

		sqltxt = "SELECT id, first_name, last_name from Staff WHERE store_id = ?";
		
		PreparedStatement pstmt = conn.prepareStatement(sqltxt);
		
		pstmt.setInt(1, storeId);
		
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getString("id") + " " + rs.getString("first_name") + " " + rs.getString("last_name"));
		}
		rs.close();
		pstmt.close();
		conn.close();
	}
	
	// This is dangerous
	public void showStaff() throws SQLException {
		String user = "student";
		String pass = "student";

		Connection conn = DriverManager.getConnection(URL, user, pass);

		String sqltxt;

		sqltxt = "SELECT id, first_name, last_name FROM staff";

		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sqltxt);
		while (rs.next()) {
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}
		rs.close();
		stmt.close();
		conn.close();
	}

	public JDBCTest() throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
	}
}