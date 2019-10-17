package com.skilldistillery.romannumeral.projects;

import java.util.*;

public class RomanNumeralTranslatorImpl implements Translator{

	Map<Integer, String> numbersToRomans;
	
	public static void main(String[] args) {
		
		RomanNumeralTranslatorImpl  rmn = new RomanNumeralTranslatorImpl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		
		String input = sc.nextLine();
		System.out.println(rmn.translateWord(input));
		sc.close();
		
		
		
		
	}
	
	public void stringToRomans(){
		
		numbersToRomans = new HashMap<>();
		
		numbersToRomans.put(0, "");
		numbersToRomans.put(1, "I");
		numbersToRomans.put(2, "II");
		numbersToRomans.put(3, "III");
		numbersToRomans.put(4, "IV");
		numbersToRomans.put(5, "V");
		numbersToRomans.put(6, "VI");
		numbersToRomans.put(7, "VII");
		numbersToRomans.put(8, "VIII");
		numbersToRomans.put(9, "IX");
		numbersToRomans.put(10, "X");
		numbersToRomans.put(40, "XL");
		numbersToRomans.put(50, "L");
		numbersToRomans.put(90, "XC");
		numbersToRomans.put(100, "C");
		numbersToRomans.put(400, "CD");
		numbersToRomans.put(500, "D");
		numbersToRomans.put(900, "CM");
		numbersToRomans.put(1000, "M");
	}
	
	
	@Override
	public String translateWord(String word) {
		stringToRomans();
		String output = "";
		int calc, input, ones, tens, hundreds, thousands;
		
		try {
			input = Integer.parseInt(word);
			
			do {
				ones = input % 10;
				calc = input / 10;
				
				tens = calc % 10;
				calc = calc / 10;
				
				hundreds = calc % 10;
				calc = calc / 10;
				
				thousands = calc % 10;
				calc = calc / 10;
				
			}while(calc != 0);
			
			if(thousands == 4) {
				output += numbersToRomans.get(4000);	
			}
			else if(thousands == 5) {
				output += numbersToRomans.get(5000);
			}
			else if(thousands == 9) {
				output += numbersToRomans.get(9000);
			}
			else {
				for (int i = 0; i < thousands; i++) {
					output += numbersToRomans.get(1000);
				}
			}
				
			if(hundreds == 4) {
				output += numbersToRomans.get(400);	
			}
			else if(hundreds == 5) {
				output += numbersToRomans.get(500);
			}
			else if(hundreds == 9) {
				output += numbersToRomans.get(900);
			}
			else {
				for (int i = 0; i < hundreds; i++) {
					output += numbersToRomans.get(100);
				}
			}
			
			if(tens == 4) {
				output += numbersToRomans.get(40);	
			}
			else if(tens == 5) {
				output += numbersToRomans.get(50);
			}
			else if(tens == 9) {
				output += numbersToRomans.get(90);
			}
			else {
				for (int i = 0; i < tens; i++) {
					output += numbersToRomans.get(10);
				}
			}
			 return output + numbersToRomans.get(ones);
			
		}catch(NumberFormatException e) {
//			System.err.println(e);
		}
		return word;
	}

//	@Override
//	public String translateWord(String word) {
//		stringToRomans();
//		String output = "";
//		int input, calc;
//		try {
//			input = Integer.parseInt(word);
//			 if((input >= 1) && (input <= 10)) {
//				 output = numbersToRomans.get(input);
//				 return output;
//			 }
//			 else if((input > 10) && (input <= 39)) {
//				 calc = (int)(input / 10);
//				 input = input % 10;
//				 
//				 for (int i = 0; i < calc; i++) {
//					output += numbersToRomans.get(10);
//				}
//				 return output + numbersToRomans.get(input);
//		 
//			 }
//			 else if() {
//				 
//			 }
//		}catch(Exception e) {
//			System.out.println("Error");
//		}
//		
//		
//		
//		
//		
//		
//		return word;
//	}
		
}
