package drills;

public class ClassWithMethodsLoop {
	public static void main(String[] args) {
		System.out.println("Calling method1()");
		
		int counter = 0;
		
		while (counter < 5) {
			method1();
			counter++;
		}
		
		System.out.println("main finishing");
	}

	public static void method1() {
		System.out.println("  method1 executing");
	}
}
