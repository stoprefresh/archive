package com.skilldistillery.exceptions.labs.shapes;

public class ShapeTester {

	public static void main(String[] args) {
		ShapeTester tester = new ShapeTester();
		tester.test();
	}

	private void test() {

		Shape[] shapes = new Shape[10];

		try {
			shapes[0] = new Circle(2.2);	
		} catch (IllegalArgumentException ex) {
			System.err.println(ex);
		}

		try {
			shapes[2] = new Circle(0);
		} catch (IllegalArgumentException ex) {
			System.err.println(ex);
		}

		try {
			shapes[1] = new Rectangle(2.0, 4.0);
		} catch (IllegalArgumentException ex) {
			System.err.println(ex);
		}
		
		try {
			shapes[3] = new Rectangle(3.0, -5.0);
		} catch (IllegalArgumentException ex) {
			System.err.println(ex);
		}
		
		try {
			shapes[4] = new Rectangle(17.7, 31.1);
		} catch (IllegalArgumentException ex) {
			System.err.println(ex);
		}

		printShapes(shapes);

	}

	private void printShapes(Shape[] shapes) {
		for (Shape shape : shapes) {
			if (shape != null) {
				System.out.println(shape + ", area=" + shape.getArea());
			}
		}
	}

}
