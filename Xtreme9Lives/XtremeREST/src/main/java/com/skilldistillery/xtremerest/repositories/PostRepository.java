package com.skilldistillery.xtremerest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilldistillery.xtreme.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer >{

	List<Post> findByCategory_Id(int id);
	
	List<Post> findByNameLikeOrTitleLike(String kw1, String kw2);
	
	List<Post> findByPriceBetween(double low, double high);
	
}
