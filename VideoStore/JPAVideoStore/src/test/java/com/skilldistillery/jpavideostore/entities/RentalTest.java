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

class RentalTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Rental r;

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
		r = em.find(Rental.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		r = null;
	}

//	@Test
//	public void return_date_rental_date_mapping() {
//		assertEquals("2014-05-24", r.getRentalDate().toString());
//		assertEquals("2014-05-26", r.getReturnDate().toString());
//	}
//
//	@Test
//	public void to_string_printout() {
//		assertEquals("Rental [id=1, rentalDate=2014-05-24, returnDate=2014-05-26]", r.toString());
//	}
//	
//	@DisplayName("Some testing stuff")
//	@Test
//	void testStaff() {
//		assertEquals("William", r.getStaff().getFirstName());
//		assertEquals("Tingvold", r.getStaff().getLastName());
//	}
//	
//	@Test
//	void testCustomer() {
//		assertEquals("Charlotte", r.getCustomer().getFirstName());
//		assertEquals("Hunter", r.getCustomer().getLastName());
//	}
}
