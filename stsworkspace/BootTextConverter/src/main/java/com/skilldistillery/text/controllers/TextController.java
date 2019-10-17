package com.skilldistillery.text.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.skilldistillery.text.services.UnderscoreTextTranslationService;

@Controller
public class TextController {

	@Autowired
	UnderscoreTextTranslationService trs;
	
	public void setFilmDAO(UnderscoreTextTranslationService trs) {
		this.trs = trs;
	}

	@RequestMapping(path="/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(path="translate.do", method = RequestMethod.GET)
	public ModelAndView translate(String phrase) {
		String someWord = trs.translateText(phrase);
		ModelAndView mv = new ModelAndView("translated", "translation", someWord);
		return mv;
	}S
}
