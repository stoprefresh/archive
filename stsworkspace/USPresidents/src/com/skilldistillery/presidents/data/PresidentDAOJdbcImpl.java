package com.skilldistillery.presidents.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PresidentDAOJdbcImpl implements PresidentDAO {

	private static String url = "jdbc:mysql://localhost:3306/historydb";

	private final String user = "historyuser";
	private final String pass = "historyuser";

	private final String fullDataQuery = "SELECT term, first_name, middle_name, last_name, inauguration_date, "
			+ "date_left_office, elections_won, reason_left_office, party from president ";

	public PresidentDAOJdbcImpl() throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
	}

	@Override
	public President findByTermNumber(int termNum) {

		President pres = null;

		try {
			Connection conn = DriverManager.getConnection(url, user, pass);
			String sql = fullDataQuery + "where term=?";

			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, termNum);
			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				pres = new President(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5),
						rs.getDate(6), rs.getInt(7), rs.getString(8), rs.getString(9));

			}

			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pres;
	}

}
