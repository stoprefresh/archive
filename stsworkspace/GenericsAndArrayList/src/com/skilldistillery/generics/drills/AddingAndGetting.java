package com.skilldistillery.generics.drills;

import java.util.ArrayList;

public class AddingAndGetting {

  public static void main(String[] args) {
    AddingAndGetting ag = new AddingAndGetting();
    ag.run();
  }
  
  private void run() {
    ArrayList<String> s = new ArrayList<>();
    
    // Output the list's size.
    
    // Add first names of several of your classmates.
    s.add("Ryan");
    s.add("Miguel");
    s.add("Craig");
    s.add("Cecil");
    s.add("theName");
    int size = s.size();
    // Output the list's size again.
    System.out.println(size);
    
    
    for(int i = 0; i < s.size(); i++) {
    	String name = s.get(i);
    	
    	System.out.println(i + ". " + name);
    }
    // Use a for loop and get(index) to iterate through the list and print each name in uppercase letters.
    
    
    outputLastItem(s);  // Stretch goal: Finish the method below.
     
  }
  
  private void outputLastItem(ArrayList<String> list) {
    // Finish this method to output the last item in the list in lowercase.
	  
	  for(int i = 0; i < list.size(); i++) {
		  if(i == list.size()) {
			  String name = list.get(i);
			  System.out.println("\nThis is the last entry " + i + " " + name);
		  }
		  
	  }
	  
	  
  }

}
