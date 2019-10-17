package com.skilldistillery.taglibraries.drills.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skilldistillery.taglibraries.data.Stock;
import com.skilldistillery.taglibraries.data.StockProvider;

public class StockServletList extends HttpServlet {
  private StockProvider stockProvider;
  
  @Override
  public void init() throws ServletException {
    try {
      stockProvider = new StockProvider();
    }
    catch (ClassNotFoundException e) {
      throw new ServletException(e);
    }
  }

  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
    // Get all Stocks and add them to the request
  
    req.getRequestDispatcher("/WEB-INF/listStocks.jsp").forward(req, resp);
  }

}
