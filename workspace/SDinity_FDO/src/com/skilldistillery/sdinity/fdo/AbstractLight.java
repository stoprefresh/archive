package com.skilldistillery.sdinity.fdo;

public abstract class AbstractLight implements Switchable {
	boolean on;
	int lumens;

	public AbstractLight() {
		}
	
	public abstract void changeBulb();

	public int getLumens() {
		return lumens;
	}

	public void setLumens(int lumens) {
		this.lumens = lumens;
	}
	
	
}
