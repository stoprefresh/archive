package NameGenApps;

import java.util.Scanner;

public class NameGenApp {

	public static void main(String[] args) {
		
		System.out.print(" Enter your first name: ");
		Scanner sc = new Scanner(System.in);

		String userFirstName = sc.next();
		
		System.out.print("\n Enter your last name: ");
		String userLastName = sc.next();
		

		NameGen genny = new NameGen();
		
		String transFirst = genny.makeFirstName(userFirstName);
		
		String transLast = genny.makeLastName(userLastName);
		
		System.out.println("Your improved name is " + transFirst + " " + transLast);

		sc.close();
	}
}
