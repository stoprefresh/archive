package drills;

class Instructor {
	public static String name;
	public String myName;

}

public class PlayStatic {

	public static void main(String[] args) {
		Instructor who = new Instructor();
		who.name = "Fred";

		Instructor i2 = new Instructor();
		i2.name = "Harry";

		System.out.println(i2.name);

		System.out.println(who.name);

	}

}
