package labs;

import com.skilldistillery.encapsulation.solutions.Car;

public class ParkingLot {

	private static int MAX_CARS = 100;
	private Car car[];
	private int numCars = 0;
	
	
	
	public void parkingLot() {
		car = new Car[MAX_CARS];
	}
	
	public void addCar(Car car) {
		this.car[numCars] = car;
		numCars++;
	}
	
	public Car[] getCars() {
	    Car[] carCopy;
	    carCopy = new Car[numCars];
	    for(int i=0; i < numCars; i++) {
	      carCopy[i] = car[i];
	    }
	    
	    return carCopy;
	  }
	
	
	
}
