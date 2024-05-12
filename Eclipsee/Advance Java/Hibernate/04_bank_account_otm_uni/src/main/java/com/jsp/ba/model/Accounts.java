package com.jsp.ba.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Accounts {
	
	@Id
	private int id;
	private String name;
	private long contact;
	private double balance;
	private long account_number;
	
	public Accounts() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getAccount_number() {
		return account_number;
	}

	public void setAccount_number(long account_number) {
		this.account_number = account_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

