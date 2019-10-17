package com.skilldistillery.encapsulation.drills;

public class Account {
	private double balance;
	private String accountId;
	private String name;

	
	public Account(double b, String id, String n) {
		this(id, b);
		name = n;
	}
	public Account(String accountId, double balance) {
		this(accountId);
		this.balance = balance;
	}
	public Account(String accountId) {
		this.accountId = accountId;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccoundId(String accountId) {
		this.accountId = accountId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		this.balance = balance + amount;
	}

	public void withdraw(double amount) {
		this.balance = balance - amount;
	}

}