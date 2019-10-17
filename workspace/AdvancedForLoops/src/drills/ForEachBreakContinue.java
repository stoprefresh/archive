package drills;

public class ForEachBreakContinue {

	public static void main(String[] args) {

		int[] odds = new int[] { 55, 72, -12, 105, 99, 71, -100, 39, 43 };

		for (int num : odds) {
			int odd = num % 2;
			if (odd != 0) {
				System.out.print(num + " ");
			} else if (num == -100) {
				System.out.println("=================");
				System.out.println("\n" + num + " isolating");
				System.out.println();
				continue;
			}
		}
	}
}
