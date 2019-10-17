package com.skilldistillery.numeralsystems.solutions;

import java.util.Scanner;


public class test {

		public static void main(String[] args) {
			Scanner kb = new  Scanner(System.in);
			System.out.println("Enter a number: ");
			
			int theNum = kb.nextInt();
			
			theNum = somethingElse(theNum);
			
			System.out.println(theNum);
	
			kb.close();
		}
		
		public static int somethingElse(int x) {
			int result = 0;
			
			if(x % 5 == 0) {
				result = 900;
			}
			else {
				System.out.println("Not evenly divisible by 5");
			}
			
			return result;
			
		}
}
