package labs;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		double input1, input2, total;
		String mathInput;

		System.out.println("Plesase enter a number: ");
		input1 = keyboard.nextDouble();

		System.out.println("Please enter a second number: ");
		input2 = keyboard.nextDouble();

		System.out.println("Please enter one of the following: +, -, *, /, %  ");
		mathInput = keyboard.next();

		switch (mathInput) {

		case "add":
		case "plus":
		case "+":
			total = input1 + input2;
			System.out.println("The answer is " + total);
			break;

		case "subtract":
		case "minus":
		case "-":
			total = input1 - input2;
			System.out.println("The answer is " + total);
			break;

		case "mutiply":
		case "times":
		case "*":
			total = input1 * input2;
			System.out.println("The answer is " + total);
			break;

		case "divide":
		case "division":
		case "/":
			total = input1 / input2;
			System.out.println("The answer is " + total);
			break;

		case "modulus":
		case "remainder":
		case "%":
			total = input1 % input2;
			System.out.println("The answer is: " + total);
			break;

		default:
			System.out.println("Operation not valid!");

		}

		keyboard.close();

	}

}
