package com.skilldistillery.videostorerest.repositories;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.skilldistillery.jpavideostore.entities.Film;
import com.skilldistillery.jpavideostore.entities.Language;
import com.skilldistillery.jpavideostore.entities.Rating;

@RunWith(SpringRunner.class)
@SpringBootTest
class FilmRepositoryTests { 
	
	@Autowired
	private FilmRepository repo;

	@Test
	@DisplayName("Find by title")
	void test_FilmRepository_findByTitle() {
		List <Film> films = repo.findByTitle("ACADEMY DINOSAUR");
		assertEquals("ACADEMY DINOSAUR", films.get(0).getTitle());
	} 
	
	@Test
	@DisplayName("Find by language")
	void test_FilmRepository_findByLanguage() {
		Language lang = new  Language();
		lang.setId(2);
		List<Film>films = repo.findByLanguage(lang);
		
		assertNotNull(films);
		
		assertEquals("GUNFIGHTER MUSSOLINI", films.get(0).getTitle());	
	}
	
	@Test
	@DisplayName("Find by Language and Release Year")
	void test_FilmRespoitory_findByLanguageAndReleaseYear() {
		Language lang = new  Language();
		lang.setId(2);
		List<Film>films = repo.findByLanguageAndReleaseYear(lang, 2014);
		
		assertNotNull(films);
		assertEquals("ITALIAN AFRICAN", films.get(0).getTitle());
	}
	
	@Test
	@DisplayName("Find by Replacement Cost between two ints")
	void test_FilmRepository_findByReplacementCostBetween() {
		List<Film>films = repo.findByReplacementCostBetween(0.99, 20.99);
		assertNotNull(films);
		
		assertEquals("ACE GOLDFINGER", films.get(1).getTitle());
	}
	
	@Test
	@DisplayName("Find by Rating")
	void test_FilmRepository_findByRating() {
		List<Film>films = repo.findByRating(Rating.PG);
		
		assertNotNull(films);
		
		assertEquals("ACADEMY DINOSAUR", films.get(0).getTitle());
		assertEquals(Rating.PG, films.get(5).getRating());
	}	
	
	@Test
	@DisplayName("Find Films with Replacement cost >= and <= input")
	void test_FilmRepository_queryByReplacementCostInRange() {
		List<Film> films = repo.queryByReplacementCostInRange(0.00, 30.99);
		
		assertNotNull(films);
	
	}
	
	@Test
	@DisplayName("Find films with no actors")
	void test_FilmRepository_queryForFilmsWithNoActors() {
		List<Film> films = repo.queryForFilmsWithNoActors();
		assertNotNull(films);
	}
}
