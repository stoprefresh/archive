package com.skilldistillery.todoapp.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilldistillery.todoapp.entities.Todo;
import com.skilldistillery.todoapp.entities.User;
import com.skilldistillery.todoapp.repositories.TodoRepository;
import com.skilldistillery.todoapp.repositories.UserRepository;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoRepository tRepo;

	@Autowired
	private UserRepository uRepo;

	@Override
	public Set<Todo> index(String username) {
		return tRepo.findByUser_userName(username);
	}

	@Override
	public Todo show(String username, int tid) {
		return tRepo.findByIdAndUser_userName(tid, username);
	}

	@Override
	public Todo create(String username, Todo todo) {

		User userOpt = uRepo.findByUserName(username);

		if (userOpt != null) {
			todo.setUser(userOpt);
			return tRepo.saveAndFlush(todo);
		}
		return null;
	}
	
//	 todo.setId(id);
//	 * todo.setUser(todoToUpdate.getUser());
//	 * todoToUpdate = repo.saveAndFlush(todo);

	@Override
	public Todo update(String username, int tid, Todo todo) {
		Optional<Todo> todoOpt = tRepo.findById(tid);
		Todo managedTodo = null;
		User userOpt = uRepo.findByUserName(username);
		
		if (todoOpt.isPresent()) {
			managedTodo = todoOpt.get();
			System.out.println(managedTodo.getUser());
			
			if (managedTodo.getUser().getId() == userOpt.getId()) {
				
				managedTodo.setTask(todo.getTask());
				managedTodo.setDescription(todo.getDescription());
				managedTodo.setCompleted(todo.isCompleted());
				managedTodo.setDueDate(todo.getDueDate());
				managedTodo.setCompleteDate(todo.getCompleteDate());
				tRepo.saveAndFlush(managedTodo);
			}
			return managedTodo;
		}
		return null;
	}

	@Override
	public boolean destroy(String username, int tid) {
		boolean deleted = false;
		Todo todoToDestroy = tRepo.findByIdAndUser_userName(tid, username);
		
		if(todoToDestroy != null) {
			tRepo.deleteById(todoToDestroy.getId());
			deleted = true;
		}
		return deleted;
	}
}
