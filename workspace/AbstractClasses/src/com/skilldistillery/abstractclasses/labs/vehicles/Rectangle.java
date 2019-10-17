package com.skilldistillery.abstractclasses.labs.vehicles;

public class Rectangle extends Shape {

	private double width, height;

	
	public Rectangle(double width, double height){
		setWidth(width);
		setHeight(height);
	}
	
	public double getArea(double width, double height) {
		double getArea = width * height;
		System.out.println("The area is " + getArea);
		return getArea;
	}
	
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
