package drills;

public class ArrayReferences {

	public static void main(String[] args) {
		String[] daysOfWeek = new String[7];
		daysOfWeek[0] = "Sunday";
		daysOfWeek[1] = "Monday";
		daysOfWeek[2] = "Tuesday";
		daysOfWeek[3] = "Wednesday";
		daysOfWeek[4] = "Thursday";
		daysOfWeek[5] = "Friday";
		daysOfWeek[6] = "Saturday";
		// Print the array
		for (int i = 0; i < daysOfWeek.length; i++) {
			System.out.print(daysOfWeek[i]);
			if (i != daysOfWeek.length - 1) { // don't do this for the last index
				System.out.print(", ");
			}
		}
		System.out.println();

		// * Call the changeArray method and pass the daysOfWeek array reference.
		changeArray(daysOfWeek);

		// Print the array again to see that its elements have changed,
		// but it is the same array.
		for (int i = 0; i < daysOfWeek.length; i++) {
			System.out.print(daysOfWeek[i]);
			if (i != daysOfWeek.length - 1) { // don't do this for the last index
				System.out.print(", ");
			}
		}

		// * Refactor the printing of the array into a method and pass it the daysOfWeek
		// array reference.

	}

	public static void changeArray(String[] inputArr) {
		// * Change Wednesday to "HUMPDAY" and Friday to "Viernes".
		// * (There is no need to iterate, just change the right index.)
		inputArr[3] = "Humpday";
		inputArr[5] = "Viernes";

		String inputArrs[] = inputArr;
		System.out.println(inputArrs.length);
		for (int i = 0; i < inputArrs.length; i++) {
			System.out.print(inputArrs[i]);
			if (i != inputArrs.length - 1) { // don't do this for the last index
				System.out.print(", ");
			}
			// * Reassign inputArr to a new array containing the values
			// * "Su", "M", "T", "W", "Th", "F", "Sa"

		}
		System.out.println();
	}
}
