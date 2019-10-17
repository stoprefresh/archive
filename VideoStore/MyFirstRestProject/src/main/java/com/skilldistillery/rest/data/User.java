package com.skilldistillery.rest.data;

public class User {

	private String name;
	private String username;
	private String email;
	private String password;
	
	public User(){}
	
	public User(String ...params) {
		setName(params[0]);
		setUsername(params[1]);
		setEmail(params[2]);
		setPassword(params[3]);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [name=").append(name).append(", username=").append(username).append(", email=")
				.append(email).append(", password=").append(password).append("]");
		return builder.toString();
	}
	
	
}
