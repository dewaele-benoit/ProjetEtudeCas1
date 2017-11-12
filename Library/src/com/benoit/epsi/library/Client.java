package com.benoit.epsi.library;

import java.util.List;
import java.util.ArrayList;

public class Client {
	
	private String username, id, role, email, address;
	private List<Book> myBooks = new ArrayList<Book>();
	
	/**
	 * Constructeur
	 * @param unUsername
	 */
	public Client(String username, String id, String role, String email, String address) {
		super();
		this.username = username;
		this.id = id;
		this.role = role;
		this.email = email;
		this.address = address;
	}
	
	//Getter et setter
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Book> getMyBooks() {
		return myBooks;
	}

	public void setMyBooks(List<Book> myBooks) {
		this.myBooks = myBooks;
	}
	
}
