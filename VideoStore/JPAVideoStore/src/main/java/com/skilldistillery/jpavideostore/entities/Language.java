package com.skilldistillery.jpavideostore.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Language {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	
	@JsonIgnore
	@OneToMany(mappedBy = "language")
	private List<Film> films;
	
	public void addFilm(Film film) {
		if (films == null) {
			films = new ArrayList<>();
		}
		if(!films.contains(film)) {
			films .add(film);
			
			if(film.getLanguage() != null) {
				film.getLanguage().getFilms().remove(film);
			}
			film.setLanguage(this);
		}
	}
	
	
	public void removeFilm(Film film) {
		film.setLanguage(null);
		if(films != null) {
			films.remove(film);
		}
	}

	public List<Film> getFilms() {
		List<Film> filmCopies = new ArrayList<>(films);
		return filmCopies;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Language [id=").append(id).append(", name=").append(name).append("]");
		return builder.toString();
	}
}
