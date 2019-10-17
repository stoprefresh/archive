package labs;

import java.util.Scanner;
import static java.lang.System.*;

public class MinMaxFor {

	public static void main(String[] args) {

		Scanner kb = new Scanner(in);

		out.println("How many variables would you like to use?");
		int numbers[] = new int[kb.nextInt()]

		do {
			out.println("Input " + numbers.length + " variables: ");
			for (int i = 0; i < numbers.length; i++) {
				out.println("Variable " + i + ":");
				numbers[i] = kb.nextInt();
			}
			int checkLow = 0, checkHigh = 0;

			for (int num : numbers) {
				if (checkLow == 0 && checkHigh == 0) {
					checkHigh = num;
					checkLow = num;
				} else if (num > checkHigh) {
					checkHigh = num;
				} else if (num < checkLow) {
					checkLow = num;
				}
			}

			out.println("\n__________________________");
			out.println("/////////////////////////");
			out.println("| The low number is: " + checkLow);
			out.println("| The high number is: " + checkHigh);
			out.println("/////////////////////////");
			out.println("__________________________");
			break;
		} while (true);

		kb.close();
	}
}
