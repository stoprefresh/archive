package com.skilldistillery.xtremerest.data;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.skilldistillery.xtreme.entities.Post;

@Service
@Transactional
public class PostDaoImpl implements PostDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Post> findAllPosts() {
		String findALLQuery = "SELECT p from Post p order by p.id asc";
		List <Post> allPosts = em.createQuery(findALLQuery, Post.class).getResultList();
		return allPosts;
	}
	

	@Override
	public Post findPostById(int id) { return em.find(Post.class, id);}

	@Override
	public boolean deletePost(int id) {
		
		em.remove(findPostById(id));
		
			return true;	
	}

	@Override
	public Post updatePost(@RequestBody Post newPost, int id) {
		Post updatedPost = findPostById(id);
		updatedPost.setName(newPost.getName());
		updatedPost.setEmail(newPost.getEmail());
		updatedPost.setDescription(newPost.getDescription());
		updatedPost.setPrice(newPost.getPrice());
		updatedPost.setImageUrl(newPost.getImageUrl());
		updatedPost.setBrand(newPost.getBrand());
		updatedPost.setCategory(newPost.getCategory());
			
		return updatedPost;
	}

	@Override
	public Post createPost(@RequestBody Post post) {
		em.persist(post);
		em.flush();
		return post;
	}
	
	
}
