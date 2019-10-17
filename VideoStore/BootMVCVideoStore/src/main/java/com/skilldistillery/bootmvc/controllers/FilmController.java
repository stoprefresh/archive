package com.skilldistillery.bootmvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.bootmvc.data.FilmDAO;
import com.skilldistillery.jpavideostore.entities.Film;

@Controller
public class FilmController {

	@Autowired
	private FilmDAO dao;
	
	@RequestMapping(path="/")
	public String index(Model model) {
		List<Film> films = dao.findAll();
		model.addAttribute("films", films);
		return "index";
	}
	
	@RequestMapping(path="getFilm.do")
	public String showFilm(@RequestParam("fid") Integer filmId, Model model) {
		Film film = dao.findById(filmId);
		model.addAttribute("film", film);
		return "film/show";
	}
}
