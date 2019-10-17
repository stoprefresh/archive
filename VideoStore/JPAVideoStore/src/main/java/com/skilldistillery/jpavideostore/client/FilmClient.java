package com.skilldistillery.jpavideostore.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.jpavideostore.entities.Film;

public class FilmClient {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");

	public static void main(String[] args) {
		
		EntityManager em = emf.createEntityManager();
		
		Film film = em.find(Film.class, 1);
		
		System.out.println(film);
		
		em.close();
		emf.close();
		
	}
}
