package com.skilldistillery.jpavideostore.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.skilldistillery.jpavideostore.client.JPQLRelationshipsLab;

	class AssociationsLabTest {
		private JPQLRelationshipsLab lab; //the lab will deal with entity managers instead of the test class itself.
		
		@BeforeEach
		void setUp() throws Exception {
			lab = new JPQLRelationshipsLab();
		}

		@AfterEach
		void tearDown() throws Exception {
			lab = null;
		}
//		
//		@Disabled
//		@Test
//		void test() {
//			fail("Not yet implemented");
//		}
//		
//		@Test
//		void test_getFilmsRentedForCustomerWithId() {
//			assertNotNull(lab.getRentalsForCustomerWithCustomerId(1));
//			assertTrue(lab.getRentalsForCustomerWithCustomerId(1).size() > 0 );
//			assertEquals(95, lab.getRentalsForCustomerWithCustomerId(1).size());
//			/* select count(*) inventory_id from rental where customer_id = 1; */
//			
//		}
		
//		@Test
//		void test_checkFilmInventoryItemsForStoreById () {
//			assertNotNull(lab.getInventoryForStoreWithId(1));
//			assertEquals(4, lab.getInventoryForStoreWithId(1));
//			/*select count(*) from inventory_item where store_id = 1 AND film_id = 1; */
//			
//		}

	

}
