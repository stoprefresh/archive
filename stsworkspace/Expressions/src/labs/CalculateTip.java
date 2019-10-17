package labs;

import java.util.Scanner;

public class CalculateTip {
	public static void main(String[] args) {
		double check, tip1, tip2, tip3;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the amount of a check: ");
		check = keyboard.nextDouble();
		
		tip1 = .1 * check;
		tip2 = .15 * check;
		tip3 = .2 * check;
		
		System.out.println("10% tip: " + tip1 + "\t15% tip: " + tip2 + "\t20% tip: " +tip3);
		
		keyboard.close();
		
		
	}

}
