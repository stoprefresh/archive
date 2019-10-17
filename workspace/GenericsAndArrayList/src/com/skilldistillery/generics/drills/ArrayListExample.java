package com.skilldistillery.generics.drills;

import java.util.ArrayList;

public class ArrayListExample {

  public static void main(String[] args) {
    ArrayListExample ex = new ArrayListExample();
    ex.run();
  }

  private void run() {
    // Declare and instantiate an ArrayList to hold Strings. 
    // Use the type argument <String> in the constructor call.
   
	  ArrayList<String> testS = new ArrayList<String>();
	  
	  
	  testS.add("Add");
	  
	  ArrayList<Double> testD = new ArrayList<>();
	 
    // Declare and instantiate an ArrayList to hold Double objects. 
    // This time use the <> shortcut in the constructor call.
//    ArrayList<double> primitive; Doesnt work with non-objects
	  
    // Try to declare an ArrayList to hold double primitives (not Double objects). What happens?

	  
    // Now try declaring an ArrayList without type arguments.
    ArrayList<Character> lists = new ArrayList<>();
    
    // What is the warning Eclipse gives you?
    
    // What combinations of <> and <String> can you put on either side of the =, and still have the code compile?
    
  }

}
