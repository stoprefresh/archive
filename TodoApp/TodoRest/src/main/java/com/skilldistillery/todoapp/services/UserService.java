package com.skilldistillery.todoapp.services;

import java.util.List;

import com.skilldistillery.todoapp.entities.User;

public interface UserService {
	
	List<User> allUsers();
	
	User findUserById(int uid);
	
	User addUser(User newUser);
	
	Boolean deleteUser(int uid);
	
	User updateUser(int uid, User updatedUser);
}
