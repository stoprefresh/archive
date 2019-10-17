package com.skilldistillery.jsp.solutions.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skilldistillery.jsp.data.Stock;
import com.skilldistillery.jsp.data.StockProvider;

public class StockServletJSPError extends HttpServlet {
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
  
  private Stock findStockBySymbol(List<Stock> stocks, String symbol) {
    Stock s = null;
    for (Stock stock : stocks) {
      if(stock.getSymbol().equals(symbol)) {
        s = stock;
        break;
      }
    }
    return s;
  }


  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String symbol = req.getParameter("symbol");
    List<Stock> stocks = stockProvider.getAllStocks();
    Stock s = findStockBySymbol(stocks, symbol);
    if(s == null) {
      req.getRequestDispatcher("/WEB-INF/solutions/views/error.jsp").forward(req, resp);
    }
    else {
      req.getRequestDispatcher("/WEB-INF/select.jsp").forward(req, resp);
    }
  }

}
