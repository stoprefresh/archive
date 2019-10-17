package labs;

import java.util.Scanner;

public class IfCelsFahrSwitch {

	public static void main(String[] args) {

		double convertedNum;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter a temperature: ");
		double tempNum = keyboard.nextDouble();

		System.out.println("Enter Celsius or Fahrenheit: ");
		String tempType = keyboard.next();

		switch (tempType) {
		case "C":
		case "c":
		case "Celsius":
		case "celsius":
			convertedNum = ((9.0 / 5.0) * tempNum) + 32;
			System.out.println(tempNum + " degrees Celsius is " + convertedNum + " degrees Fahrenheit");
			break;

		case "F":
		case "f":
		case "Fahrenheit":
		case "fahrenheit":
			convertedNum = (tempNum - 32) * (5.0 / 9.0);
			System.out.println(tempNum + " degrees Fahrenheit is " + convertedNum + " degrees Celsius");
			break;

		default:
			System.out.println("Error: Invalid scale.");

		}

		keyboard.close();
	}

}
