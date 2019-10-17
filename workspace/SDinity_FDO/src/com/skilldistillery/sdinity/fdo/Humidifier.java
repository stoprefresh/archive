package com.skilldistillery.sdinity.fdo;

public class Humidifier implements Fillable, Switchable {
	private int percentFull;
	
	public Humidifier() {
	}
	
	
	
	public int getPercentFull() {
		return percentFull;
	}



	public void setPercentFull(int percentFull) {
		this.percentFull = percentFull;
	}



	@Override
	public void fill(int g) {
		this.fill(g);
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
