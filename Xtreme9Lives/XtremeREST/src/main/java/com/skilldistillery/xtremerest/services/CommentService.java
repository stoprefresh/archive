package com.skilldistillery.xtremerest.services;

import java.util.List;

import com.skilldistillery.xtreme.entities.Comment;

public interface CommentService {

	List<Comment> commentsForPostId(int pid);
	
	Comment addCommentToPost(int pid, Comment comment);
	
	Boolean deleteCommentFromPost(int pid, int commentId);
}
