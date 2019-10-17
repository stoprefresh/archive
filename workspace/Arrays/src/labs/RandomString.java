package labs;

public class RandomString {

	public static void main(String[] args) {
		
		String animalNames[] = {"dog", "cat", "mouse", "bear", "moose"};
		
		for(int i = 0; i < 10; i++) {
			System.out.println(animalNames[(int)(Math.random() * animalNames.length)]);
		}
		
	}
}
