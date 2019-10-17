package com.skilldistillery.jpavideostore.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.jpavideostore.entities.Address;


public class AddressClient {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
	
	public static void main(String [] args) {
		
		EntityManager em = emf.createEntityManager();

		Address adds = em.find(Address.class, 5);

		System.out.println(adds);
		
		em.close();
		emf.close();
	}
}
