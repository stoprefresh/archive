package com.skilldistillery.xtremerest.controllers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.xtreme.entities.Comment;
import com.skilldistillery.xtreme.entities.Post;
import com.skilldistillery.xtremerest.services.PostService;

@RestController
@RequestMapping("api")
public class PostController { 
		
	@Autowired
	private PostService svc; 
	 
//	Postman Test
	@GetMapping("post/ping")
	public String ping() {
		return "pong";
	} 
//	Postman Tests
	
	@GetMapping("categories/{id}/posts")
	public List<Post> postsForCategoryId(
			@PathVariable("id") Integer catId,
			HttpServletResponse resp)
	{
		List<Post> posts = svc.postsForCategoryId(catId);
		if(posts == null) {
			resp.setStatus(404);
		}
		return posts;
	}
	
	@GetMapping("posts/search/{keyword}")
	public List<Post> postsBySearchTerm(
			@PathVariable("keyword") String keyword
			)
	{
		return svc.postsForKeyword(keyword);
	}
	
	@GetMapping("posts/search/price/{low}/{high}")
	public List<Post> postsByPriceRange(
			@PathVariable("low") double low,
			@PathVariable("high") double high
			)
	{
		return svc.postsForPriceRange(low, high);
	}
}










