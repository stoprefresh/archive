package com.skilldistillery.videostorerest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilldistillery.jpavideostore.entities.Actor;


public interface ActorRepository extends JpaRepository<Actor, Integer>{
	
	

}
