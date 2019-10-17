package com.skilldistillery.videostorerest.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.jpavideostore.entities.Address;

@Service
@Transactional
public class AddressDAOImpl implements AddressDAO {
	 
	@PersistenceContext
	private EntityManager em;
		
	@Override
	public List<Address> findAll() {
		String jpql = "SELECT a FROM Address a";
		return em.createQuery(jpql, Address.class).getResultList();
	}
	
	@Override
	public Address findById(int id) {
		return em.find(Address.class, id);
	}
	
	@Override
	public Address addReturnNewAddress(Address address) {
		em.persist(address);
		em.flush();
		return address;
		
	}

}
