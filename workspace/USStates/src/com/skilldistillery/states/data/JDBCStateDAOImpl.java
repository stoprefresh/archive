package com.skilldistillery.states.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCStateDAOImpl implements StateDAO {

  private static String url = "jdbc:mysql://localhost:3306/historydb";

  private final String user = "historyuser";
  private final String pass = "historyuser";
  
  private final String fullDataQuery = "SELECT abbreviation, name, capital, latitude, longitude, state_population "
      + "from STATE ";
  
  public JDBCStateDAOImpl() throws ClassNotFoundException {
    Class.forName("com.mysql.jdbc.Driver");
  }
  @Override
  public State getStateByName(String name) {
    // TODO : Implement method
    State s = null;
      // Find the state by it's name in the 'states' table
      // If found, assign the state to 's'
    try {
      Connection conn = DriverManager.getConnection(url, user, pass);
      
      // add where clause...
      String sql = fullDataQuery + "where name ='" + name + "'";
      
      PreparedStatement st = conn.prepareStatement(sql);
      
//      st.setString(1, name);
      
      // set parameters
      
      ResultSet rs = st.executeQuery();
      // map ResultSet data to a State object and set to 's'
      if(rs.next()) {
        s = new State(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
      
      }
      
      conn.close();
    }
    catch (SQLException e) {
      e.printStackTrace();
    }
    return s;
  }
  @Override
  public State getStateByAbbreviation(String abbrev) {
    // TODO : Implement method
    State s = null;
      // Find the state by it's abbreviation in the 'states' array
      // If found, assign the state to 's'
    try {
    	Connection conn = DriverManager.getConnection(url, user, pass);
    	
    	String sql = fullDataQuery + "where abbreviation =?";
    	
    	PreparedStatement st = conn.prepareStatement(sql); 
    	st.setString(1, abbrev);
    	ResultSet rs = st.executeQuery();
    	
    	if(rs.next()) {
    		s = new State(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
    		
    	}
    	conn.close();
    	
    }
    catch (SQLException e) {
    	e.printStackTrace();
    }
    
    
    return s;
  }
}

