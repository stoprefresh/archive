package com.skilldistillery.jpavideostore.client;

import com.skilldistillery.jpavideostore.data.ActorDAO;
import com.skilldistillery.jpavideostore.data.ActorDAOImpl;
import com.skilldistillery.jpavideostore.entities.Actor;
import com.skilldistillery.jpavideostore.entities.Film;

public class ActorDAOTest {

	public static void main(String[] args) {
		ActorDAO dao = new ActorDAOImpl();
		RelationshipCRUDClient rcr = new RelationshipCRUDClient();
//		Actor me = new Actor();
//		me.setFirstName("Miguel");
//		me.setLastName("Marsiglia");
//		System.out.println(me);
//		System.out.println(dao.create(me)); 
//		System.out.println(me);

//		Actor employedActor = new Actor();
//		employedActor.setFirstName("Horatio");
//		employedActor.setLastName("Starblower");
//		System.out.println(dao.update(298, employedActor));
		
//		System.out.println(dao.destroy(297));
		
		Film film = new Film("Hope This Works", 4.99, 2.99);
		Actor me = new Actor("Miguel","Marsiglia");
		
		Actor revisedActor = dao.createActorAndFilm(me, film);
		System.out.println(revisedActor);
		
		rcr.addNewActorToFilm(507, me);
		
		System.out.println(revisedActor);
		
		

	}
}
