import java.util.Scanner;

public class TriangleCalcTest {

		public static void main(String[] args) {
			
			
			testEquals(15, calculateTriangle(getNumber()));
			
			
			
		}
		
		public static boolean testEquals(int expected, int test) {
			boolean solution;
			
			if (expected == test) {
				System.out.println("Passed!");
				solution = true;
			}
			else {
				System.out.println("Failed!");
				solution = false;
			}
			
			
			return solution;
		}
		
		public static int calculateTriangle(int n) {

			int nTh = n, counter = 0, total = 0;

			while (counter <= nTh) {

				total = counter + total;
				counter++;

			}

			return total;

		}

		public static int getNumber() {

			Scanner kb = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int num = kb.nextInt();

			kb.close();

			return num;

		}

		

}
