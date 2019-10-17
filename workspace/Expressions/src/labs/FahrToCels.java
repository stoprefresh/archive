package labs;

import java.util.Scanner;

public class FahrToCels {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double tempFahr, tempCels;

		System.out.println("Please enter the temperture in Fahrenheit: ");
		tempFahr = keyboard.nextDouble();

		tempCels = (5.0 / 9.0) * (tempFahr - 32.0);

		System.out.println("The temperature is " + tempCels + " celsius.");
		keyboard.close();
	}

}
