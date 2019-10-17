package com.skilldistillery.lambdas;

import java.time.*;
import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.function.*;

public class LambdaExamples {
	/*
	 * Create static fields for each definition below based on the functional interface, method, and functionality.
	 * Interface : method : functionality
	 * Note that functionality may define the type of a parameterized interface.
	 */
	
	/*
	 * Runnable : void run() : System.out.println("Running")
	 */	
	public static Runnable r1 = () -> System.out.println("Running");
	
	/*
	 * java.util.concurrent.Callable<V> : V call() : return the current year as an Integer
	 */
	public static Callable<Integer> c1 = () -> LocalDate.now().getYear();
	
	/*
	 * Comparator<T> : int compare(T o1, T o2) : compare Planet diameters 
	 */
	public static Comparator<Planet> p1 = (p1, p2) -> p1.getDiameter() - p2.getDiameter();

	/*
	 * Predicate<T> : boolean test(T o1) : return true if Planet name contains "u" 
	 */
	public Predicate<Planet> p2 = p -> p.getName().toUpperCase().contains("U");

	/*
	 * BiPredicate<T, U> : boolean test(T t, U u) : return true if Planet name contains the given String, case-insensitive
	 */
	public BiPredicate<Planet, String> b1 = (p, s) -> p.getName().contains(s.toUpperCase());
	
	/*
	 * Function<T, R> : R apply(T t) : return the President's name in the format "Lastname, Firstname"
	 */
	public Function<President, String> f1 = p -> (p.getLastName() + ", " + p.getFirstName());
		
	/*
	 * BiFunction<T, U, R> : R apply(T t, U u) : Replace all vowels in a President's first and last name with a sequential number starting with U u, and return the transformed name String.
	 * For example u = 0, President name "Abraham Lincoln" is returned "0br1h2m L3nc4ln".
	 */
	public BiFunction<President, Integer, String> bf1 = (p, i) -> {
		String x = null;
		
		for(int j = 0; j < (p.getFirstName() + " " + p.getLastName()).length(); j++, i++){
			x = ((p.getFirstName() + " " + p.getLastName()).replaceFirst("[aeiouAEIOU]", Integer.toString(i)));
		}
		
		return x;
		
		
	};	
}













