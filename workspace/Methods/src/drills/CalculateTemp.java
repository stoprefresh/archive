package drills;

import java.util.Scanner;

public class CalculateTemp {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		double temp;
		String type;

		System.out.println("Type a temp: ");
		temp = kb.nextDouble();
		System.out.println("Enter 'C' or 'F': ");
		type = kb.next();
		System.out.println(calculateTemp(temp, type));

		kb.close();

	}

	public static double calculateTemp(double temp, String type) {
		double adjustedTemp;

		if (type.equals("C")) { // convert to fahrenheit
			System.out.println("\nCelsius converted to Fahrenheit");
			adjustedTemp = (temp * 1.8) + 32;

		} else if (type.equals("F")) { // convert to celsius
			System.out.println("\nFahrenheit converted to Celsius");
			adjustedTemp = (temp - 32) / 1.8;
		} else {
			System.out.println("\nInvalid entry");
			adjustedTemp = -999;
		}

		return adjustedTemp;
	}

}
