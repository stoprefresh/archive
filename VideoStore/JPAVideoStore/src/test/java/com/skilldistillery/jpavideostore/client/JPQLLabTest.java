package com.skilldistillery.jpavideostore.client;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.jpavideostore.entities.Film;
 
class JPQLLabTest {

	private JPQLLab j;
	private List<Object[]> xx;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		j = new JPQLLab();
	}

	@AfterEach
	void tearDown() throws Exception {
		j = null;
	}

	@Test
	void test_for_ids() {

		xx = j.getRangeOfCustomers(100, 110);

		assertEquals(11, xx.size());
	}

	@Test
	void test_find_email_by_first_last_names() {
		String testerNull = j.getCustomerEmailByName("", "");
		assertEquals("None Found", testerNull);
		String testerEmail = j.getCustomerEmailByName("Hayes", "Robin");
		assertEquals("ROBIN.HAYES@sdvidcustomer.org", testerEmail);
	}

	@Test
	void test_for_finding_a_film_by_title() {
		Film f = j.getFilmByTitle("dragon");
		assertEquals("CASPER DRAGONFLY", f.getTitle());
	}

	
}