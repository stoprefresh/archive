package com.skilldistillery.xtremerest.services;

import java.util.List;

import com.skilldistillery.xtreme.entities.Post;

public interface PostService {

	List<Post> index();
	
	List<Post> postsForCategoryId(int catId);

	List<Post> postsForKeyword(String keyword);

	List<Post> postsForPriceRange(double low, double high);
	
	
}
