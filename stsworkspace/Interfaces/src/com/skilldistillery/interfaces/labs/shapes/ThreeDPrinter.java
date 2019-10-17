package com.skilldistillery.interfaces.labs.shapes;

import java.util.*;

public class ThreeDPrinter {

	
	private ThreeDPrintable[] threeD;
	
	
	public void threeDAdd() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many 3D objects?");
		
		int count = sc.nextInt();
		threeD = new ThreeDPrintable[count];
		for(int i = 0; i < count; i++) {
			ThreeDPrintable n3D = new ThreeDModel();
			threeD[i] = n3D;
		}
		sc.close();
	}
	
	public void printAll3DObjects() {
		for(int i = 0; i < threeD.length; i++) {
			System.out.println(threeD[i].getClass().getSimpleName());
		}
	}
}
