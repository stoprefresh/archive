package com.skilldistillery.jpavideostore.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FilmTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Film f;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("VideoStore");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		f = em.find(Film.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		f = null;
	}

	@Test
	void test_enum_rating() {
		assertEquals("PG", f.getRating().toString());
		assertEquals(Rating.PG, f.getRating());
	}

	@Test
	void test_Film_mappings() {
		assertEquals("ACADEMY DINOSAUR", f.getTitle());
		assertEquals(
				"A Epic Drama of a Feminist And a Mad Scientist " + "who must Battle a Teacher in The Canadian Rockies",
				f.getDescription());
		assertEquals(1993, f.getReleaseYear());
		assertEquals(0.99, f.getRentalRate());
		assertEquals(86, f.getLength());
		assertEquals(20.99, f.getReplacementCost());
	}
	
	@Test
	@DisplayName("testing map to language")
	void test() {
		
		assertEquals("Japanese", f.getLanguage().getName());
	}
	
	@Test
	@DisplayName("Many to many mapping films to actors")
	void testing_many_mapping() {
		assertEquals("Penelope", f.getActors().get(0).getFirstName());
		assertEquals("Guiness", f.getActors().get(0).getLastName());
		assertEquals("Sandra", f.getActors().get(3).getFirstName());
		assertEquals("Peck", f.getActors().get(3).getLastName());
	}
	
	@Test
	@DisplayName("Many to many mapping films to categories")
	void testing_films_to_categories() {
		assertNotNull(f.getCategories());
		assertEquals("Documentary", f.getCategories().get(0).getName());
	}
	
	
	
}
