package com.skilldistillery.objs.drills;

public class Tricycle {
public static int NUMBER_OF_WHEELS = 3;
public String color;
	
	public static void main(String[] args) {
		
		Tricycle trike;
		
		trike = new Tricycle();
		
		trike.color = "green";
		
		System.out.println(Tricycle.NUMBER_OF_WHEELS + " " + trike.color);
	}
	
}
