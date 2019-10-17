package com.skilldistillery.videostorerest.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.jpavideostore.entities.Actor;
import com.skilldistillery.jpavideostore.entities.Film;
import com.skilldistillery.videostorerest.services.FilmService;

@RestController
@RequestMapping("api")
public class FilmController {
	
	@Autowired
//	private FilmDAO daoF;
	private FilmService svc;
	
	@GetMapping("films")
	public List<Film> index(){
//		return daoF.findAll();
		return svc.index();
	}
	
	@GetMapping("films/{id}/actors")
	public List<Actor> getActorsByFilmId(@PathVariable("id") Integer filmId, HttpServletResponse resp){
		return svc.findFromFilm(filmId);
	}

	@GetMapping("films/{id}")
	public Film getFilmById(@PathVariable("id") Integer filmdId, HttpServletResponse resp) {
		
		Film film = svc.show(filmdId);
		if(film == null) {
			resp.setStatus(404);
		}
		return film;
	}
	
	
	 
	@PostMapping("films")
	public Film addNewFilm(@RequestBody Film newFilm,
			HttpServletRequest req, HttpServletResponse resp) {
		newFilm = svc.create(newFilm);
		resp.setStatus(201);
		StringBuffer sb = req.getRequestURL();
		sb.append("/");
		sb.append(newFilm.getId());
		resp.setHeader("Location", sb.toString());
		
		return newFilm;
	}
	
	@DeleteMapping("films/{id}")
	public Boolean deleteFilm(@PathVariable("id") int fid,
			 HttpServletResponse resp) {
		
		Boolean deleted = svc.delete(fid);
		if(deleted ==  null) {
			resp.setStatus(404);
		}
		else if(deleted) {
			resp.setStatus(204);
		}
		else {
			resp.setStatus(400);
		}
		
		return deleted;
	}
	
	@PutMapping("films/{id}")
	public Film updateFilmById(@RequestBody Film updatedFilm, @PathVariable("id") int fid,
			 HttpServletResponse resp) {
	
		return svc.update(fid, updatedFilm);
	}
	
	
}
