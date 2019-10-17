package labs;

import java.util.Scanner;

public class LoopMenu {

	public static void main(String[] args) {

		printMenu();

	}

	public static void printMenu() {
		Scanner kb = new Scanner(System.in);
		int menuSelect;

		System.out.println("\nSelect one of the following: \n");
		System.out.println("1. Greeting");
		System.out.println("2. Advice");
		System.out.println("3. Wisdom");
		System.out.println("4. Help");
		System.out.println("5. Quit");
		System.out.print(":-> ");
		menuSelect = kb.nextInt();

		if (menuSelect == 1) {
			printGreeting();
		} else if (menuSelect == 2) {
			printAdvice();
		} else if (menuSelect == 3) {
			printWisdom();
		} else if (menuSelect == 4) {
			printHelp();
		} else if (menuSelect == 5) {
			exitProgram();
		} else {
			System.out.println("\nInvalid option selected. \nTry Again");
			printMenu();
		}

		kb.close();
	}

	public static void printGreeting() {
		System.out.println("Greetings user!\n");
		printMenu();
	}

	public static void printAdvice() {
		System.out.println("\"Ensure your code is easy to read.\"\n");
		printMenu();
	}

	public static void printWisdom() {
		System.out.println("\"Gentlemen Jack will break your back.\"");
		printMenu();
	}

	public static void printHelp() {
		System.out.println("\"Select an option, enter 5 to quit.\"");
		printMenu();
	}

	public static void exitProgram() {
		System.out.println("Farewell, \nProgram is closing!");
	}

}
