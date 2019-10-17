package com.skilldistillery.xtremerest.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilldistillery.xtreme.entities.Comment;
import com.skilldistillery.xtreme.entities.Post;

public interface CommentRepository extends JpaRepository<Comment, Integer >{

	List<Comment> findByPost_Id(int id);
}
