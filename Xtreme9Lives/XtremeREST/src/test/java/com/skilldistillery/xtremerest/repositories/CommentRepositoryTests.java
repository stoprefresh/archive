package com.skilldistillery.xtremerest.repositories;

import static org.junit.Assert.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.skilldistillery.xtreme.entities.Comment;

@RunWith(SpringRunner.class)
@SpringBootTest
class CommentRepositoryTests {

	@Autowired
	private CommentRepository repo;

	@Test
	void test() {
		Optional<Comment> comments = repo.findById(1);
		assertNotNull(comments);
		
	}

}
