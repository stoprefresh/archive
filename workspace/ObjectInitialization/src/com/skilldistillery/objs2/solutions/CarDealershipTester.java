package com.skilldistillery.objs2.solutions;

public class CarDealershipTester {

  public static void main(String[] args) {
    CarDealership dealership = new CarDealership();
    
    dealership.addCarToInventory(new Car("Chev", "modeler", "blue", 4));
    dealership.addCarToInventory(new Car("Chev", "modeler", "green", 4));
    dealership.addCarToInventory(new Car("For", "other", "yellow", 4));
    dealership.addCarToInventory(new Car("Foreign", "Modeler", "blue", 6));
    
    Car[] allCars = dealership.getAllCars();
    if(allCars.length != 4) {
      System.out.println("ERROR in getAllCars. Expected 4 array length but was " + allCars.length);
    }
    
    Car[] modelerCars = dealership.findCarsByModel("modeler");
    if(modelerCars == null) {
      System.out.println("ERROR in findCarsByModel. Null array.");
    }
    else {
      System.out.println("findCarsByModel null check success");
    }
    
    if(modelerCars.length != 2) {
      System.out.println("ERROR, findCarsByModel array length was " + modelerCars.length);
    }
    else {
      System.out.println("findCarsByModel length success");
    }
    
    for (int i = 0; i < modelerCars.length; i++) {
      Car c = modelerCars[i];
      if(!"modeler".equals(c.getModel())) {
        System.out.println("ERROR, car model not modeler");
      }
    }

    System.out.println("FINISHED.");
  }

}
