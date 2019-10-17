package labs;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

public class NumbersList {

	public static void main(String[] args) {
		NumbersList nl = new NumbersList();

		nl.random();

	}

	public void random() {
		LocalDateTime start = LocalDateTime.now();

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			list.add(10 + (int) (Math.random() * 90));
			System.out.println(list.get(i));
		}

		System.out.println("\n\n" + list.size() + "\n\n");
		
		//Check the count and hold variable

		for (int i = 0, j = 1, x = 0; j < list.size(); i++, j++) {
			
				if (list.get(i) > list.get(j)) {
					x = list.get(j);
					list.set(j, list.get(i));
					list.set(i, x);
					
					if(list.get(i) > list.get(j)) {
						
					}
				}
				if (list.get(i) < list.get(j)) {
					
				}
		}
		

//		Collections.sort(list);
//
		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));
		}
		
		LocalDateTime end = LocalDateTime.now();
		Duration d = Duration.between(start, end);
		System.out.println("\nRuntime: " + d.toMillis() + " Milliseconds");

	}

}
