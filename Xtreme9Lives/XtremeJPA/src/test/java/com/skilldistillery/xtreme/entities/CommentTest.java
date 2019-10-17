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

class CommentTest {
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Comment co;

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
		co = em.find(Comment.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		co = null;
	}

	@Test
	@DisplayName("Initial Mappings")
	void test() {
		assertNotNull(co);
		assertEquals(1, co.getId());
		assertEquals("Augustus Gibbons", co.getName());
	}
	
	@Test
	@DisplayName("Extended Testing for coments")
	void test_for_more_info() {
		assertEquals("This seems dangerous", co.getContent());
		assertEquals(1, co.getPost().getId());
	}

}
