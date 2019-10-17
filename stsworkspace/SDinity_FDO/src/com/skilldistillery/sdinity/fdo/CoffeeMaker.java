package com.skilldistillery.sdinity.fdo;

public class CoffeeMaker extends KitchenAppliance implements Switchable, Fillable{
	private boolean on;
	private int percentFull;
	
	public CoffeeMaker() {
	}

	@Override
	public void turnOn() {
		
	}

	@Override
	public void turnOff() {
		
	}

	@Override
	public boolean isOn() {
		return false;
	}
	
	public void fill(int g) {
		System.out.println("Filling up the CoffeMaker with " + g + " amount of liquid.");
	}
	
	public void startBrewing() {
		
	}

	@Override
	public String toString() {
		return "CoffeeMaker [on=" + on + ", percentFull=" + percentFull + "]";
	}

}
