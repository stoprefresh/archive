package com.skilldistillery.jpavideostore.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class IntermediateJPQLLab {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
	private static EntityManager em = emf.createEntityManager();
	public static void main(String[] args) {
		
		String query = "SELECT AVG(f.length) from Film f";
		
		Double avgLength = em.createQuery(query, Double.class).getSingleResult();
		
		System.out.println(avgLength);
		
		

	}

}
