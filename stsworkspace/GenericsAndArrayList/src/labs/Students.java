package labs;

import java.util.ArrayList;

public class Students {

	public static void main(String[] args) {

		Students s = new Students();

		s.names();
		s.numbers();
		
	}

	public void names() {

		ArrayList<String> a = new ArrayList<>();

		a.add("Alpha");
		a.add("bravo");
		a.add("Charlie");
		a.add("Delta");

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) != null) {
				System.out.println(a.get(i));
			}
		}
	}
	
	public void numbers() {
		
		ArrayList<Double> n = new ArrayList<Double>(10);
		
		for(int i = 0; i < 10; i++) {
			n.add(i, Math.random());	
		}
		
		for(Double c : n) {
			System.out.printf("%n%.3f", c);
		}
	}
}
