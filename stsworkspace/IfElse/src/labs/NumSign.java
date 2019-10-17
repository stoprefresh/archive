package labs;

import java.util.Scanner;

public class NumSign {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int someNum;

		System.out.println("Enter a number: ");
		someNum = keyboard.nextInt();

		if (someNum % 2 == 0) {
			System.out.println("This number is even.");

		} else
			System.out.println("This number is odd.");

		keyboard.close();

	}

}
