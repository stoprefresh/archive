package com.skilldistillery.todoapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilldistillery.todoapp.entities.User;
import com.skilldistillery.todoapp.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository uRepo;

	@Override
	public List<User> allUsers() {
		return uRepo.findAll();
	}

	@Override
	public User findUserById(int uid) {
		Optional<User> user = uRepo.findById(uid);
		if (user.isPresent()) {
			return user.get();
		}
		return null;
	}

	@Override
	public User addUser(User newUser) {
		return uRepo.saveAndFlush(newUser);
	}

	@Override
	public Boolean deleteUser(int uid) {
		Boolean deleted = false;
		try {
			uRepo.deleteById(uid);
			deleted = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return deleted;
	}
	
//	   todo.setId(id);
//	 * todo.setUser(todoToUpdate.getUser());
//	 * todoToUpdate = repo.saveAndFlush(todo);

	@Override
	public User updateUser(int uid, User updatedUser) {
		Optional<User> userOpt = uRepo.findById(uid);
		User managedUser = null;

		if (userOpt.isPresent()) {
			managedUser = userOpt.get();
			managedUser.setEmail(updatedUser.getEmail());
			managedUser.setEnabled(updatedUser.isEnabled());
			managedUser.setTodos(updatedUser.getTodos());
			managedUser.setPassword(updatedUser.getPassword());
			managedUser.setUserName(updatedUser.getUserName());
			managedUser.setRole(updatedUser.getRole());
			uRepo.saveAndFlush(managedUser);
		}
		return managedUser;
	}
}
