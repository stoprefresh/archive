package com.skilldistillery.enums.drills;

public class DayDrills {

  // Create a method called printDay that takes a Day argument and 
  // prints it to the screen with System.out.println.
  
  // If the day is FRIDAY, SATURDAY, or SUNDAY, print the message
  // "Weekend!"
  
  private void run() {
	  
	  System.out.println(Day.MONDAY);
	  System.out.println(Day.TUESDAY);
	  System.out.println(Day.WEDNESDAY);
	  System.out.println(Day.THURSDAY);
	  System.out.println(Day.FRIDAY);
	  System.out.println(Day.SATURDAY);
	  System.out.println(Day.SUNDAY);
	  
    // call printDay with several Day values.
  }
  
  public static void main(String[] args) {
    DayDrills d = new DayDrills();
    d.run();
    
    
  }
  
  
  public void printDay(Day d) {
	  
	  if((Day.FRIDAY == d) || (Day.SATURDAY == d) || (Day.SUNDAY == d)) {
		  System.out.print(d);
		  System.out.println(" Weekend");
	  }
	  else {
		  System.out.println(d);
	  }	  
  }

}
