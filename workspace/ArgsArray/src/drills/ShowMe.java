package drills;

public class ShowMe {

	public static void main(String[] arguments) {
		System.out.println(arguments);
		System.out.println(arguments.length);
		if(arguments.length > 0) {
		for(int i = 0; i < arguments.length; i++) {
			System.out.println(arguments[i]);
		}
		
		}
	}

}
 