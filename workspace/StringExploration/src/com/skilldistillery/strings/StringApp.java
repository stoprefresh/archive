package com.skilldistillery.strings;

import java.util.Scanner;

public class StringApp {

	public static void main(String[] args) {

		String name = "bob";
		String lastName = new String("bobby");
		
		System.out.println(name + " " + lastName);
		
		char[] nameChars = {'R', 'o', 'n'};
		
							// "constructor"
		String names = new String(nameChars);
		
		System.out.println(names);
		
		Sphere s1 = new Sphere(3.0);
		Sphere s2 = new Sphere(5.5);
		
		
//		s1.radius = 3.0;
//		s2.radius = 5.5;
						// "constructor"
		Scanner sc = new Scanner(System.in);
		
		
		String s3 = new String(sc.next());
		s3 = s3.intern();
		String s4 = "cat";
		sc.close();
		System.out.println(s3 == s4);
	}
}
