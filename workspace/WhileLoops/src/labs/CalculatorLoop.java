package labs;

import java.util.Scanner;

public class CalculatorLoop {

	public static void main(String[] args) {

		calcLoop();

	}

	public static void calcLoop() {

		Scanner kb = new Scanner(System.in);
		double input1, input2;
		String mathInput;

		do {

			System.out.println("Please enter one of the following: +, -, *, /, %  (enter quit or exit to stop)");
			mathInput = kb.next();

			boolean endProg = mathInput.equals("quit") || mathInput.equals("exit") || mathInput.equals("EXIT")
					|| mathInput.equals("QUIT");

			if (endProg) {
				System.out.println("Exiting Program!");
				break;
			} else {
				System.out.println("Plesase enter a number: ");
				input1 = kb.nextDouble();

				System.out.println("Please enter a second number: ");
				input2 = kb.nextDouble();

				if ((mathInput.equals("+")) || (mathInput.equals("add")) || (mathInput.equals("plus"))) {
					add(input1, input2);
				} else if ((mathInput.equals("-")) || (mathInput.equals("subtract")) || (mathInput.equals("minus"))) {
					subtract(input1, input2);
				} else if ((mathInput.equals("*")) || (mathInput.equals("multiply")) || (mathInput.equals("times"))) {
					multiply(input1, input2);
				} else if ((mathInput.equals("/")) || (mathInput.equals("divide")) || (mathInput.equals("division"))) {
					divide(input1, input2);
				} else if ((mathInput.equals("%")) || (mathInput.equals("modulus")) || (mathInput.equals("remains"))) {
					modulus(input1, input2);
				} else {
					System.out.println("\nInvalid entry, try again.");
				}

			}

		} while (true);

		kb.close();

	}

	public static void add(double input1, double input2) {
		double total;
		total = input1 + input2;
		System.out.println("The answer is " + total + "\n");
	}

	public static void subtract(double input1, double input2) {
		double total;
		total = input1 - input2;
		System.out.println("The answer is " + total + "\n");
	}

	public static void multiply(double input1, double input2) {
		double total;
		total = input1 * input2;
		System.out.println("The answer is " + total + "\n");
	}

	public static void divide(double input1, double input2) {
		double total;
		total = input1 / input2;
		System.out.println("The answer is " + total + "\n");
	}

	public static void modulus(double input1, double input2) {
		double total;
		total = input1 % input2;
		System.out.println("The answer is " + total + "\n");

	}
}
