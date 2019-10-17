package drills;

public class Iterating {

	public static void main(String[] args) {
		// Iterate through the names array to print the index of the name,
		// and the name, e.g. 0 : Mike.
		String[] names = { "Mike", "Davey", "Peter", "Mickey" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(i + ":" + names[i]);
		}
		System.out.println();
		// Iterate through the precip array, but only print
		// values greater than 2.5.
		double[] precip = new double[] { 3.2, 0.5, 1.7, 2.8, 2.0, 3.1, 0.0, 0.2, 9.0 };
		
		System.out.println();
		// Iterate through the daysOfWeek array, but do not print
		// Sunday or Saturday.
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		for (int i = 0; i < daysOfWeek.length; i++) {
			if ((!daysOfWeek[i].equals("Sunday")) && !daysOfWeek[i].equals("Saturday")) {
				System.out.println(i + ":" + daysOfWeek[i]);
			}
		}
		System.out.println(daysOfWeek);
		System.out.println();
		printArray(precip);
		System.out.println();
		
		// After iterating, print the daysOfWeek array itself:
		// System.out.println(daysOfWeek).
		// Note the format, and what doesn't get printed.
	}

	public static void printArray(double precip[]) {
		for (int i = 0; i < precip.length; i++) {
			if (precip[i] > 2.5) {
				System.out.println(i + ":" + precip[i]);
			}
		}
	}
}
