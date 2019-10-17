package labs;

public class Pow2 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 16; i++) {
			
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
		
		for(int i = 1, j = 2; i <=16; i++) {
			int x = (int)(Math.pow(j, i));
			System.out.println(x);		
		}
		
		
	}

}
