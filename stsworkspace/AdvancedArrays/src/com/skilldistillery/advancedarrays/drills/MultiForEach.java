package com.skilldistillery.advancedarrays.drills;

public class MultiForEach {

  public static void main(String[] args) {

	  
	
	String [][] legends = {{"Robert", "Jimmy", "John", "John Paul"}, 
			{"Bruce", "Nicko", "Janick", "Adrian", "Dave", "Steve"}, 
			{"Axl", "Slash", "Izzy", "Steven", "Duff"}};
	
	
	  
    printBands(legends);
    // Call printBands.
  }
  
  
  public static void printBands(String[][] group) {
	  
	  for (String[] band : group) {
		  for( String names : band) {
			  System.out.println(names);
		  }
		  System.out.println();
	  }
  }
}
