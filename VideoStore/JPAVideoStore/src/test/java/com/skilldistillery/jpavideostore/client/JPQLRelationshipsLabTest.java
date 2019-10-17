package com.skilldistillery.jpavideostore.client;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.skilldistillery.jpavideostore.client.JPQLRelationshipsLab;
import com.skilldistillery.jpavideostore.entities.*;

class JPQLRelationshipsTests {
    
    private JPQLRelationshipsLab lab;

    @BeforeEach
    void setUp() throws Exception {
        lab = new JPQLRelationshipsLab();
    }

    @AfterEach
    void tearDown() throws Exception {
        lab = null;
    }

    @Test
    void test_getStoresByState() {
        List<Store> stores = lab.getStoresByState("Washington");
        assertNotNull(stores);
        assertTrue(stores.size() > 0);
    }
    
//    @Test
//    void test_getRentalsForCustomerWithCustomerId() {
//        List<Rental> rentals = lab.getRentalsForCustomerWithCustomerId(1);
//        assertNotNull(rentals);
//        assertTrue(rentals.size() > 0);
//        assertEquals(95, rentals.size());
//    }
    
    @Test
    void test_getFilmsForActorWithId() {
        List<Film> films = lab.getFilmsForActorWithId(1);
        assertNotNull(films);
        assertTrue(films.size() > 0);
        assertEquals(19, films.size());
    }
    
    @Test
    void test_getNumberOfFilmsForCategoryWithName() {
        int count = lab.getNumberOfFilmsForCategoryWithName("Comedy");
        assertEquals(58,count);
    }
    
    @Test
    void test_getInventoryForStoreWithId() {
        List<Film> inv = lab.getInventoryForStoreWithId(1);
        assertNotNull(inv);
        assertTrue(inv.size() > 0);
        assertEquals(2270, inv.size());
    }

}