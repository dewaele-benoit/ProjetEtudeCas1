package com.benoit.epsi.library;

import java.util.List;
import java.util.ArrayList;

public class Client {
	 // Parameters of the client
	private String username, id, role, email, address;
	// List of client's books
	private List<Book> myBooks = new ArrayList<Book>();
	
	/**
	 * Constructeur
	 * @param unUsername
	 */
	public Client(String username, String id, String role, String email, String address) {
		this.username = username;
		this.id = id;
		this.role = role;
		this.email = email;
		this.address = address;
	}
	
	/**
	 * 
	 * @return the username of the client
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Modify the username of the client
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * 
	 * @return the id of the client
	 */
	public String getId() {
		return id;
	}

	/**
	 * Modify the id of the client
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * 
	 * @return the Role of the client
	 */
	public String getRole() {
		return role;
	}

	/**
	 * Modify the role of the client
	 * @param role
	 */
	public void setRole(String role) {
		this.role = role;
	}
	
	/**
	 * 
	 * @return the email of the client
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Modify the username of the client
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 
	 * @return the address of the client
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Modify the address of the client
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 
	 * @return the list of books of the client
	 */
	public List<Book> getMyBooks() {
		return myBooks;
	}

	/**
	 * Modify the list of books of the client
	 * @param myBooks
	 */
	public void setMyBooks(List<Book> myBooks) {
		this.myBooks = myBooks;
	}
	
}
