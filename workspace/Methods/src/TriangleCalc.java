import java.util.Scanner;

public class TriangleCalc {

	public static void main(String[] args) {
		
		int n = getNumber();
		
		System.out.println("The calculated Triangle is: " + calculateTriangle(n));
		
		System.out.println("or " + calculateTriangleString(n));
		
		stringTestEquals(("1 + 2 + 3 + 4 + 5"), calculateTriangleString(n));
		
		testEquals(15, calculateTriangle(n));
	}
	
	public static boolean testEquals(int expected, int test) {
		boolean solution;
		
		if (expected == test) {
			System.out.println("Count Test Passed!");
			solution = true;
		}
		else {
			System.out.println("Count Test Failed!");
			solution = false;
		}

		return solution;
	}
	
	public static void stringTestEquals(String test, String output) {

		if (test.equals(output)) {
			System.out.println("String Test Passed!");
		} 
		else {
			System.out.println("String Test Failed!");
		}

	}

	public static String calculateTriangleString(int n) {
		String output = "";
		int nTh = n, counter = 0;

		while (counter <= nTh) {
			if (counter == 0) {
				counter++;
			} else if (counter < nTh) {
				output += (counter + " + ");
				counter++;
			} else {
				output += counter;
				counter++;
			}
		}

		return output;
	}

	public static int calculateTriangle(int n) {

		int nTh = n, counter = 0, total = 0;

		while (counter <= nTh) {

			total = counter + total;
			counter++;
		}

		return total;

	}

	public static int getNumber() {

		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = kb.nextInt();

		kb.close();

		return num;

	}

}
