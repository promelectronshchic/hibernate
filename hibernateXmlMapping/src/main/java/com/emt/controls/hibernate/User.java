package com.emt.controls.hibernate;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = -6486255090330415722L;
	
	private long id;
	private int age;
	private String firstname;
	private String lastname;
	
	private Role role;
	private TaxCard taxCard;
	
	public User() {
	}
	
	public User(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public TaxCard getTaxCard() {
		return taxCard;
	}

	public void setTaxCard(TaxCard taxCard) {
		this.taxCard = taxCard;
	}
	
}
