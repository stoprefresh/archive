package labs;

import java.util.Scanner;

public class IfCelsFahr {

	public static void main(String[] args) {

		String something;

		double tempFahr, tempCels, someNum;

		Scanner keyboard = new Scanner(System.in);
		for(int i = 1; i <= 5; i++) {
			
			
		System.out.println("Please enter a scale of temperature: ");
		something = keyboard.next();

		if (something.equals("c") || something.equals("C") || something.equals("celsius")
				|| something.equals("Celsius")) {
			System.out.println("Please enter a temp in Celsius: ");
			someNum = keyboard.nextDouble();
			tempFahr = (1.8 * someNum) + 32;
			System.out.println("The temperature in Fahrenheit is: " + tempFahr);

		} else if (something.equals("f") || something.equals("F") || something.equals("fahrenheit")
				|| something.equals("Fahrenheit")) {
			System.out.println("Please enter a temp in Fahrenheit: ");
			someNum = keyboard.nextDouble();
			tempCels = (5.0 / 9.0) * (someNum - 32);
			System.out.println("The temperature in Celsius is: " + tempCels);
		} else
			System.out.println("Not a valid input.");
		}
		keyboard.close();

	}

}
