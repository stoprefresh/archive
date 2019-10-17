import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		
		story ();

	}
	public static void story() {
		Scanner input = new Scanner(System.in);
		
		String noun, adj, pNoun, verb;
		
		System.out.println("Enter a noun: ");
		noun = input.next();
		
		System.out.println("Enter a adjective: ");
		adj = input.next();
		
		System.out.println("Enter a plural noun: ");
		pNoun = input.next();
		
		System.out.println("Enter a verb: ");
		verb = input.next();
		
		System.out.println("You go to a " + noun + " and see " + adj + " " + pNoun + ".");
		
		System.out.println("You decide to " + verb + ".....!");
		
		input.close();
	}
	
}
