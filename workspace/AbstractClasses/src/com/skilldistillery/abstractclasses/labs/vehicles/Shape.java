package com.skilldistillery.abstractclasses.labs.vehicles;

public abstract class Shape {

	private int x, y;
	
	

	public Shape() {}
	
	public Shape(int x, int y) {
		super();
		setX(x);
		setY(y);
	}
	
	public abstract double getArea();
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
}


