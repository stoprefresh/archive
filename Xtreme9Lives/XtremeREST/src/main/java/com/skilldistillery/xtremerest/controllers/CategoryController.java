package com.skilldistillery.xtremerest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.xtreme.entities.Category;
import com.skilldistillery.xtremerest.services.CategoryService;

@RestController
@RequestMapping("api")
public class CategoryController {
	
	@Autowired
	private CategoryService svc;

//	Postman Test
	@GetMapping("category/ping")
	public String ping() {
		return "pong";
	}
//	Postman Test
	
	@GetMapping("categories")
	public List<Category> index(){
		return svc.allCategories();
	}
	
	
	
}	
