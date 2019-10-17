package com.skilldistillery.todoapp.repositories;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skilldistillery.todoapp.entities.Todo;


@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer >{

	List<Todo> findByUser_Id(int uid);
	
	Set<Todo> findByUser_userName(String username);
	
	Todo findByIdAndUser_userName(int id, String username);

}
