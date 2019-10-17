package com.skilldistillery.wrapperclasses.drills;

public class NaNTest {

	
		public static void main(String[] args) {
			NaNTest nT = new NaNTest();
			nT.test();
			
			
		}
		
		public void test() {
			
			double d;
			Double dd;
			
			d = 0.0;
			dd = new Double(0.0);
			
			
			System.out.println(d + " ----- " + dd);
		}
}
