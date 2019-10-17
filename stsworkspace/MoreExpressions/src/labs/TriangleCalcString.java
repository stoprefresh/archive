package labs;

import java.util.Scanner;

public class TriangleCalcString {
	public static void main(String[] args) {
		//Call the method to get user data
		int num = getNumber();
		
		//Use the data to get triangle
		int triangle = calculateTriangle(num);
		
		//Output the triangle
		System.out.println("The triangle of " + num + " is " + triangle);
		
		//Calculate the String and output it
		String addString = calculateTriangleString(num);
		System.out.println(addString);
		
		int fact = calculateFactoral(num);
		
		System.out.println("The factoral of " + num + " is " + fact);
		
		String addString1 = calculateFactoralString(num);
		System.out.println(addString1);

	}
	
	
	
	public static int calculateTriangle(int n) {
//		int counter = 1;
		int counter = 0;
		int sum = 0;
		
		//count up from 1 to n
		while(++counter <= n) {
//			sum = sum + counter;
			sum += counter;
//			counter++;
//			counter = counter + 1;
//			counter += 1;
		}
		
		return sum;
	}
	
	public static int getNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a positive whole number: ");
		int input = scan.nextInt();
		scan.close();
		return input;
	}
	
	public static String calculateTriangleString(int n) {
		String output = "";
		int counter = 1;
		
		//count up from 1 to n
		while(counter <= n) {
			// concatenate the number
			output = output + counter;
			
			// add a " + " if there are more numbers
			if(counter < n) {
				output = output + " + ";
			}
			
			counter = counter + 1;
		}
		return output;
	}
	
	public static int calculateFactoral(int n) {
//		
		int counter = 0;
		int fact = 1;
		
		//count up from 1 to n
		while(++counter <= n) {
//			sum = sum + counter;
			fact *= counter;
//			counter++;
//			counter = counter + 1;
//			counter += 1;
		}
		
		return fact;
	}
	
	public static String calculateFactoralString(int n) {
		String output = "";
		int counter = 1;
		
		//count up from 1 to n
		while(counter <= n) {
			// concatenate the number
			output = output + counter;
			
			// add a " + " if there are more numbers
			if(counter < n) {
				output = output + " * ";
			}
			
			counter = counter + 1;
		}
		return output;
	}
	
	
}
