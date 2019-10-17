package com.skilldistillery.packages.labs;

import com.skilldistillery.Helper;
import com.skilldistillery.packages.Util;

public class ProductMain {

	Product product;

	public static void main(String[] args) {
		ProductMain app = new ProductMain();
		app.go();

	}

	
	public ProductMain() {
		product = new Product();
	}
	
	public void go() {
		Util.utilMethod();
		Helper.helperMethod();
	}
}
