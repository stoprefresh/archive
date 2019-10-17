package drills;

public class WhileLoop {

	public static void main(String[] args) {

		printNumbers();

		mathRandomWhile();

	}

	public static void printNumbers() {
		int num = 1;
		while (num <= 10) {
			System.out.println(num);
			num++;
		}
	}

	public static void mathRandomWhile() {
		double num = Math.random();

		while (num < 0.7) {
			System.out.println(num);
			num = Math.random();
		}
		System.out.println("Final: " + num);
	}

}
