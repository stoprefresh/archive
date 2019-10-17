package com.skilldistillery.xtreme.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String title;
	
	private String name;
	
	@Email(message = "Email not valid. Please enter a valid email address.")
	private String email;
	
	private String description;
	
	private double price;
	
	@Column(name="image_url")
	private String imageUrl;
	
	private String brand;
	
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	
	@JsonIgnore
	@OneToMany(mappedBy = "post")
	private List<Comment> comments;
	
	@Column(name="created_at")
	@CreationTimestamp
	private Date createdAt;

	@Column(name="updated_at")
	@UpdateTimestamp
	private Date updatedAt;

//	Constructor Start
	public Post () {}
	
	public Post(double price, Date createdAt, Date updatedAt, String ...info) {
		setPrice(price);
		setCreatedAt(createdAt);
		setUpdatedAt(updatedAt);
		if(info[0]!=null) {setTitle(info[0]);}
		if(info[1]!=null) {setName(info[1]);}
		if(info[2]!=null) {setEmail(info[2]);}
		if(info[3]!=null) {setDescription(info[3]);}
		if(info[4]!=null) {setImageUrl(info[4]);}
		if(info[5]!=null) {setBrand(info[5]);}
	}
//	Constructor End
	
//	Add - Remove Comments Start
	public void addComment(Comment comment) {
		if (comments == null) {
			comments = new ArrayList<>();
		}
		if(!comments.contains(comment)) {
			comments.add(comment);
			
			if(comment.getPost() != null) {
				comment.getPost().getComments().remove(comment);
			}
			comment.setPost(this);
		}
	}
	
	public void removeComment(Comment comment) {
		comment.setPost(null);
		if(comments != null) {
			comments.remove(comment);
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
//	Getters - Setters End
	
//	To String Start
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Post [id=").append(id).append(", title=").append(title).append(", name=").append(name)
				.append(", email=").append(email).append(", description=").append(description).append(", price=")
				.append(price).append(", imageUrl=").append(imageUrl).append(", brand=").append(brand)
				.append(", category=").append(category).append(", comments=").append(comments).append(", createdAt=")
				.append(createdAt).append(", updatedAt=").append(updatedAt).append("]");
		return builder.toString();
	}
//	To String End

//	Hash-Code and Equals Start
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
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
		Post other = (Post) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
//	Hash-Code and Equals End
}