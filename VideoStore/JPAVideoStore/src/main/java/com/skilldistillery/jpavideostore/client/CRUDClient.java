package com.skilldistillery.jpavideostore.client;

import javax.persistence.*;
import com.skilldistillery.jpavideostore.entities.*;

public class CRUDClient {
	
private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");
	
	public static void main(String[] args) {
		
		CRUDClient crc = new CRUDClient();
		
		crc.update();
	
//		System.out.println(crc.addNewAddress(new Address("132 Harrison st", "Denver", "Colorado", "80206", "2098220096")));
		
		crc.deleteAddress(crc.addNewAddress(
				new Address("132 Harrison st", "Denver", "Colorado", "80206", "2098220096")).getId());
	}
	
	public void deleteAddress(int id) {
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.remove(em.find(Address.class, id));
		em.getTransaction().commit();
		em.close();
	}
	
	public Address addNewAddress(Address adds) {
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(adds);
		em.flush();
		em.getTransaction().commit();
		em.clear();
		em.close();
		return adds;
	}
	
	public void update() {
		
		EntityManager em = emf.createEntityManager();
		
		String query = "SELECT e FROM Customer e WHERE e.email is null or e.email = ''";
		
		em.getTransaction().begin();
		
		for (Customer c : em.createQuery(query, Customer.class).getResultList()) {
			
			c.setEmail(c.getFirstName() + "." + c.getLastName() + "@sdcustomer.org");
		}
		em.getTransaction().commit();
		
		em.close();
	}
	
//	public List<Customer> update() {
//		EntityManager em = emf.createEntityManager();
//		String query = "SELECT e FROM Customer e WHERE e.email is null or e.email = ''";
//		
//		List<Customer> customers = em.createQuery(query, Customer.class).getResultList();
//		
//		em.getTransaction().begin();
//		for (Customer c : customers) {
//			c.setEmail(c.getFirstName() + "." + c.getLastName() + "@sdcustomer.org");
//		}
//		em.getTransaction().commit();
//		
//		em.close();
//		return customers;
//	}
}
