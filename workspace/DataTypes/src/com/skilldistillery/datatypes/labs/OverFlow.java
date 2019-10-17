package com.skilldistillery.datatypes.labs;

public class OverFlow {

		public static void main(String[] args) {
			
			
			int big = 2_147_483_647;
			int bigger = big + 1;
			
			System.out.println(big);
			System.out.println(bigger);
			
		}
}
