package labs;

public class PrintNumbers {

	public static void main(String[] args) {

		printNumbersUpTo(150);

	}

	private static void printNumbersUpTo(int howMany) {

		for (int i = 1; i <= howMany; i++) {
			String bits = Integer.toBinaryString(i);
			System.out.printf("%n%d = Decimcal %n0%o = Octal %n0x%x = Hex %n0b%s = Binary", i, i, i, bits);
			System.out.println("");
		}

	}
}
