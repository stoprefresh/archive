package drills;

public class ForEach {


	public static void main(String[] args) {
//		forLoop1();
//		forEachLoop1();
//		forLoop2();
//		forEachLoop2();
//		forLoop3();
//		forEachLoop3();
		forEachLoop4();
	}

	static void forLoop1() {
		int[] intArr = { 10, 20, 30, 40 };
		for (int i = 0; i < intArr.length; i++) {
			int num = intArr[i];
			System.out.print(num + " ");
		}
		System.out.println("--end forLoop1");
		System.out.println();
	}

	static void forEachLoop1() {
		int[] intArr = { 10, 20, 30, 40 };

		for (int num : intArr) {
			System.out.print(num + " ");
		}

		System.out.println("--end forEachLoop1");
		System.out.println();
	}

	static void forLoop2() {
		String[] strings = new String[4];
		strings[0] = "First";
		strings[1] = "Second";
		strings[2] = "Third";
		strings[3] = "Fourth";

		for (int i = 0; i < strings.length; i++) {
			String s = strings[i];
			System.out.print(s + " ");
		}
		System.out.println("--end forLoop2");
		System.out.println();
	}

	static void forEachLoop2() {
		String[] strings = new String[4];
		strings[0] = "First";
		strings[1] = "Second";
		strings[2] = "Third";
		strings[3] = "Fourth";

		for (String num : strings) {
			System.out.print(num + " ");
		}

		System.out.println("--end forEachLoop2");
		System.out.println();
	}

	static void forLoop3() {
		double doubleArr[] = { 1.1, 2.2, 3.3, 4.4 };
		for (int i = 0; i < doubleArr.length; i++) {
			System.out.print(doubleArr[i] + " ");
		}
		System.out.println("--end forLoop3");
		System.out.println();
	}

	static void forEachLoop3() {
		double doubleArr[] = { 1.1, 2.2, 3.3, 4.4 };

		for (double num : doubleArr) {
			System.out.print(num + " ");
		}

		System.out.println("--end forEachLoop3");
		System.out.println();
	}
	
	static void forEachLoop4() {
		char charArr[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K'};
		
		for (char n : charArr) {
			System.out.print(n + " ");
		}
		System.out.println("--end forEachLoop4");
		System.out.println();
	}

}
