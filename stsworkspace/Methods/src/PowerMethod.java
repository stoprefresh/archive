import java.util.Scanner;

public class PowerMethod {

	
		public static void main(String[] args) {
			
			Scanner kb = new Scanner(System.in);
			
			double base;
			int exponent;
			
			System.out.println("Enter a Base: ");
			base = kb.nextDouble();
			System.out.println("Enter a Exponent: ");
			exponent =kb.nextInt();
			
			System.out.println("The Base raised to the power of the exponent is: ");
			System.out.println(powerMethod(base, exponent));
			
			kb.close();
			
		}
		
		public static double powerMethod(double base, int exponent) {
			int power = 0;
			double solution = 1;
			while (power < exponent) {
				solution = base * solution;
				power++;
			}
			
			return solution;
		}
}
