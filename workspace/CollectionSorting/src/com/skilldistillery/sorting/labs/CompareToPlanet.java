package com.skilldistillery.sorting.labs;

import java.util.*;

public class CompareToPlanet implements Comparator<Planet> {

	@Override
	public int compare(Planet o1, Planet o2) {
		if (o1.getOrbit() < o2.getOrbit()) {
			return 1;
		} else if (o1.getOrbit() > o2.getOrbit()) {
			return -1;
		} else {
			return 0;
		}	
	}
}
