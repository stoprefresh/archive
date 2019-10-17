package labs;

import java.util.Scanner;

public class NumSignZero {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int someNum;

		System.out.println("Enter a number: ");
		someNum = keyboard.nextInt();

		if (someNum == 0) {
			System.out.println("The Number entered is 0.");
		} else if (someNum % 2 != 1) {
			System.out.println("The number is even.");
		} else
			System.out.println("The number is odd.");

		keyboard.close();

	}

}
