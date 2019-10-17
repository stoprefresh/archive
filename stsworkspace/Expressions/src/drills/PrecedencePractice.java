package drills;

public class PrecedencePractice {
	
	public static void main(String[] args) {
	
			int a, b, c;
			a = 32;
			b = 44;
			c = 52;
			boolean whatsThis = b < 42 || a > 50 && c < 100;
			System.out.println(whatsThis);
	}

}
