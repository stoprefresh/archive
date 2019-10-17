package com.skilldistillery.inheritance.drills;

public class EmployeeApp {

	public static void main(String[] args) {

		Employee paul = new Employee("Paul", "Banta", 28, "Instructor", 59.99);
		System.out.println(paul.getInfo());
		
		
		Person paul2 = new Person("Paul", "Banta", 28);
		System.out.println(paul2.getInfo());
//		EmployeeApp app = new EmployeeApp();
//
//		app.run();
	}

//	private void run() {
//		Person pers = null;
//		// Create a Person object and assign it to pers. Give the person a firstName,
//		// lastName, and age using either the constructor or setters.
//
//		// Call getInfo() and print the Person's information to the screen.
//
//		Employee emp2 = null;
//		// Create an Employee object using the five-argument constructor, and
//		// assign it to emp2.
//
//		// Call getInfo() and print the Employee's information to the screen.
//
//	}

}
