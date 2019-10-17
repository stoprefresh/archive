package drills;

public class CalculateBalanceRefactor {
	public static void main(String[] args) {
		double cost = 307.32;
		double balance = cost;

		double payment1 = 42.40;
		balance = balance - payment1;
		balancePrint(balance);

		double payment2 = 39.31;
		balance = balance - payment2;
		balancePrint(balance);
		
	}
	
	public static void balancePrint(double balance) {
		System.out.println("-----------------");
		System.out.println("---- BALANCE ----");
		System.out.println("-----------------");
		System.out.println(balance);
		System.out.println();
		
	}
	
	
}
