package com.skilldistillery.inheritance.drills;

public class Employee extends Person {
	// Fields
	private String title;
	private double salary;

	// Contructors
	public Employee() {
	}

	public Employee(String firstName, String lastName, int age, String title, double salary) {
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		this.salary = salary;
	}

	// Methods
	public String getInfo() {
		return getName()
				+ age + " " + title + " " + salary;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
