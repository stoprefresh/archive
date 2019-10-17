package labs;

public class somethingElse {

	public static void main(String[] args) {

//		for (int i=1; i <= 10; i+=1){
//			  if (i % 2 == 0) {
//			    break;
//			  }
//			  System.out.println(i);
//			}

		for (int i = 0; i <= 30; i += 1) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
