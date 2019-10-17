import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class NameSeparatorApp {
	public static void main(String[] args) {
		NameSeparatorApp ns = new NameSeparatorApp();
		// System.out.println(ns.readFile("names.txt"));
		//System.out.println(ns.readFile("names.txt"));
		ns.createList(ns.readFile("names.txt"));
	}

	public static Set<String> readFile(String fileName) {
		Set<String> nameSet = new HashSet<>();
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			int size = 0;
			while ((line = br.readLine()) != null) {
				nameSet.add(line);
				size += 1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return nameSet;
	}

	public static void createList(Set<String> set) {
		Set<String> orderedList = new TreeSet<>();
		ArrayList<String> list = new ArrayList<String>();
		String[] listO = new String[26];
		for (String string : set) {
			orderedList.add(string);
		}
		
		System.out.println(orderedList);
		
		String line;
			int counter = 65;
			for (int i = 65; i < 91; i++) {
				String names = "";
				Iterator<String> it = orderedList.iterator();
				while (it.hasNext()) {
					line = it.next();
					char[] lineToChar = line.toCharArray();
					if (lineToChar[0] == i) {
						names += line + ", ";
					}
				}
				listO[i-65] = names;
			}
			// list.add(names);
			for (int i = 0; i < listO.length; i++) {
			System.out.println(listO[i]);
				
			}
		//	System.out.println(listO);
		}

		// list.add(index, names);

	}
//System.out.println(setString);
