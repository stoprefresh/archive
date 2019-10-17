package com.skilldistillery.xtremerest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;
import com.skilldistillery.xtreme.entities.Category;
import com.skilldistillery.xtremerest.repositories.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepository repo;

	@Override
	public List<Category> allCategories() { return repo.findAll(); }

}
