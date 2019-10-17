import java.util.Scanner;

public class NewClass {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Hi, what's your name?");
		String name = keyboard.nextLine();
		
		System.out.println("Welcome to Eclipse, " + name);

		keyboard.close();

	}
}
	
