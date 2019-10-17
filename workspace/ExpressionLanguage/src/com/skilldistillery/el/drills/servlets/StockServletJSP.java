package com.skilldistillery.el.drills.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skilldistillery.el.data.Stock;
import com.skilldistillery.el.data.StockProvider;

public class StockServletJSP extends HttpServlet {
  private StockProvider stockProvider;
  private List<Stock> stocksViewed;

  @Override
  public void init() throws ServletException {
    try {
      stockProvider = new StockProvider();
      stocksViewed = new ArrayList<>();
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
    
    if(s != null ) {
    	stocksViewed.add(s);
    	req.setAttribute("stock", s);
    	req.setAttribute("stocksViewed", stocksViewed);
    }
    req.getRequestDispatcher("/WEB-INF/select.jsp").forward(req, resp);    	
    
    // Store the Stock object in the request with the key "stock".
    
    
  }

}
