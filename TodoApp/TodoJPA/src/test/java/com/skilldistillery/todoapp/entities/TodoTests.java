package com.skilldistillery.todoapp.entities;

import static org.junit.jupiter.api.Assertions.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TodoTests {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Todo todo;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception{
		emf = Persistence.createEntityManagerFactory("todo");
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception{
		emf.close();
	}
	
	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		todo = em.find(Todo.class, 1);
	}
	
	@AfterEach
	void tearDown() throws Exception{
		em.close();
		todo = null;
	}

	@Test
	@DisplayName("Check for connection")
	void test() {
		assertNotNull(todo);
		
	}

}
