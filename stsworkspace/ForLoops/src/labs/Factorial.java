package labs;

public class Factorial {

	public static void main(String[] args) {

		System.out.println("a tabular format: ");
		for (int counter = 1, nTh = 10, total = 1; counter <= nTh; counter++) {
			String output = "";
			total = counter * total;
			output = (counter + "! = ");

			System.out.println(output + total);
		}
	}
}
