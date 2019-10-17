package com.skilldistillery.todoapp.controllers;

import java.security.Principal;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.todoapp.entities.Todo;
import com.skilldistillery.todoapp.services.TodoService;

@RestController
@CrossOrigin({"*", "http://localhost:4201"})
@RequestMapping("api")
public class TodoController {
	
	@Autowired
	private TodoService svc;
	
	@GetMapping("todo/ping")
	public String ping() {
		return "pong";
	}
		
	@GetMapping("todos")
	public Set<Todo> index(HttpServletRequest req,
			HttpServletResponse resp,
			Principal principal)
	{
		return svc.index(principal.getName());
	}
	
	@GetMapping("todos/{tid}")
	public Todo retrieve(HttpServletResponse resp, 
			HttpServletRequest req,
			@PathVariable("tid") Integer tid,
			Principal principal) 
	{
		
		return svc.show(principal.getName(), tid);
	}
	
	@PostMapping("todos")
	public Todo create(@RequestBody Todo todo,
			HttpServletResponse resp, 
			HttpServletRequest req,
			Principal principal) 
	{
		todo = svc.create(principal.getName(), todo);
		
		if(todo != null) {
			resp.setStatus(201);
		StringBuffer url = req.getRequestURL();
			url.append("/");
		url.append(todo.getId());
		resp.setHeader("Location", url.toString());
		}
		else {
			resp.setStatus(404);
		}
		return todo;
	
	}
	
//	 todo.setId(id);
//	 * todo.setUser(todoToUpdate.getUser());
//	 * todoToUpdate = repo.saveAndFlush(todo);
	
	@PutMapping("todos/{tid}")
	public Todo replace(@PathVariable("tid") Integer tid,
		@RequestBody Todo updatedTodo,
		HttpServletResponse resp,
		Principal principal) 
	{
			System.out.println(updatedTodo);
			return svc.update(principal.getName(), tid, updatedTodo);
	}
	
	@DeleteMapping("todos/{tid}")
	public void destroy(@PathVariable("tid") Integer tid,
			HttpServletResponse resp,
			Principal principal) 
	{
		if(svc.destroy(principal.getName(), tid)) {
			resp.setStatus(204);
		}
		else {
			resp.setStatus(404);
		}
	}
}	








