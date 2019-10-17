package com.skilldistillery.todoapp.controllers;

import java.util.List;

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

import com.skilldistillery.todoapp.entities.User;
import com.skilldistillery.todoapp.services.UserService;

@RestController
@CrossOrigin({"*", "http://localhost:4200"})
@RequestMapping("api")
public class UserController {

	@Autowired
	private UserService svc;
	
	@GetMapping("user/ping")
	public String ping() {
		return "pong";
	}
	
	@GetMapping("user/all")
	public List<User> findAllUsers(){
		return svc.allUsers();
	}
	
	@GetMapping("user/{uid}")
	public User getUserById(@PathVariable("uid") Integer uid)
	{
		return svc.findUserById(uid);
		
	}
	
	@PostMapping("user")
	public User addUser(@RequestBody User newUser,
			HttpServletResponse resp, 
			HttpServletRequest req) 
	{
		newUser = svc.addUser(newUser);
		resp.setStatus(201);
		StringBuffer sb = req.getRequestURL();
		sb.append("/");
		sb.append(newUser.getId());
		resp.setHeader("Location", sb.toString());
		return newUser;
	}
	
	@DeleteMapping("user/{uid}")
	public Boolean deleteUser(@PathVariable("uid") Integer uid,
			HttpServletResponse resp)
	{
		Boolean deleted = svc.deleteUser(uid);
		if(deleted == null ) {
			resp.setStatus(404);
		}
		else if(deleted) {
			resp.setStatus(204);
		}
		else {
			resp.setStatus(400);
		}
		return deleted;
	}
	
	
	@PutMapping("user/{uid}")
	public User updateUserById(
			@RequestBody User updatedUser,
			@PathVariable("uid") Integer uid,
			HttpServletResponse resp) 
	{
		return svc.updateUser(uid, updatedUser);
	}
	
	
}





