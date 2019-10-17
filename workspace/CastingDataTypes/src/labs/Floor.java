package labs;

import java.util.Scanner;

public class Floor {
	
	public static void main(String[] args) {
		
		
//		Scanner kb = new Scanner(System.in);
		
//		System.out.println("Enter a float number: ");
		
//		double num = (float)(kb.nextFloat());
		
	    floor(25.95);
		floor(-25.95);
		floor(25.0);
		floor(-25.0);
		
		
//		kb.close();
	}
	
	public static void floor(double d) {
		int num = (int)(d);
		
		if (d < 0.0 ) {
			num = num -1;
		}
		
		
		System.out.println(num);
	}

}
