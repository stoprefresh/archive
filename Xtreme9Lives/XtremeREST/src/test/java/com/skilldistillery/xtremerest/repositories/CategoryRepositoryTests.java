package com.skilldistillery.xtremerest.repositories;

import static org.junit.Assert.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.skilldistillery.xtreme.entities.Category;

@RunWith(SpringRunner.class)
@SpringBootTest
class CategoryRepositoryTests {

	@Autowired
	private CategoryRepository repo;

	@Test
	void test() {
		Optional<Category> categories = repo.findById(1);
		assertNotNull(categories);
		
	}

}
