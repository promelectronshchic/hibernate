package com.emt.controls.hibernate;

import java.io.Serializable;

public class TaxCard implements Serializable {

	private static final long serialVersionUID = 187947103079235554L;
	
	private int id;
	private byte[] identifier;

	private User user;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public byte[] getIdentifier() {
		return identifier;
	}
	public void setIdentifier(byte[] identifier) {
		this.identifier = identifier;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
