package com.skilldistillery.polymorphism.labs.vehicles;

public abstract class FlyingVehicle extends Vehicle{


	protected double airSpeed, range;
	
	
	public FlyingVehicle(double purchasePrice, double airSpeed, double range) {
		super(purchasePrice);
		setAirSpeed(airSpeed);
		setRange(range);
		
	}

	public double getAirSpeed() {
		return airSpeed;
	}

	public void setAirSpeed(double airSpeed) {
		this.airSpeed = airSpeed;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}
}
