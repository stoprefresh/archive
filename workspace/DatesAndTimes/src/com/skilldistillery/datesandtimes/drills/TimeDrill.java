package com.skilldistillery.datesandtimes.drills;

import java.time.*;

public class TimeDrill {

  public static void main(String[] args) {
    // Create a LocalDate and a LocalTime representing the current
    // date and time.
    LocalDate curDate = LocalDate.now();
    LocalTime curTime = LocalTime.now();
    
    System.out.println(curDate + " : " + curTime); 
    // Print both out.
    
    // Use the LocalTime above to create a LocalTime for 90 minutes in the future, and print it out.
   
    System.out.println(curTime.plusMinutes(90));
    // What happens if you use your original LocalTime to create a LocalTime for 22 hours in the future?
    System.out.println(curTime.plusHours(22));

  }

}
