package com.skilldistillery.jpavideostore.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.jpavideostore.entities.Actor;
import com.skilldistillery.jpavideostore.entities.Film;
import com.skilldistillery.jpavideostore.entities.Language;

public class ActorDAOImpl implements ActorDAO{
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("VideoStore");

	@Override
	public boolean destroy(int id) {
		EntityManager em = emf.createEntityManager();
		Actor a = em.find(Actor.class, id);
		em.getTransaction().begin();
		
		em.remove(a);
	
		em.getTransaction().commit();
		
		System.out.println(a);
		
		em.close();
		
		return true;
	}
	
	
	@Override
	public Actor create(Actor actor) {
		
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(actor);
		
		em.flush();
		
		em.getTransaction().commit();
		
		em.clear();
		
		return actor;
	}

	@Override
	public Actor update(int id, Actor actor) {
	
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Actor managedActor = em.find(Actor.class, id);
		managedActor.setFirstName(actor.getFirstName());
		managedActor.setLastName(actor.getLastName());
		
		em.getTransaction().commit();
		em.close();
		return managedActor;
	}


	@Override
	public Actor createActorAndFilm(Actor actor, Film film) {
		EntityManager em = emf.createEntityManager();
		Language language = em.find(Language.class, 1);
		film.setLanguage(language);
		actor.addFilm(film);
		em.getTransaction().begin();
		em.persist(actor);
		
		
		em.flush();
		em.getTransaction().commit();
		em.close();
		return actor;
	}

	
	
	
}
