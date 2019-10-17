package com.skilldistillery.datatypes.labs;

import java.util.Scanner;

public class BitPrinterDriver {

	public static void main(String[] args) {

//	    System.out.println("3.14 is \t\t" + bp.getDataAsBits("3.14"));
//	    System.out.println("129 is \t\t" + bp.getDataAsBits("129"));
		String s;
		Scanner kb = new Scanner(System.in);
		
		do {
			BitPrinter bp = new BitPrinter();
			System.out.println("Enter a char, int, or double: ");
			s = kb.next();
			System.out.println(bp.getDataAsBits(s));
		} while (!s.equalsIgnoreCase("quit"));
		
		System.out.println("Program closing!");
		kb.close();

	}

}
