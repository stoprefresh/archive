package com.skilldistillery.jpavideostore.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.jpavideostore.entities.Actor;
import com.skilldistillery.jpavideostore.entities.Address;
import com.skilldistillery.jpavideostore.entities.Customer;
import com.skilldistillery.jpavideostore.entities.Film;

public class RelationshipCRUDClient {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
	
	public void addNewActorToFilm(int fid, Actor actor) {
		EntityManager em = emf.createEntityManager();
		Film film = em.find(Film.class, fid);
		
		film.addActor(actor);
		
		em.close();
	}
	
	public void newCustomerAndAddress() {
		Address a = new Address("street", "city", "state", "phone");
	
		
	}
	
	
}
