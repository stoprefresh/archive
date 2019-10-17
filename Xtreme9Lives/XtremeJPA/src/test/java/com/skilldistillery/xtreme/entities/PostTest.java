package com.skilldistillery.xtreme.entities;

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

class PostTest {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Post p;

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
		p = em.find(Post.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		p = null;
	}

	@Test
	@DisplayName("Intial test mapping for posts")
	void test_intial() {
		assertNotNull(p);
		assertEquals(1, p.getId());
		assertEquals(2, p.getComments().size());
	}
	
	@Test
	@DisplayName("Test whoever Posted this")
	void test_poster() {
		assertEquals("Xtreme Single Engine", p.getTitle());
		assertEquals("Xander Cage", p.getName());
		assertEquals("Xman@ier.com", p.getEmail());
		assertEquals("Air Time", p.getBrand());
		assertEquals("skydiving", p.getCategory().getName());
		assertEquals("https://i2.wp.com/www.thelostgirlsguide.com/wp-content/uploads/DSC_3138_-1.jpg",
				p.getImageUrl());
	}
	
}
