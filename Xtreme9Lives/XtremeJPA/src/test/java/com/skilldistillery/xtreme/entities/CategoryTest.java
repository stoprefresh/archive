package com.skilldistillery.xtreme.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CategoryTest {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Category ca;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("XtremePU");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		ca = em.find(Category.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		ca = null;
	}

	@Test
	@DisplayName("Test Mapping Initial for Catergories")
	void test_mapping_one() {
		assertNotNull(ca);
		assertEquals(1, ca.getId());
		assertEquals("skydiving", ca.getName());
	}
	
	@Test
	@DisplayName("Test for total Posts using category 1")
	void test_total_posts() {
		assertEquals(21, ca.getPosts().size());
	}
	
	@Test
	@DisplayName("To String test")
	void test_to_string() {
		assertEquals("Category [id=1, name=skydiving, posts=21]",
				ca.toString());
	}

}
