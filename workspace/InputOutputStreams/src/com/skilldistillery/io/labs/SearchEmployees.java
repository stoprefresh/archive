package com.skilldistillery.io.labs;

import java.io.*;

public class SearchEmployees {

	public static void main(String[] args) {
		
		SearchEmployees se = new SearchEmployees();
		
		se.filereader();
		
	}
	
	public void filereader() {
		
		try {
			String line;
			FileReader fr = new FileReader("employee.txt");
			BufferedReader br = new BufferedReader(fr);
			while((line = br.readLine()) != null) {
				if(line.contains("manager")) {
					System.out.println(line);
				}
			}
			fr.close();
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
