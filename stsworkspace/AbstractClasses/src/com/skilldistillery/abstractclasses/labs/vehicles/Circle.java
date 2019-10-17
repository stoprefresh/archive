package com.skilldistillery.abstractclasses.labs.vehicles;

public class Circle extends Shape{

	private double radius;

	
	public Circle() {}
	
	public Circle(double radius) {
		setRadius(radius);
	}
	
	@Override
	public double getArea(double radius) {
		System.out.println("The area is " + Math.PI * Math.pow(radius, 2));
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	
}
