package com.skilldistillery.videostorerest.services;

import java.util.List;

import com.skilldistillery.jpavideostore.entities.Actor;
import com.skilldistillery.jpavideostore.entities.Film;

public interface FilmService {
//index, show, create, update, delete

	List<Film> index();
	Film show(int id);
	Film create(Film film);
	Film update(int fid, Film film);
	Boolean delete(int fid);
	List<Actor> findFromFilm(int id);
	
}
