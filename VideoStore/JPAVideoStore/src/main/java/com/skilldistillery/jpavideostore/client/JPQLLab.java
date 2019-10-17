package com.skilldistillery.jpavideostore.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

import com.skilldistillery.jpavideostore.entities.Film;

public class JPQLLab {
 
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");

	public List<String> getFilmsTitlesByReleaseYear(int year) {
		EntityManager em = emf.createEntityManager();

		String query = "SELECT f.title FROM Film f WHERE f.releaseYear LIKE :aYear";

		List<String> moviesByYear = em.createQuery(query, String.class).setParameter("aYear", year).getResultList();

		em.close();
		
		return moviesByYear;
	}
	
	
	
 
	public Film getFilmByTitle(String someTitle) {
		EntityManager em = emf.createEntityManager();

		String query = "SELECT f from Film f WHERE f.title LIKE :aTitle";
		
		return em.createQuery(query, Film.class).setParameter("aTitle", "%" + someTitle + "%").getResultList().get(0);
	}
	
	
	

	public List<Object[]> getRangeOfCustomers(int... id) {

		EntityManager em = emf.createEntityManager();
		String query = "SELECT c.lastName, c.firstName, c.id FROM Customer c WHERE c.id BETWEEN :lowId AND :highId";

		List<Object[]> customerNames = em.createQuery(query, Object[].class).setParameter("lowId", id[0])
				.setParameter("highId", id[1]).getResultList();

		em.close();

		return customerNames;
	}
	
	

	public String getCustomerEmailByName(String... names) {

		EntityManager em = emf.createEntityManager();
		String query = "SELECT ce.email from Customer ce WHERE ce.firstName = :fName AND ce.lastName = :lName";

		try {
			String customerEmail = em.createQuery(query, String.class).setParameter("fName", names[1])
					.setParameter("lName", names[0]).getSingleResult();
			em.close();
			return customerEmail;
		} catch (NoResultException e) {
			em.close();
			return "None Found";
		}
	}
}
