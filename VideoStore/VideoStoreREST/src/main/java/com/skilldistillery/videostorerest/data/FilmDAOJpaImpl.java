package com.skilldistillery.videostorerest.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.jpavideostore.entities.Film;

@Service
@Transactional
public class FilmDAOJpaImpl implements FilmDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Film> findAll() {
		 String query = "Select f from Film f order by f.id asc";
		  return em.createQuery(query, Film.class).getResultList();
	}
}
