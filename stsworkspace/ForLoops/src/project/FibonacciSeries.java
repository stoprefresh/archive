package project;

public class FibonacciSeries {

	public static void main(String[] args) {

//		for (int i = 0, j = 1, x = 0, n = 0; n <= 16; n += 3) {
//
//			while (x == 0) {
//				System.out.println(x);
//				System.out.println(j);
//				break;
//			}
//
//			x = i + j;
//			System.out.println(x);
//			i = j + x;
//			System.out.println(i);
//			j = x + i;
//			System.out.println(j);
//		}
		
		for(int i = 0, fB = 1, fL = 0, x = 0; i < 20; i++) {
			System.out.println(fL);
			x =  fL + fB;
			fL = fB;
			fB = x;
		}

	}

}
