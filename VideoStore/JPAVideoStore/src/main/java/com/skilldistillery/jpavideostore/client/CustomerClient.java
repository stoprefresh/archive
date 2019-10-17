package com.skilldistillery.jpavideostore.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.jpavideostore.entities.Customer;

public class CustomerClient {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");

	public static void main(String[] args) {

		EntityManager em = emf.createEntityManager();

		Customer cust = em.find(Customer.class, 1);

		System.out.println(cust);
		// No memory leaks...
		em.close();
		emf.close();
	}
}
