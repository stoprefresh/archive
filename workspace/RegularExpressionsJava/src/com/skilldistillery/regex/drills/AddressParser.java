package com.skilldistillery.regex.drills;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.skilldistillery.regex.solutions.Pet;

public class AddressParser {

	public static void main(String[] args) {
		AddressParser ap = new AddressParser();
		ap.listZipsAndAreaCodes("addresses.txt");
	}

	private void listZipsAndAreaCodes(String fileName) {
		// 13002 N Pennsylvania Avenue, Oklahoma City, OK 73120 <br />405-936-4264
		// 999 E. Basse Rd. San Antonio, TX 78209 <br />(210) 824-1603
		String regex = "\\b[A-Z]{2}\\b\\s+(\\d{5}).*?/>\\s*\\(?(\\d{3})\\b";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher("");
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line = null;
			while ((line = br.readLine()) != null) {
				m.reset(line);

				if (m.find()) {
					System.out.println(m.group(1) + " : " + m.group(2));
				}
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
} 
