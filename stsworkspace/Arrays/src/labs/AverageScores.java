package labs;

import java.util.Scanner;

public class AverageScores {

	public static void main(String[] args) {

//		int arrayFive[] = new int[5];
		int highestNum = 0;
		Scanner kb = new Scanner(System.in);

		System.out.println("How many scores would you like to enter?");
		int arrayFive[] = new int[kb.nextInt()];

		for (int i = 0; i < arrayFive.length; i++) {
			System.out.println("Please enter a integer for Array " + i + ":");
			arrayFive[i] = kb.nextInt();
		}

		System.out.println("The Average for the entered values is: " + calculateAverage(arrayFive));
		System.out.println();

		highestNum = arrayFive[0];
		for (int i = 0; i < arrayFive.length; i++) {
			if (highestNum < arrayFive[i]) {
				highestNum = arrayFive[i];
				System.out.println(arrayFive[i] + " is now the highest number entered.");
			} else if (highestNum > arrayFive[i]) {
				System.out.println(highestNum + " is still the hightest number entered.");
			}
		}

		kb.close();
	}

	public static double calculateAverage(int someArray[]) {
		double calAverage = 0;

		for (int i = 0; i < someArray.length; i++) {
			calAverage = someArray[i] + calAverage;
		}
		calAverage = calAverage / someArray.length;

		return calAverage;
	}

//	public static void testCalculateAverage(double calAverage, int someArray[]) {
//		double testAvg = ((someArray[0] + someArray[1] + someArray[2] + someArray[3] + someArray[4]) / someArray.length);
//
//		if (testAvg == calAverage) {
//			System.out.println("Test Passed.");
//		} else {
//			System.out.println("Test Failed.");
//		}
//	}
}
