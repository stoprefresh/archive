package com.skilldistillery.videostorerest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilldistillery.jpavideostore.entities.Actor;
import com.skilldistillery.jpavideostore.entities.Film;
import com.skilldistillery.jpavideostore.entities.Language;
import com.skilldistillery.videostorerest.repositories.FilmRepository;

@Service
public class FilmServiceImpl implements FilmService {
	
	@Autowired
	private FilmRepository repo;

	@Override
	public List<Film> index() {	return repo.findAll();}
	
	
	

	@Override
	public Film show(int fid) { 
		Optional<Film> opt = repo.findById(fid); 
		if(opt.isPresent()) { 
			return opt.get();
			} 
		return null;
		}
	

	@Override
	public Film create(Film film) { 
		if(film.getLanguage() == null) {
			Language lang = new Language();
			lang.setId(1);
			film.setLanguage(lang);
		}
		return repo.saveAndFlush(film);
		}

	@Override
	public Film update(int fid, Film film) {
		Optional<Film> opt = repo.findById(fid);
		Film managedFilm = null;
		
		if(opt.isPresent()) {
			managedFilm = opt.get();
			managedFilm.setDescription(film.getDescription());
			managedFilm.setLanguage(film.getLanguage());
			managedFilm.setLength(film.getLength());
			managedFilm.setRating(film.getRating());
			managedFilm.setReleaseYear(film.getReleaseYear());
			managedFilm.setReplacementCost(film.getReplacementCost());
			managedFilm.setRentalRate(film.getRentalRate());
			managedFilm.setTitle(film.getTitle());
			
			repo.saveAndFlush(managedFilm);
		}
		
		return managedFilm;
	}

	@Override
	public Boolean delete(int fid) {
		Boolean deleted = false;
		try {
			repo.deleteById(fid);
			deleted = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return deleted;
	}

	@Override
	public List<Actor> findFromFilm(int id) {
		return repo.queryForActorsByFilmId(id);
	}
}
