package com.skilldistillery.jdbc.solutions.drills;

import java.sql.*;
import java.util.Scanner;

public class JDBCTest {
  private static final String URL = "jdbc:mysql://localhost:3306/sdvid";

  public JDBCTest() throws ClassNotFoundException {
    Class.forName("com.mysql.jdbc.Driver");
  }

  public static void main(String[] args) throws SQLException, ClassNotFoundException {
    System.out.println("JDBCTest started.");
    JDBCTest tester = new JDBCTest();
    // tester.showStaff();
    Scanner input = new Scanner(System.in);
    int storeId = 0;
    do {
      System.out.print("Enter a store ID (0 to quit): ");
      storeId = input.nextInt();
      tester.showStaff(storeId);
    } while (storeId != 0);
  }

  // private void showStaff() throws SQLException {
  private void showStaff(int storeId) throws SQLException {
    String user = "student";
    String pass = "student";
    Connection conn = DriverManager.getConnection(URL, user, pass);
    // String sql = "SELECT id, first_name, last_name FROM staff";
    // Statement stmt = conn.createStatement();
    // ResultSet rs = stmt.executeQuery(sql);

    String sql = "SELECT id, first_name, last_name FROM staff WHERE store_id = ?";
    PreparedStatement stmt = conn.prepareStatement(sql);
    stmt.setInt(1, storeId);
    ResultSet rs = stmt.executeQuery();
    while (rs.next()) {
      System.out.println(rs.getString(1) + " " +
          rs.getString(2) + " " +
          rs.getString(3));
    }
    rs.close();
    stmt.close();
    conn.close();

  }

}
