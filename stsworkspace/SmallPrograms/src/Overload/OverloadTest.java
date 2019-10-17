package Overload;

//Class Something ***************************
class Something{
	public final double overThree(String str) {
		return 2.137485732850965087658075;
	}
	
	static void overThree() {
		System.out.println("\nA Different class");
	}
	
	public String overThree(String str, double dd) {
		return "and Another";
	}
}
//Class Something ***************************


public class OverloadTest {
	
	//Third ********************************************
	public static int overloader(double dd) { 
		return 7;
	}
	
	public static String overloader(String str) {
		return "\nSome static Overloading";
	}
	//Third ********************************************
	

	public static void main(String... args) {
		OverloadTest oT = new OverloadTest();
		Something so = new Something(); //5
		String test = "easy";
		double dTest = 0.0;
		
		
		//First ********************************************
		oT.overOne(); 
		oT.overOne(test);
		//First ********************************************
		
        //Second ********************************************
//		test = oT.overTwo(test); 
//		dTest = oT.overTwo(dTest);
//		oT.overTwo(dTest, test);
        //Second ********************************************
		
		
		//Third ********************************************
//		System.out.println(overloader(test)); 
//		System.out.println(overloader(dTest));
		//Third ********************************************
	
		
		//fourth *********************************************
//		main(test); 
		//fourth *********************************************
		
		
		// Class Something ***************************
//		Something.overThree();
//		System.out.println(so.overThree(test)); //number5
//		System.out.println(so.overThree("Some String", 5.5));
		// Class Something ***************************
		
		
		//sixth ********************************************
//	    int x = 9;
//	    OverloadTest.overFive(x);
		//sixth ********************************************
		
		//final ********************************************* 
//		overFinal();
//		overFinal(dTest, dTest, dTest, dTest, dTest, 5.4, 5.8, 10.1);
//	    overFinal(dTest, 1, 4, 5, 6, 7, 10);
	    //final ********************************************* 
	}
	
	//first ********************************************
	private void overOne(){ 
		System.out.println("\nNothing here.\n");
	}
	
	private void overOne(String str) { //First example.
		System.out.println("Pretty " + str);
	}
	//first ********************************************
	 
	  
	//sixth ********************************************
	  static void overFive (Integer x) { 
	    System.out.println("selection int: " + x);
	  }
	 
	  static void overFive (long x) {
	    System.out.println("selection long: " + x);
	  }
	//sixth ********************************************
	
	
//	Second ********************************************
	private final  String overTwo(String str) {
		String newStr = "Kinda ";
		return newStr + str;
	}
	
	private final double overTwo(double dd) {
		return dd + 2.0;	
	}
	
	private final void overTwo(double dd, String str) {
		System.out.println("\n" + str + " for a " + dd);
	}
//	Second ********************************************
	
	  
	  
	
	//fourth *********************************************
	public static void main(String str) {
		System.out.println("\nOverloaded main");
	}
	//fourth *********************************************
	
	  
	  
	//final ********************************************* 
	static void overFinal(double d, double dd, double... ddd) {
		System.out.println("\nVariable Arg with two doubles before.");
	}

	static void overFinal(String... str) {
		System.out.println("Varargs with Strings.");
	}
	
	static void overFinal(double dd, int... x) {
		System.out.println("Mixed Varargs parameters.");
	}
	//final *********************************************
	
	
	//This is a invalid method, due to multiple varargs
	
//	static void overFinal(int... x, double... d) { //ex final
//		
//	}
}
