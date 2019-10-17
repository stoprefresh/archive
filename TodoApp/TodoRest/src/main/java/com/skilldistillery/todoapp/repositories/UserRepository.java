package com.skilldistillery.todoapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skilldistillery.todoapp.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer >{

	User findByUserName(String username);
}
