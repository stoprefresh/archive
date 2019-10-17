package com.skilldistillery.jpavideostore.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Store {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	@JoinColumn(name="address_id")
	private Address address;
	
	@Column(name="manager_id")
	private int mId;
	
	@OneToMany(mappedBy="store")
	private List<Customer> customers;
	
	
	
	@OneToMany(mappedBy="store")
	private List<Staff> staff;
	
	@ManyToMany(mappedBy="stores")
	private List<Film> films;
	
//	private List<InventoryItem> copies;
	
	
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	public void addFilm(Film film) {
		if(films == null) {
			films = new ArrayList<>();
		}
		if(!films.contains(film)) {
			films.add(film);
			film.addStore(this);
		}
	}
	public void removeFilm(Film film) {
		if(films != null && films.contains(film)) {
			films.remove(film);
			film.removeStore(this);
		}
	}
	
	

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public List<Staff> getStaff() {
		return staff;
	}

	public void setStaff(List<Staff> staff) {
		this.staff = staff;
	}

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}

	public int getId() {
		return id;
	}

	public List<Customer> getCustomer() {
		return customers;
	}

	public void setCustomer(List<Customer> customers) {
		this.customers = customers;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Store [id=").append(id).append(", address=").append(address).append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Store other = (Store) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
