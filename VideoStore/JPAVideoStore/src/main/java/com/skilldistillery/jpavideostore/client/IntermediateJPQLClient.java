package com.skilldistillery.jpavideostore.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.jpavideostore.entities.Staff;

public class IntermediateJPQLClient {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
	private static EntityManager em = emf.createEntityManager();
	
	public static void main(String[] args) {
		
//		String query = "SELECT staff FROM Staff staff ORDER BY staff.lastName";
		
//		String query2 = "SELECT COUNT(film) FROM Film film ";
		
//		List<Staff> results = em.createQuery(query, Staff.class).getResultList();
//		
//		for (Staff staff : results) {
//			System.out.println(staff);
//		}
		
//		Long results2 = em.createQuery(query2, Long.class).getSingleResult();
//		System.out.println(results2);
		
		
		String query3 = "SELECT staff.firstName, COUNT(staff) FROM Staff staff GROUP BY staff.firstName HAVING "
				+ "COUNT(staff) != 1";
		
		List<Object[]> names = em.createQuery(query3, Object[].class).getResultList();
		
		
		for (Object[] objects : names) {
			System.out.println(objects[0] + " " + objects [1]);
		}
	}
	
	

}
