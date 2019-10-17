package com.skilldistillery.lambdas.drills;


import java.util.List;
import java.util.function.Predicate;

public class FilterPlanets {

  public static void main(String[] args) {
    List<Planet> planets = PlanetUtilities.getPlanets();
    // Filter the list of Planets for those whose 
    // diameter is less than 40_000.
    

    
    List<Planet> smallP = PlanetUtilities.filterPlanets(planets, p -> p.getDiameter() < 40_000);

    List<Planet> hasA = PlanetUtilities.filterPlanets(planets, pl -> pl.getName().contains("a") || pl.getName().contains("A"));
     
    System.out.println("Smallest: " + smallP);
    System.out.println("Has an A: " + hasA);
  }

}
