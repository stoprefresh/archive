package com.skilldistillery.abstractclasses.labs.vehicles;

public class ShapeApp {

	public static void main(String[] args) {
		
		ShapeApp tester = new ShapeApp();
		
		tester.launch();
		
	}

	private void launch() {
		Shape newShapes[] = new Shape[3];

		newShapes[0] = new Circle(5.5);
		newShapes[1] = new Rectangle(5, 4);
		newShapes[2] = new Rectangle(6.4, 5.6);
		
		for (int i = 0; i < newShapes.length; i++) {
			System.out.println();
			System.out.println(newShapes[i].getArea());
			System.out.println();
		}
	}
}
