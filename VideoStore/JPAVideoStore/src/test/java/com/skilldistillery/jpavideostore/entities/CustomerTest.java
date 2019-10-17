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

class CustomerTest {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Customer c;

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
		c = em.find(Customer.class, 2);
	}

	@AfterEach
	void tearDown() throws Exception {
		 em.close();
		 c = null;
	}

	@Test
	void test_Customer_mappings() {	
		assertEquals("Patricia", c.getFirstName());
		assertEquals("Johnson", c.getLastName());
	}
	
	@Test
	void test_customer_temporal_annotaions() {
		assertEquals("2014-05-26", c.getCreateDate().toString());
	}
	
	  @Test
	  public void test_customer_to_address_association() {
	     Customer c = em.find(Customer.class, 2);
	     
	     assertEquals("1121 Loja Avenue", c.getAddress().getStreet());
	     assertEquals("", c.getAddress().getStreet2());
	     assertEquals("San Bernardino", c.getAddress().getCity());
	     assertEquals("17886", c.getAddress().getPostalCode());
	  }
	  
	  @Test
	  public void resting() {
		  Customer cust = em.find(Customer.class, 1);
		  assertEquals("Los Angeles", cust.getStore().getAddress().getCity());
	  }
}
