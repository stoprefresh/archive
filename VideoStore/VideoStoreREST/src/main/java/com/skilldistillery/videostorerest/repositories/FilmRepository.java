package com.skilldistillery.videostorerest.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.skilldistillery.jpavideostore.entities.Actor;
import com.skilldistillery.jpavideostore.entities.Film;
import com.skilldistillery.jpavideostore.entities.Language;
import com.skilldistillery.jpavideostore.entities.Rating;

public interface FilmRepository extends JpaRepository<Film, Integer> {

//	Write a method stub that will find a film by its title.
	List<Film> findByTitle(String aTitle);
	
//	Write a method stub that will find a collection of films by their language.
	List<Film> findByLanguage(Language lang);
	
//	Write a method stub that will find a collection of films by their language as well as their release year.
	List<Film> findByLanguageAndReleaseYear(Language lang, int releaseYear);
	
//	Write a method stub that will find a collection of films that have replacement costs within a specific range.
	List<Film> findByReplacementCostBetween(double low, double high);
	
//	Write a method stub that will find a collection of films by their rating.
	List<Film> findByRating(Rating rating);
	
//	Target a specific field of an object - the Language.getName()
	List<Film> findByLanguage_Name(String name);
	
//	Set<Film> findByCopies_Rentals_Customer_Address_State(String state);
	
//	findByReplacementCostGreaterThanEqualAndReplacementCostLessThanEqual
	@Query("SELECT f FROM Film f where f.replacementCost BETWEEN :l AND :h")
	List<Film> queryByReplacementCostInRange(@Param("l") double lCost, @Param("h") double hCost);
	
	
//	@Query("SELECT f FROM film WHERE id NOT IN (Select film_id from film_actor)")
//	List<Film> queryForFilmsWithNoActors();
	
//	@Query("SELECT f.actors FROM film WHERE :id")
//	List<Actor> queryForActorsByFilmId(@Param("id") int id);
}















