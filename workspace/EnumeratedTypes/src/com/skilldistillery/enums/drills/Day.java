package com.skilldistillery.enums.drills;

public enum Day {

	SUNDAY("Domingo"),
	MONDAY("Lunes"),
	TUESDAY("Martes"), 
	WEDNESDAY("Miercoles"),
	THURSDAY("Jueves"),
	FRIDAY("Viernes"), 
	SATURDAY("Sabado");
	
	final private String name;
	
	Day(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {	
		return name;
	}
	
	public String getName() {
		return name;
	}
}
