package com.skilldistillery.polymorphism.labs.vehicles;

public class Boat extends Vehicle {

	protected String name;
	protected double speedInKnots;
	protected int lengthInFeet;

	public Boat(double purchasePrice, String name, double speedInKnots, int lengthInFeet) {
		super(purchasePrice);
		this.name = name;
		this.speedInKnots = speedInKnots;
		this.lengthInFeet = lengthInFeet;
	}

	public int getLengthInFeet() {
		return lengthInFeet;
	}

	@Override
	public String toString() {
		return super.toString() + "Boat [name=" + name + ", speedInKnots=" + speedInKnots + ", lengthInFeet=" 
	+ lengthInFeet + "]";
	}

	@Override
	public double calculateRegistrationFee(double rate) {
		
		if (lengthInFeet >= 30) {
			setPurchasePrice(getPurchasePrice() * (rate * 2));
		} else {
			setPurchasePrice(getPurchasePrice() * (rate));
		}
		return super.calculateRegistrationFee(getPurchasePrice());

	}
}
