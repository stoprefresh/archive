package com.skilldistillery.wrapperclasses.labs;

import java.util.Scanner;

public class ParseArgs {

	public static void main(String[] args) {

		String x, y;

		ParseArgs pa = new ParseArgs();
		Scanner kb = new Scanner(System.in);

		System.out.println("Enter a number:");

		x = kb.nextLine();

		System.out.println("true or false");

		y = kb.nextLine();

		pa.tester(x, y);

		kb.close();

	}

	public void tester(String arg1, String arg2) {

		int x = Integer.parseInt(arg1);
		boolean y = Boolean.parseBoolean(arg2);

		System.out.println("\n" + x);
		System.out.println("\n" + y);

		if (y == true) {
			for (int i = 0; i <= x; i++) {
				System.out.println(i);
			}

		} else {
			for (int i = 0; i <= x; x--) {
				System.out.println(x);
			}
		}

	}
}
