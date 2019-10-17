package com.skilldistillery.jpavideostore.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="create_date")
	@Temporal(TemporalType.DATE)
	private Date createDate;
	
	private String email;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="address_id")
	private Address address;
	
	@ManyToOne
	@JoinColumn(name="store_id")
	private Store store;
	
	
	
	@OneToMany(mappedBy="customer")
	private List<Rental> rentals;
	
	public void addRental(Rental rental) {
		if (rentals == null) {
			rentals = new ArrayList<>();
		}
		if(!rentals.contains(rental)) {
			rentals .add(rental);
			
			if(rental.getRentalDate() != null) {
				getRentals().remove(rental);
			}
			rental.setRentalDate(new Date());
		}
	}
	
	@OneToMany(mappedBy="rental")
	public void removeRental(Rental rental) {
		rental.setReturnDate(new Date());
		rental.setRentalDate(null);
		if(rentals != null) {
			rentals.remove(rental);
		}
	}
	
	public List<Rental> getRentals() {
		List<Rental> rentalCopies = new ArrayList<>(rentals);
		return rentalCopies;
	}

	public void setRentals(List<Rental> rentals) {
		this.rentals = rentals;
	}
	

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		builder.append("Customer [id=").append(id).append(", firstName=").append(firstName).append(", lastName=")
				.append(lastName).append(", createDate=").append(createDate).append(", email=").append(email)
				.append(", address=").append(address).append("]");
		return builder.toString();
	}
}
