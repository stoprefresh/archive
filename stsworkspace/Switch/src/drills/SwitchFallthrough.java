package drills;

import java.util.Scanner;

public class SwitchFallthrough {

	public static void main(String[] args) {
		System.out.println("We can now handle uppercase and lowercase grades, thanks to fall through.");
		investigate();

	}
	
	public static void investigate() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a grade: ");
		String grade = sc.next();

		switch (grade) {
		case "A":	//"A" falls through to "a" so they both print the same message
		case "a":
			System.out.println("Keep it up");
			break;
		case "B":
		case "b":
			System.out.println("Good job");
			break;
		case "C":
		case "c":
			System.out.println("Doing alright");
			break;
		case "D":
		case "d":
			System.out.println("Let's talk");
			break;
		case "F":
		case "f":
			System.out.println("You should come to class");
			break;
		default:
			System.out.println("That's not a grade");
		}
		
		sc.close();
	}

}
