package com.skilldistillery.taglibraries.drills.servlets;

import java.io.IOException;
import java.util.ArrayList;
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
		} catch (ClassNotFoundException e) {
			throw new ServletException(e);
		}
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Stock> stocks = stockProvider.getAllStocks();
		List<Stock> sortedStock = new ArrayList<>();
		// Get all Stocks and add them to the request
		String symbol = req.getParameter("search");
		if (symbol != null && !symbol.equals("") ) {
			for (Stock stock : stocks) { 
				
				if(stock.getSymbol().startsWith(symbol) || stock.getName().startsWith(symbol)) {
					sortedStock.add(stock);
				}
			}
			req.setAttribute("searched", sortedStock);
			req.getRequestDispatcher("/WEB-INF/listStocks.jsp").forward(req, resp);
		}
		else if (stocks != null)  {
			req.setAttribute("stocks", stocks);
			req.getRequestDispatcher("/WEB-INF/listStocks.jsp").forward(req, resp);
		}
//		else {
//			req.getRequestDispatcher("/WEB-INF/listStocks.jsp").forward(req, resp);
//		}
	}
}
