package drills;

class Student {
	String name;
	int num;
	double something;
	String anotherName;

}

public class BreakArray {

	public static void main(String[] args) {

		Student studes[] = new Student[3];

		studes[0] = new Student();
		studes[0].name = "Miguel";
		studes[0].num = (int)(Math.random() * 10);
		studes[0].something = 9.98;
		studes[0].anotherName = "Marsiglia";
		System.out.println(studes[0].num);

	}
}
