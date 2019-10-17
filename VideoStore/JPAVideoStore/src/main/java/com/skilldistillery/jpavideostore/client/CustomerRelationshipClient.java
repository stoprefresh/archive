package com.skilldistillery.jpavideostore.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.jpavideostore.entities.Address;
import com.skilldistillery.jpavideostore.entities.Customer;

public class CustomerRelationshipClient {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
	private static EntityManager em;
	
	public static void main(String [] args) {
		
		em = emf.createEntityManager();
		
		Customer customer = em.find(Customer.class, 1);
		System.out.println(customer);
		
//		Address address = em.find(Address.class, customer.getAddressId());
//		System.out.println(address);
		
		
		em.close();
		emf.close();
		
	}

}
