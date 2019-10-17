package com.skilldistillery.jpavideostore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="address")
	private String street;
	
	@Column(name="address2")
	private String street2;
	
	@Column(name="state_province")
	private String state;
	
	private String city;
	@Column(name="postal_code")
	private String postalCode;
	
	private String phone;
	
	@ManyToOne
	@JoinColumn(name="country_code")
	private Country country;
	
	
	
	
	
	
	

	public Address() {}
	
	public Address(String ...info) {
		setStreet(info[0]);
		if(info[1] != null) {setCity(info[1]);}
		if(info[2] != null) {setState(info[2]);}
		if(info[3] != null) {setPostalCode(info[3]);}
		if(info[4] != null) {setPhone(info[4]);}
	}

	
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [id=").append(id).append(", street=").append(street).append(", street2=")
				.append(street2).append(", state=").append(state).append(", city=").append(city).append(", postalCode=")
				.append(postalCode).append(", phone=").append(phone).append("]");
		return builder.toString();
	}

	
	
}
