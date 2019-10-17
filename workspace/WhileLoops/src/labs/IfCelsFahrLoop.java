package labs;

import java.util.Scanner;

public class IfCelsFahrLoop {

	public static void main(String[] args) {

		double tempFahr, tempCels, someNum;
		int count = 1;
		Scanner keyboard = new Scanner(System.in);
		
		do {
			
			System.out.println("Please enter a scale of temperature: ");
			String something = keyboard.next();

			if (something.equals("c") || something.equals("C") || something.equals("celsius")
					|| something.equals("Celsius")) {
				System.out.println("Please enter a temp in Celsius: ");
				someNum = keyboard.nextDouble();
				tempFahr = (1.8 * someNum) + 32;
				System.out.println("The temperature in Fahrenheit is: " + tempFahr);
				count++;

			} else if (something.equals("f") || something.equals("F") || something.equals("fahrenheit")
					|| something.equals("Fahrenheit")) {
				System.out.println("Please enter a temp in Fahrenheit: ");
				someNum = keyboard.nextDouble();
				tempCels = (5.0 / 9.0) * (someNum - 32);
				System.out.println("The temperature in Celsius is: " + tempCels);
				count++;
			} else
				System.out.println("Not a valid input.");
		} while (count < 5);
		
		System.out.println("\nFive temperatures converted!");

		keyboard.close();
	}

}
