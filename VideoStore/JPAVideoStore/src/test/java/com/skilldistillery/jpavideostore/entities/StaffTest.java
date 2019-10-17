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

class StaffTest {
	
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
	void test_Staff_mappings() {
		Staff s = em.find(Staff.class, 1);
		assertEquals("Larry", s.getFirstName());
		assertEquals("Kong", s.getLastName());
		assertEquals("larry.kong@example.com", s.getEmail());
	}
	
	@Test
	@DisplayName("This is a uni-directional mapping test")
	void testing_some_mapping() {
		Staff s = em.find(Staff.class, 1);
		assertEquals("Las Vegas", s.getAddress().getCity());	
	}
	
	@Test
	public void test_staff_to_store() {
		Staff s = em.find(Staff.class, 1);
		assertEquals(4, s.getStore().getId());
		
	}
}
