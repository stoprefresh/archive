package com.skilldistillery.jpavideostore.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.jpavideostore.entities.Staff;

public class JPQLClient {

	public static void main(String[] args) {
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("VideoStore");
		EntityManager em = emf.createEntityManager();
		
		
		int id = 10;
		String query = "SELECT s.lastName FROM Staff s WHERE s.id < :localId";
		
//		List<Staff> staffMembers = em.createQuery(query, Staff.class).getResultList();
//		
//		for (Staff staff : staffMembers) {
//			System.out.println(staff.getFirstName() + " " + staff.getLastName());
//		}
		
		List<String> staffMembers = em.createQuery(query, String.class)
				.setParameter("localId", id).getResultList();
//		
		for (String staff : staffMembers) {
			System.out.println(staff);
		}
		System.out.println();
		String queryMultipleProps = "SELECT s.firstName, s.lastName FROM Staff s WHERE s.id < 10";
		
		List<Object[]> staffNames = em.createQuery(queryMultipleProps, Object[].class).getResultList();
		
		for (Object[] columnPosition : staffNames) {
			System.out.println(columnPosition[0] + " " + columnPosition[1]);
		}

	}

}
