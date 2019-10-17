package com.skilldistillery.jpavideostore.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.jpavideostore.entities.Staff;

public class StaffClient {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");

	public static void main(String[] args) {

		EntityManager em = emf.createEntityManager();

		Staff staff = em.find(Staff.class, 1);

		System.out.println(staff);

		em.close();
		emf.close();

	}
}
