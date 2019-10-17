package com.skilldistillery.lambdas.labs;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PlanetFilteringLab {

	public static void main(String[] args) {
		List<Planet> planets = PlanetUtilities.getPlanets();

		printPlanets(planets);

		Predicate<Planet> p1 = p -> p.getName().toUpperCase().contains("A") 
				|| p.getName().toUpperCase().contains("Y");

		printPlanets(PlanetUtilities.filterPlanets(planets, p1));
	}

	private static void printPlanets(List<Planet> planets) {
		System.out.println("********PLANETS********");
		for (Planet p : planets) {
			System.out.println(p);
		}
	}
}
