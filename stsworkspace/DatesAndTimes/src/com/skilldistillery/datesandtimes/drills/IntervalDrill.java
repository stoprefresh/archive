package com.skilldistillery.datesandtimes.drills;

import java.time.*;

public class IntervalDrill {

  public static void main(String[] args) {
    IntervalDrill drill = new IntervalDrill();
    drill.launch();
  }

  private void launch() {
    // Create a LocalDate representing the start date of your cohort.
    LocalDate startClass = LocalDate.of(2019, 05, 6);
	  
    // Create a LocalDate representing today.
    LocalDate curDate = LocalDate.now();
    // Print out both dates.
    System.out.println(startClass + " : " + curDate);
    // Create a Period object representing the interval between the two dates, and print it.
    Period ender = Period.between(startClass, curDate);
    
    System.out.println(ender + " since start");
    // Create a LocalTime representing when you arrived today.
    LocalTime arriveToday = LocalTime.of(8, 25);
    // Create a LocalTime representing now.
    LocalTime curTime = LocalTime.now();
    // Print out both times.
    
    System.out.println(arriveToday + " : " + curTime);
    // Create a Duration object for the interval between now and when you arrived, and print it.
    Duration timeSince = Duration.between(arriveToday, curTime);
    // What happens if you try to create a Duration representing
    // the interval between your cohort start date and today?
    System.out.println(timeSince);
    
    Duration timeOf = Duration.between(startClass, curDate);
//    System.out.println(timeOf); This is a runtime error!!!!
    
  }

}
