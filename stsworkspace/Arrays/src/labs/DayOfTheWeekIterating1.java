package labs;

public class DayOfTheWeekIterating1 {

	public static void main(String[] args) {

		String daysWeek[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		System.out.println(daysWeek[1]);
		System.out.println(daysWeek[2]);
		System.out.println(daysWeek[3]);
		System.out.println(daysWeek[4]);
		System.out.println(daysWeek[5]);
		System.out.println();

		for (int i = 0; i < daysWeek.length; i++) {

			if (!daysWeek[i].equals("Sunday") && !daysWeek[i].equals("Saturday")) {
				System.out.println(i + " : " + daysWeek[i]);
			}

		}

	}
}