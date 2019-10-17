package com.skilldistillery.jpavideostore.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.skilldistillery.jpavideostore.entities.Film;
import com.skilldistillery.jpavideostore.entities.Rental;
import com.skilldistillery.jpavideostore.entities.Store;

public class JPQLRelationshipsLab {
    private EntityManagerFactory emf
                  = Persistence.createEntityManagerFactory("VideoStore");

    public List<Store> getStoresByState(String state) {
        EntityManager em = emf.createEntityManager();
        String jpql = "SELECT s FROM Store s WHERE s.address.state = :st";     //FIXME
        List<Store> stores = em.createQuery(jpql, Store.class)
                               .setParameter("st", state)
                               .getResultList();
        em.close();
        return stores;
    }
    
    public List<Rental> getRentalsForCustomerWithCustomerId(int id) {
        List<Rental> rentals = null;
        EntityManager em = emf.createEntityManager();
//        String jpql = "SELECT c.rentals FROM Customer c WHERE c.id = :cid"; // List<Object>
        String jpql = "SELECT r FROM Rental r WHERE r.customer.id = :cid";
        rentals = em.createQuery(jpql, Rental.class)
                    .setParameter("cid", id)
                    .getResultList();
//        Customer cust = em.find(Customer.class, id);
//        rentals = cust.getRentals();
        em.close();
        return rentals;
    }
    
    public List<Film> getFilmsForActorWithId(int id) {
        List<Film> films = null;
        EntityManager em = emf.createEntityManager();
//        return em.find(Actor.class, id).getFilms();
//        String jpql = "SELECT f FROM Film f WHERE f.actors.id = :aid"; //FIXME
        String jpql = "SELECT f FROM Film f JOIN FETCH f.actors a WHERE a.id = :aid"; //FIXME
        films = em.createQuery(jpql, Film.class)
                  .setParameter("aid", id)
                  .getResultList();
        em.close();
        return films;
    }
    
    public int getNumberOfFilmsForCategoryWithName(String name) {
        int count = -1;
        EntityManager em = emf.createEntityManager();
        String jpql = "SELECT f FROM Film f JOIN FETCH f.categories c WHERE c.name = :cname";
        List<Film> films = em.createQuery(jpql,Film.class)
                             .setParameter("cname", name)
                             .getResultList();
        count = films.size();
        em.close();
        return count;
    }
    
    public List<Film> getInventoryForStoreWithId(int id) {
        List<Film> films = null;
        EntityManager em = emf.createEntityManager();
        String jpql = "SELECT f FROM Film f JOIN FETCH f.stores s WHERE s.id = :sid";
        films = em.createQuery(jpql, Film.class)
                  .setParameter("sid", id)
                  .getResultList();
        em.close();
        return films;
    }
    
    public int checkFilmInventoryItemsForStoreById(int id, String title) {
        EntityManager em = emf.createEntityManager();
//        select count(*) from inventory_item where store_id = 1 and film_id = 1;
        String jpql = "SELECT invItem from InventoryItem  invItem WHERE invItem.store.id = :storeId"
                + " AND invItem.film.title = :title";
        List<Object> films = em.createQuery(jpql, Object.class)
                .setParameter("storeId", id)
                .setParameter("title", title)
                .getResultList();
        int count = films.size();
        em.close();
        return count;
    }
	
	public List<Film> getFilmsRentedForCustomerWithId(int id) {
        EntityManager em = emf.createEntityManager();
        String jpql = "SELECT r.item.film FROM Rental r WHERE r.customer.id = :cid";
        List<Film> films = em.createQuery(jpql, Film.class)
                .setParameter("cid", id)
                .getResultList();
        em.close();
        return films;
    }
}