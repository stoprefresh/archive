package com.skilldistillery.xtremerest.data;

import java.util.List;

import com.skilldistillery.xtreme.entities.Post;

public interface PostDao {
	List<Post> findAllPosts();
	
	Post findPostById(int id);
	
	boolean deletePost(int id);
	
	Post updatePost(Post post, int id);
	
	Post createPost(Post post);
	
}
