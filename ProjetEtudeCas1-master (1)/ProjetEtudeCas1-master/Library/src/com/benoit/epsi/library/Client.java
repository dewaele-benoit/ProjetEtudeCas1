package com.benoit.epsi.library;

import java.util.ArrayList;

public class Client {
	
	private String username;
	private ArrayList<Book> myBooks = new ArrayList<Book>();
	
	/**
	 * Constructeur
	 * @param unUsername
	 */
	public Client(String unUsername){
		this.username=unUsername;
	}
	
	public void borrowMyBook(Book myBook)   throws  LibraryException{
		if(!myBooks.contains(myBook)) {
		this.myBooks.add(myBook);
		}else {
			throw new LibraryException();
		}
	}
	
	public void returnMyBook(Book myBook){
		this.myBooks.remove(myBook);
	}
	
	//Getter et setter
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public ArrayList<Book> getMyBooks() {
		return myBooks;
	}

	public void setMyBooks(ArrayList<Book> myBooks) {
		this.myBooks = myBooks;
	}
	
}
