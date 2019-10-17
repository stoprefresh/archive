package com.skilldistillery.todoapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.skilldistillery.todoapp.entities.User;
import com.skilldistillery.todoapp.repositories.UserRepository;

@Service
public class AuthServiceImpl implements AuthService {

	@Autowired
	private UserRepository uRepo;
	
	@Autowired
	private PasswordEncoder encoder;
	
	@Override
	public User register(User user) {
		
		String plainPassword  = user.getPassword();
		String encryptedPassword = encoder.encode(plainPassword);
		user.setPassword(encryptedPassword);
		
		user.setEnabled(true);
		
		user.setRole("standard");
		
		uRepo.saveAndFlush(user);
		
		return user;
	}

}
