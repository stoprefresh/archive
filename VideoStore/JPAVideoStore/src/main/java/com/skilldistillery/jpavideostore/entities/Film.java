package com.skilldistillery.jpavideostore.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity		
public class Film {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String title;
	
	private String description;
	
	@Column(name="release_year")
	private Integer releaseYear;
	
	@Column(name="rental_rate")
	private double rentalRate;
	
	private Integer length;
	
	@Column(name="replacement_cost")
	private double replacementCost;
	
	@Enumerated(EnumType.STRING)
	private Rating rating;
	
	@ManyToOne
	@JoinColumn(name= "language_id")
	private Language language;
	
	
	@ManyToMany(mappedBy="films")
	private List<Actor> actors;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(name="film_category",
	joinColumns=@JoinColumn(name="film_id"),
	inverseJoinColumns=@JoinColumn(name="category_id"))
	private List<Category> categories;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(name="inventory_item",
	joinColumns=@JoinColumn(name="film_id"),
	inverseJoinColumns=@JoinColumn(name="store_id"))
	private List<Store> stores;
	
	
	public Film () {}
	
	public Film(String title, double rentalRate, double replacementCost) {
		super();
		this.title = title;
		this.rentalRate = rentalRate;
		this.replacementCost = replacementCost;
	}
	public void addStore(Store store) {
		if(stores == null) {
			stores = new ArrayList<>();
		}
		if(!stores.contains(store)) {
			stores.add(store);
			store.addFilm(this);
		}
	}
	public void removeStore(Store store) {
		if(stores != null && stores.contains(store)) {
			stores.remove(store);
			store.removeFilm(this);
		}
	}

	
	public List<Store> getStores() {
		return stores;
	}

	public void setStores(List<Store> stores) {
		this.stores = stores;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public void setReplacementCost(double replacementCost) {
		this.replacementCost = replacementCost;
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}

	public Double getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(Double rentalRate) {
		this.rentalRate = rentalRate;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Double getReplacementCost() {
		return replacementCost;
	}

	public void setReplacementCost(Double replacementCost) {
		this.replacementCost = replacementCost;
	}
	
	

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}
	
	public void addActor(Actor actor) {
		if(actors == null) {
			actors = new ArrayList<>();
		}
		if(!actors.contains(actor)) {
			actors.add(actor);
			actor.addFilm(this);
		}
	}
	
	public void removeActor(Actor actor) {
		if(actors != null && actors.contains(actor)) {
			actors.remove(actor);
			actor.removeFilm(this);
		}
	}
	
	public void addCategory(Category category) {
		if(categories == null) {
			categories = new ArrayList<>();
		}
		if(!categories.contains(category)) {
			categories.add(category);
			category.addFilm(this);
		}
	}
	public void removeCategory(Category category) {
		if(categories != null && categories.contains(category)) {
			categories.remove(category);
			category.removeFilm(this);
		}
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Film [id=").append(id).append(", title=").append(title).append(", description=")
				.append(description).append(", releaseYear=").append(releaseYear).append(", rentalRate=")
				.append(rentalRate).append(", length=").append(length).append(", replacementCost=")
				.append(replacementCost).append("]");
		return builder.toString();
	}
	

}
