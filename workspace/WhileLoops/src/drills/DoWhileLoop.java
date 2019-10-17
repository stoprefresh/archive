package drills;

public class DoWhileLoop {

	public static void main(String[] args) {

		countUp();
		
		randomNum();
		
		System.out.println("\nClosing Program!");
	}

	public static void countUp() {
		int num = 0;
		do {
			num++;
			System.out.println(num);

		} while (num < 10);
		System.out.println("");
	}

	public static void randomNum() {

		double num;

		do {
			num = Math.random();
			System.out.println(num);

		} while (num < 0.7);
		System.out.print("^---- Final -----^\n");
	}
}
