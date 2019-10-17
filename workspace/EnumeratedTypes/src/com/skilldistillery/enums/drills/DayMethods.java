package com.skilldistillery.enums.drills;

public class DayMethods {

  public static void main(String[] args) {
    // Iterate through the Day constants, printing each Day name.

    // If the name contains the letter R, add a "*" next to it.
	  
	  Day[] values = Day.values();
	  
	  for(int i = 0; i < values.length; i++) {
		  Day d = values[i];
		  String name = d.toString();
		  System.out.print(name);
		  if(name.contains("r")) {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
	  
	  
  }

}
