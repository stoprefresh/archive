package com.skilldistillery.polymorphism.labs.vehicles;

import java.util.Scanner;

public class TravelingTest {

	public static void main(String[] args) {

		TravelingTest va = new TravelingTest();
		va.run();

	}

	public void run() {
		Scanner kb = new Scanner(System.in);
		double numberOfP;
		Vehicle vehicleArr[] = new Vehicle[8];

		Plane p1 = new Plane(8500.00, 456.0, 500.55, "Big Momma", 5);
		Plane p2 = new Plane(8500.00, 456.0, 500.55, "Turkey Shoot", 75);
		Plane p3 = new Plane(8500.00, 456.0, 500.55, "Rickty ol'Dog", 144);
		Automobile a1 = new Automobile(90000.00, "Toyota", "4Runner", 2018, 4, 105);

		vehicleArr[0] = p1;
		vehicleArr[1] = a1;
		vehicleArr[2] = p2;
		vehicleArr[3] = p3;

		do {
			System.out.print("How many passengers will be traveling today?");
			numberOfP = kb.nextDouble();
			if (numberOfP <= 0.0) {
				System.out.println("\n*****[Please enter a valid number]*****\n");
			}
		} while (numberOfP <= 0.0);

		for (Vehicle vInstance : vehicleArr) {

			if (vInstance != null) {
				if (vInstance instanceof Automobile) {
					if (numberOfP >= 1.0 && numberOfP <= 4.0) {
						System.out.println("This vehicle is availble currently:\n  Make:" + ((Automobile) vInstance).getMake()
								+ " Model:" + ((Automobile) vInstance).getModel() + " Year:" + ((Automobile) vInstance).getYear());
						break;
					}
				} else if (vInstance instanceof Plane) {
					if (numberOfP > 4.0 && numberOfP <= ((Plane) vInstance).getTotalCapacity()) {
						System.out.println("\nYou will use the plane " + (((Plane) vInstance).getName()));
						System.out.println(
								"This is a plane capable of carrying " + ((Plane) vInstance).getTotalCapacity() + " souls.");
						System.out.println("Hope it works!?!?!?!");
						break;
					}
				}
			}
		}
		kb.close();

		System.out.println("\nExiting the selection.\n");
	}
}
