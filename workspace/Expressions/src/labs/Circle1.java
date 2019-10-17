package labs;

import java.util.Scanner;

public class Circle1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double radius, circumference;
		System.out.println("What is the radius of the circle?");
		radius = keyboard.nextDouble();

		circumference = 2 * Math.PI * radius;

		System.out.println("The circumference of the circle is " + circumference);

		keyboard.close();

	}

}
