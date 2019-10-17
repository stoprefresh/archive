package com.skilldistillery.polymorphism.labs.vehicles;

public class Plane extends FlyingVehicle {

	private String name;
	private int totalCapacity;
	
	
	public Plane(double purchasePrice, double airSpeed, double range, String name, int totalCapacity) {
		super(purchasePrice, airSpeed, range);
		setName(name);
		setTotalCapacity(totalCapacity);
	}


	@Override
	public String toString() {
		return "Plane [name=" + name + ", totalCapacity=" + totalCapacity + ", airSpeed=" + airSpeed + ", range="
				+ range + "]";
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getTotalCapacity() {
		return totalCapacity;
	}


	public void setTotalCapacity(int totalCapacity) {
		this.totalCapacity = totalCapacity;
	}
	
	
	
}
