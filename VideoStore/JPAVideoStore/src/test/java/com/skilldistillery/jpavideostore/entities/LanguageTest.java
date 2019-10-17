package com.skilldistillery.jpavideostore.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LanguageTest {

	private static EntityManagerFactory emf;
	private EntityManager em;

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
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
	}

	@Test
	void test_Language_mappings() {
		Language l = em.find(Language.class, 1);
		assertEquals("English", l.getName());
	}
	
	@Test
	@DisplayName("Testing one to many")
	void testing() {
		Language l = em.find(Language.class, 3);
		assertEquals("ACADEMY DINOSAUR", l.getFilms().get(0).getTitle());
		assertEquals("SHANGHAI TYCOON", l.getFilms().get(8).getTitle());
		
	}

}
