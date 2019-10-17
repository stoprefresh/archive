package com.skilldistillery.xtremerest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilldistillery.xtreme.entities.Post;
import com.skilldistillery.xtremerest.repositories.CategoryRepository;
import com.skilldistillery.xtremerest.repositories.PostRepository;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepository repo;
	
	@Autowired
	private CategoryRepository cRepo;
	
	@Override
	public List<Post> index() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> postsForCategoryId(int catId) {
		List<Post> posts = null;
		if(cRepo.existsById(catId)) {
			posts = repo.findByCategory_Id(catId);
		}
		return posts;
	}

	@Override
	public List<Post> postsForKeyword(String keyword){
		keyword = "%" + keyword + "%";
		return repo.findByNameLikeOrTitleLike(keyword, keyword);
	}
	
	@Override
	public List<Post> postsForPriceRange(double low, double high){
		return null;
	}

}
