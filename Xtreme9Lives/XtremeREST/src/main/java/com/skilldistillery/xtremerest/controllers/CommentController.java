package com.skilldistillery.xtremerest.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.xtreme.entities.Comment;
import com.skilldistillery.xtremerest.services.CommentService;

@RestController
@RequestMapping("api")
public class CommentController {
	
	@Autowired
	private CommentService svc;
	
	@GetMapping("posts/{pid}/comments")
	public List<Comment> commentsForPostId(@PathVariable("pid") Integer pid,
			HttpServletResponse resp)
	{
		
		List<Comment> comments = svc.commentsForPostId(pid);
		if(comments == null) {
			resp.setStatus(404);
		}
		return comments;
	}		

	
	@PostMapping("posts/{pid}/comments")
	public Comment addCommentToPost(
				@PathVariable("pid") Integer pid,
				@RequestBody Comment comment,
				HttpServletResponse resp, 
				HttpServletRequest req)
	{
		comment = svc.addCommentToPost(pid, comment);
		if(comment != null) {
			resp.setStatus(201);
			StringBuffer url = req.getRequestURL();
			url.append("/");
			url.append(comment.getId());
			resp.setHeader("Location", url.toString());
			
		}
		else {
			resp.setStatus(404);
		}
		return comment;
	}
	
	@DeleteMapping("posts/{pid}/comments/{cid}")
	public void deleteComment(
			@PathVariable("pid") Integer pid,
			@PathVariable("cid") Integer cid,
			HttpServletResponse resp
			) 
	{
			if(svc.deleteCommentFromPost(pid, cid)) {
				resp.setStatus(204);
			}
			else {
				resp.setStatus(404);
			}
		
	}
	
	
	
}
