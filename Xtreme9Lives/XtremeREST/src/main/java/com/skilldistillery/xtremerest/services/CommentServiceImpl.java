package com.skilldistillery.xtremerest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilldistillery.xtreme.entities.Comment;
import com.skilldistillery.xtreme.entities.Post;
import com.skilldistillery.xtremerest.repositories.CommentRepository;
import com.skilldistillery.xtremerest.repositories.PostRepository;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository repo;
	
	
	@Autowired
	private PostRepository pRepo;

	@Override
	public List<Comment> commentsForPostId(int pid) {
		if(!pRepo.existsById(pid)) {
			
		}
		List<Comment>comments = repo.findByPost_Id(pid);
		
		return comments;
	}
	
	@Override
	public Comment addCommentToPost(int pid, Comment comment) {
		
		Optional<Post> postOpt = pRepo.findById(pid);
		
		Post managedPost = null;
		if(postOpt.isPresent()) {
			managedPost = postOpt.get();
			comment.setPost(managedPost);
			return repo.saveAndFlush(comment);
		}
		return null;
	}

	@Override
	public Boolean deleteCommentFromPost(int pid, int commentId) {
		boolean deleted = false;
		
		Optional<Comment> opt = repo.findById(commentId);
		
		if(opt.isPresent()) {
			Comment comment = opt.get();
			if(comment.getPost().getId() == pid) {
				repo.deleteById(commentId);
				deleted = true;
			}
		}
		return deleted;
	}
	
	

}
