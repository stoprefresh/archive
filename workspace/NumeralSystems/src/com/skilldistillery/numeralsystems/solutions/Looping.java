package com.skilldistillery.numeralsystems.solutions;

public class Looping {

	public static void main(String[] args) {

		chorus(8);
		System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
		chorus(2);

	}

	public static void chorus(int times) {

		for (int i = 0; i < times; i++) {
			System.out.println("Gimme the loop");
			System.out.println("Gimme the loop");

			if (i == times - 1) {
				System.out.println("What's mine is mines and what's yours is mines");
			} else {
				System.out.println("Imma bad boy");
			}
			System.out.println("==============");
		}

	}
}
