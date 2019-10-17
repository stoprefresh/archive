package com.skilldistillery.sdinity.fdo;

public abstract class KitchenAppliance extends HomeDevices {
	private boolean dishwasherSafe;
	
	public KitchenAppliance() {
	}

	public boolean isDishwasherSafe() {
		return dishwasherSafe;
	}

	public void setDishwasherSafe(boolean dishwasherSafe) {
		this.dishwasherSafe = dishwasherSafe;
	}

	
}
