package com.skilldistillery.encapsulation.solutions;

public class ParkingLot {
  private Car[] cars;
  private int numCars = 0;
  
  private static int MAX_CARS = 100;
  
  public ParkingLot() {
    cars = new Car[MAX_CARS];
  }
  public void addCar(Car c) {
    cars[numCars] = c;
    numCars++;    // increment to reflect that we have one more car
  }
  
  public Car[] getCars() {
    Car[] carCopy;
    carCopy = new Car[numCars];
    for(int i=0; i < numCars; i++) {
      carCopy[i] = cars[i];
    }
    
    return carCopy;
  }
}
