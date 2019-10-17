package labs;

import java.util.Scanner;

public class NextLargestMultiple {
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int i, j, nextMultiple;
		
		System.out.println("Input an integer for j: ");
		j = keyboard.nextInt();
		System.out.println("Input an integer for i: ");
		i = keyboard.nextInt();
		
		nextMultiple = i + j - i % j;
		
		System.out.println(nextMultiple);
		
		keyboard.close();
		
	}
}
