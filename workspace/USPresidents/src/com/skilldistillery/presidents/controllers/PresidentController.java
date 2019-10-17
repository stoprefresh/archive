package com.skilldistillery.presidents.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.presidents.data.President;
import com.skilldistillery.presidents.data.PresidentDAO;

@Controller
public class PresidentController {

	@Autowired
	private PresidentDAO dao;

	@RequestMapping(path = "getPresident.do", params = "term")
	public String getbyTermNumber(@RequestParam("term") Integer termNum, Model model) {
		
			President p = dao.findByTermNumber(termNum);
			model.addAttribute("president", p);
			return "WEB-INF/president.jsp";
	}
}
