package drills;

import java.util.Scanner;

public class WhileLoopSteps {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Input a number to be * by 2: ");
		int num = sc.nextInt();

		while (num != 0) {
			num *= 2;
			System.out.println("Total:" + num);
			System.out.println("Input a number to be * by 2: ");
			num = sc.nextInt();

		}
		System.out.println("Closing program!");

		sc.close();
	}

}

