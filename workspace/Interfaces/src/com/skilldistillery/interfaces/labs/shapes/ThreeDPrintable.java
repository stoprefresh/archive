package com.skilldistillery.interfaces.labs.shapes;

public interface ThreeDPrintable extends Drawable {
	
	void threeDPrint();
	
	default void generateWireFrame() {
		System.out.println();
	}
	

}
