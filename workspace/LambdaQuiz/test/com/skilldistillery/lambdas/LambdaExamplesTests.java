package com.skilldistillery.lambdas;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("LambdaExample Tests for most static fields.")
class LambdaExamplesTests {
	
	private LambdaExamples le;
	
	@BeforeEach
	void setUp() {
		le = new LambdaExamples();
	}
	
	@AfterEach
	void tearDown() {
		le = null;
	}
	

	@Test
	@DisplayName("Test Callable<Integer> c1 returns current year as Intger.")
	void test_c1() throws Exception {
		Integer expectedYear = LocalDate.now().getYear();
		Integer yearWeGot = LambdaExamples.c1.call();
		assertEquals(expectedYear, yearWeGot, "If fails");
	}

	@Test
	@DisplayName("Test Comparator<Integer> p1 compares planet's diameters")
	void test_p1() {
		Planet p1 = new Planet("Planet1", 0, 10);
		Planet p2 = new Planet("Planet2", 0, 100);
		Planet p3 = new Planet("Planet3", 0, 10);
		int p1CompP2 = LambdaExamples.p1.compare(p1, p2);
		int p1CompP3 = LambdaExamples.p1.compare(p1, p3);
		int p2CompP1 = LambdaExamples.p1.compare(p2, p1);

		assertAll(
				() -> assertTrue(p1CompP2 < 0), 
				() -> assertEquals(0, p1CompP3), 
				() -> assertTrue(p2CompP1 > 0),
				() -> assertFalse(p2CompP1 <= 0));
//		assertTrue(p1CompP2 < 0);
//		assertEquals(0, p1CompP3);
//		assertTrue(p2CompP1 > 0);
//		assertFalse(p2CompP1 <= 0);
	}
	
	@Test
	@DisplayName("Test b1 returns true for given String in planet name")
	void test_b1() {
		Planet p1 = new Planet("Earth", 0, 0); // EAr in name
		Planet p2 = new Planet("Some Planet", 0 ,0); // "me p" in the name 

		assertAll(
		() -> assertTrue(le.b1.test(p1, "EAr")),
		() -> assertTrue(le.b1.test(p2, "me p"))
		);
	}
	
	@Test
	@DisplayName("Test bf1 returns all vowels replaced with"
			+ " sequentialnumber starting with u = 0")
	void test_bf1() {
		President p = new President(1, "Abraham", "", "Lincoln", 0, "", "all the time");
		String expected = "0br1h2m L3nc4ln";
		String result = le.bf1.apply(p, 0);
		
		assertEquals(expected, result);
	}
}







