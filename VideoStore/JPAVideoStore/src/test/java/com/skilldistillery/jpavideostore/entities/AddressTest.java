package com.skilldistillery.jpavideostore.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddressTest {

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
	void test_Address_mappings() {
		Address a = em.find(Address.class, 5);
		assertEquals("1913 Hanoi Way", a.getStreet());
		assertEquals("Sasebo", a.getCity());
		assertEquals("Nagasaki", a.getState());
		assertEquals("35200", a.getPostalCode());
		assertEquals("28303384290", a.getPhone());

	}

	@Test
	void test_to_String() {
		Address a = em.find(Address.class, 1);
		assertEquals("Address [id=1, street=47 MySakila Drive, " + "street2=null, state=Alberta, city=Lethbridge, "
				+ "postalCode=, phone=]", a.toString());
	}
	
	@Test
	void test_many_to_one() {
		Address address = em.find(Address.class, 1);
	    assertEquals("Canada", address.getCountry().getName());
	}
}
