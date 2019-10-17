package com.skilldistillery.jpavideostore.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.jpavideostore.entities.Language;

public class LanguageClient {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");

	public static void main(String[] args) {
		
		EntityManager em = emf.createEntityManager();
		
		Language lang = em.find(Language.class, 1);
		
		System.out.println(lang);
		
		em.close();
		emf.close();
	}

}
