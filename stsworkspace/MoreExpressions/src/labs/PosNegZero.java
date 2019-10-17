package labs;

import java.util.Scanner;

public class PosNegZero {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a whole number: ");
		int number = input.nextInt();

		String sign = number > 0 ? "positive" : number < 0 ? "negative" : "zero";

		System.out.println(number + " is " + sign);

		input.close();
	}
}
