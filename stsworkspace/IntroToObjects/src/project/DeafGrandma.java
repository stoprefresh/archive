package project;

import java.util.Scanner;

public class DeafGrandma {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		DeafGrandma oldLady = new DeafGrandma();
		String grandmaRep;
		do {
			grandmaRep = oldLady.loudEnough(oldLady.greetGrandma(kb));
			
		} while (!grandmaRep.equals("Smell ya later Billy"));

	}

	public String greetGrandma(Scanner kb) {
		System.out.println("Say something to your Grandma");
		String response = kb.nextLine();

		return response;
	}

	public String loudEnough(String response) {

		int randomRep = (int) (Math.random() * 4);
		Grandma grandma = new Grandma();
		String herRep;

		if (response.equals("GOOD BYE!")) {
			herRep = grandma.anyRep[1][grandma.anyRep[1].length - 1];
			System.out.println(herRep);
		} else if (response.equals(response.toUpperCase())) {
			herRep = grandma.anyRep[0][randomRep];
			System.out.println(herRep);
		} else {
			herRep = grandma.anyRep[1][randomRep];
			System.out.println(herRep);
		}
		return herRep;
	}

}
