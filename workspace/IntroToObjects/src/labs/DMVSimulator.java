package labs;

import java.util.Scanner;

public class DMVSimulator {

	public static void main(String[] args) {
	
		Scanner kb = new Scanner(System.in);
		String menuSelect = "";
		 
		do {
			menuSelection();
			menuSelect = kb.next();
			
			
			switch (menuSelect) {
			case "N": 
				System.out.println("Please enter your vehicles data as prompted.");
				dataEntry(kb);
			case "C":
				
			case "E":
				
			default:
				System.out.println("Please enter a valid selction....");
			}
			
		} while(!menuSelect.equals("E"));
		
		System.out.println("Exiting DMV");
		
	
		
		kb.close();
	}
	
	public static void menuSelection() {
		System.out.println("\nPlease select one of the following:");
		System.out.println("_______________________");
		System.out.println("'N' - New Car Entry");
		System.out.println("'C' - Calculate Taxes");
		System.out.println("'E' - to Exit");
		System.out.println("_______________________");
		System.out.println();
	}
	
	public static void dataEntry(Scanner kb) {
		Car yourCar = new Car();
		System.out.println("Please enter the Make of your vehicle: ");
		yourCar.make = kb.next();
		System.out.println("\nPlease enter the Model of your vehicle: ");
		yourCar.model = kb.next();
		System.out.println("\nPlease enter the Color of your vehicle: ");
		yourCar.color = kb.next();
		System.out.println("\nPlease enter the Number of Wheels your vehicle has: ");
		yourCar.numberOfWheels = kb.nextInt();
		System.out.println("\nPlease enter the Purchase Price: ");
		yourCar.purchasePrice = kb.nextDouble();
		yourCar.displayCar();
	}
	
	public double taxCalc() {
		double taxCalc = 0.0;
		
		
		return taxCalc;
	}
	
}
