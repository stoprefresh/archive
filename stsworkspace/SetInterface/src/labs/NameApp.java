package labs;

import java.util.*;
import java.io.*;

public class NameApp {

	public static void main(String[] args) {

		NameApp na = new NameApp();

		na.setList(na.listlist("names.txt"));
	}

	private void setList(List<String> x) {
		Set<String> sSet = new TreeSet<>();
		String line;
		int counter = 0;
		
		for (int i = 0; i < x.size(); i++) {
			line = x.get(i);
			if (sSet.add(line) == false) {
				counter += 1;
			}
		}
		System.out.println("This SET has <" + sSet.size() + "> enteries.\n");
		System.out.println(counter + " total enteries not added to the SET due to duplication.");
	}

	private List<String> listlist(String fileName) {
		List<String> sList = new ArrayList<>();
		String line;
		int total = 0;

		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);

			while ((line = br.readLine()) != null) {
				if (sList.add(line) == true)
					total += 1;
			}

			fr.close();
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("This LIST has <" + sList.size() + "> enteries.\n");
		System.out.println("The FILE [" + fileName + "] has <" + total + "> lines.\n");

		return sList;
	}
}
