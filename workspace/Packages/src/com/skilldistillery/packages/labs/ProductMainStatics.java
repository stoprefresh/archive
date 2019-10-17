package com.skilldistillery.packages.labs;

//import com.skilldistillery.Helper;
import com.skilldistillery.packages.Util;

import static com.skilldistillery.Helper.*;
//import static com.skilldistillery.packages.Util.*;

public class ProductMainStatics {

	
	Product product;

	  public static void main(String[] args) {
	    ProductMainStatics app = new ProductMainStatics();
	    app.go();
	  }

	  public ProductMainStatics() {
	    product = new Product();
	  }

	  public void go() {
	    Util.utilMethod();
	    helperMethod();
	  }
}
