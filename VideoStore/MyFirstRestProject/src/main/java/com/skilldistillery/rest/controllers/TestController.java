package com.skilldistillery.rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skilldistillery.rest.data.User;


@RestController
public class TestController {
	
	@RequestMapping(path="ping", method = RequestMethod.GET)
	public String ping() {
		return "pong";
	}
	
	@PostMapping("echo")
	public String echo(@RequestBody String someinfo) {
		return someinfo;
	}
	
	@GetMapping("api/users/{id}")
	public User getUser(@PathVariable("id") Integer id) {
		return new User("Miguel Marsiglia", "MMiguel", "MM@gmail.com", "something");
	} 
	
	@PostMapping("api/users")
	public User addUser(@RequestBody User userParam) {
		System.out.println(userParam);
		return userParam;
	}
}
