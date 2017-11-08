package com.benoit.epsi.library;

public interface LibraryInterface {
	
	public Book getBook(String id);
	
	public String addBook(String isbn);
	
	public void borrowBook(String id, String username) throws LibraryException;
	
	public void returnBook(String id, String username) throws LibraryException;
	
}
