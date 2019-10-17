package com.skilldistillery.characters.drills;

import java.util.Scanner;

public class AlphaCheck {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		System.out.println("Input some letters: ");
		String input = kb.nextLine();

		kb.close();
		boolean allLetters = true;

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c >= 'A' && c <= 'Z') {

			} else if (c >= 'a' && c <= 'z') {

			} else {
				allLetters = false;
			}
//				if(c == 'A' || c == 'B' || c == 'C' || c == 'D' || c == 'E' || c == 'F' || c == 'G' 
//						|| c == 'H' || c == 'I' || c == 'J' || c == 'K' || c == 'L' || c == 'M'|| c == 'N'
//						|| c == 'O' || c == 'P' || c == 'Q' || c == 'R' || c == 'S' || c == 'T'|| c == 'U'
//						|| c == 'V' || c == 'W' || c == 'X' || c == 'Y' || c == 'Z'){
//					System.out.println("true");
//				}
//				else if (c == 'a' || c == 'b' || c == 'c' || c == 'd' || c == 'e' || c == 'f' || c == 'g' 
//						|| c == 'h' || c == 'i' || c == 'j' || c == 'k' || c == 'l' || c == 'm'|| c == 'n'
//						|| c == 'o' || c == 'p' || c == 'q' || c == 'r' || c == 's' || c == 't'|| c == 'u'
//						|| c == 'v' || c == 'w' || c == 'x' || c == 'y' || c == 'z'){
//					System.out.println("true");
//				}
//				else {
//					System.out.println("false");
//				}
		}
		System.out.println(allLetters);
	}
}
