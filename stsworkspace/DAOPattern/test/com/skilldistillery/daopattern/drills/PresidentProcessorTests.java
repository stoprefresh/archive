package com.skilldistillery.daopattern.drills;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PresidentProcessorTests {
  
  PresidentProcessor p;

  @Before
  public void setUp() throws Exception {
    // Change null to an instance of your mock object
    PresidentDAO dao = new MockPresidentDAO();
    p = new PresidentProcessor(dao);
  }

  @After
  public void tearDown() throws Exception {
    p = null;
  }

  @Test
  public void test_filterByParty_returns_all_Whigs_presidents() {
    List<President> presidents = p.filterByParty("Whig");
    assertEquals(2, presidents.size());
    assertEquals(2, presidents.get(0).getTermNumber());
    assertEquals(3, presidents.get(1).getTermNumber());
  }
  
  // Write a test for filterByParty to see if it returns an empty
  // list when no presidents are found.
  @Test
  public void test_filterByParty_returns_empty_if_none_are_found() {
	  List<President> pres = p.filterByParty("Republican");
	  assertEquals(0, pres.size());
  }
  
  // Write a test for filterByLastName to see if it returns all 
  // Presidents with last name.
//  @Test
//  public void test_filterByLastName_returns_all_with_last_name() {
//	  List<President> pres = p.filterByLastName();
//	  
//	  
//	  
//	  assertEquals(3, pres.size());
//  }
  
  // Write a test for filterByLastName to see if it returns an empty
  // list when no presidents are found.
  @Test
  public void test_filterByLastName_returns_empty_if_none_are_found() {
	  List<President> pres = p.filterByLastName("Washington");
	  assertEquals(0, pres.size());
  }
  
  

}
