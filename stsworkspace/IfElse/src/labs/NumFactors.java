package labs;

import java.util.Scanner;

public class NumFactors {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int someNum;

		System.out.println("Enter a number: ");
		someNum = keyboard.nextInt();

		if (someNum == 0) {
			System.out.println("The number is 0.");

		} else if (someNum % 2 == 0) {
			System.out.println("The number is even.");
			if (someNum % 10 == 0) {
				System.out.println("The number is also divisible by 10.");
				if (someNum % 100 == 0) {
					System.out.println("The number is also divisible by 100.");
				}
			}
		} else {
			System.out.println("The number is odd.");
		}
		keyboard.close();

	}
}
