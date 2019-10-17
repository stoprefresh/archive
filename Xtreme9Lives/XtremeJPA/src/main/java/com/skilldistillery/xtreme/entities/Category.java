package com.skilldistillery.xtreme.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@JsonIgnore
	@OneToMany(mappedBy = "category")
	private List<Post> posts;
	
//	Constructor Start
	public Category () {}
	
//	Constructor End
	
//	Add - Remove Comments Start
	public void addPost(Post post) {
		if (posts == null) {
			posts = new ArrayList<>();
		}
		if(!posts.contains(post)) {
			posts.add(post);
			
			if(post.getCategory() != null) {
				post.getCategory().getPosts().remove(post);
				
			}
			post.setCategory(this);
		}
	}
	
	public void removePost(Post post) {
		post.setCategory(null);
		if(posts != null) {
			posts.remove(post);
		}
	}
//	Add - Remove Comments End
	
	
//	Getters - Setters Start
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
//	Getters - Setters End
	
//	To String Start
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Category [id=").append(id).append(", name=").append(name).append(", posts=").append(posts.size())
				.append("]");
		return builder.toString();
	}
//	To String End

//	Hash-Code and Equals Start
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((posts == null) ? 0 : posts.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (posts == null) {
			if (other.posts != null)
				return false;
		} else if (!posts.equals(other.posts))
			return false;
		return true;
	}
//	Hash-Code and Equals End
	
}