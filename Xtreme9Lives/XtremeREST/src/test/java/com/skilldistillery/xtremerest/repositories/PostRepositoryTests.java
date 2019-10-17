package com.skilldistillery.xtremerest.repositories;

import static org.junit.Assert.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.skilldistillery.xtreme.entities.Post;

@RunWith(SpringRunner.class)
@SpringBootTest
class PostRepositoryTests {

	@Autowired
	private PostRepository repo;

	@Test
	void test() {
		Optional<Post> posts = repo.findById(1);
		assertNotNull(posts);
		
	}
}
