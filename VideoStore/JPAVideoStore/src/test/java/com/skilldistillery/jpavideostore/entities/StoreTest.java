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

class StoreTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Store s;

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
		s = em.find(Store.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		s = null;
		em.close();
	}

	@Test
	void test_for_table_join() {
		 
	     Address address = s.getAddress();
	     assertEquals("Seattle", address.getCity());

		
	}
	@Test
	void test() {
		
		assertEquals(74, s.getCustomer().size());
	}
	
	@Test
	@DisplayName("MtM for stores and films")
	void testing_mapping_films_stores() {
		assertNotNull(s.getFilms());
		assertEquals(2270, s.getFilms().size());
	}

}
