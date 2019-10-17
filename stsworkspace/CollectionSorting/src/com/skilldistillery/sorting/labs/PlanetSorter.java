package com.skilldistillery.sorting.labs;

import java.util.*;

public class PlanetSorter { 

//    Change PlanetSorter to have the list sort itself instead of using Collections.sort.

	public static void main(String[] args) {
		PlanetSorter app = new PlanetSorter();
		app.launch();
	}

	private void launch() {
		List<Planet> planets = new ArrayList<>();

		Map<Long, Planet> sortedOrbit = new TreeMap<>();
		
		planets.add(new Planet("Earth", 149_600_000, 12_756));
		planets.add(new Planet("Jupiter", 778_330_000, 142_984));
		planets.add(new Planet("Mars", 227_940_000, 6_794));
		planets.add(new Planet("Mercury", 57_910_000, 4_880));
		planets.add(new Planet("Neptune", 4_504_000_000L, 49_532));
		planets.add(new Planet("Saturn", 1_429_400_000, 120_536));
		planets.add(new Planet("Uranus", 2_870_990_000L, 51_118));
		planets.add(new Planet("Venus", 108_200_000, 12_103));

		for(Planet planet : planets) {
			sortedOrbit.put(planet.getOrbit(), planet);
//			System.out.println(planet);
		}
		
//		planets.sort(new CompareToPlanet());
		
		
//     Collections.reverse(planets);

		printPlanets(sortedOrbit);
	}

	private void printPlanets(Map<Long, Planet> planets) {
		
		Set<Long> keys = planets.keySet();
		List<Long> key = new ArrayList<>(keys);
		Collections.reverse(key);
		
		for (Long orbit : key) {
			System.out.println(planets.get(orbit).toString());
		}
	}

}
//Earth
//Jupiter
//Mars
//Mercury
//Neptune
//Saturn
//Uranus
//Venus
