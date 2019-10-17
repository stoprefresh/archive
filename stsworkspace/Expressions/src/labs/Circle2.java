package labs;

import java.util.Scanner;

public class Circle2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double radius, circumference, area;
		System.out.println("What is the radius of the circle?");
		radius = keyboard.nextDouble();

		circumference = 2 * Math.PI * radius;

		System.out.println("The circumference of the circle is " + circumference);

		area = Math.PI * (radius * radius);

		System.out.println("The area of the circle is " + area);

		keyboard.close();

	}

}
