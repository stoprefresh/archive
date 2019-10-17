package com.skilldistillery.lambdas.drills;

import java.util.function.Predicate;

public class UsingPredicate {

	public static void main(String[] args) {
		// Declare and define a Predicate<String> that tests whether
		// an input String ends with "!!"

		Predicate<String> p1 = s -> s.endsWith("!!");

		System.out.println(p1.test("Hello!"));
		System.out.println(p1.test("Helloo!!"));

		// Declare and define a Predicate<String> that tests whether
		// an input String is all uppercase.
		Predicate<String> p2 = up -> up.equals(up.toUpperCase());
		
		System.out.println(p2.test("HELLO"));
		System.out.println(p2.test("HelLO"));

		// Test your two Predicates by calling their test methods with some Strings.
		
		Predicate<Planet> d1 = d -> d.getDiameter() > 40_000;
		
		Planet plan = new Planet("Shitball", 123_000_000, 70_000);
		Planet plan1 = new Planet("Shitball1", 100_000, 30_000);
		System.out.println(d1.test(plan));
		System.out.println(d1.test(plan1));
		

	}

}
