package com.benoit.epsi.library;

import java.util.ArrayList;
import java.util.List;

public interface LibraryInterface {
	
	public Book getBook(String id);
	
	public List<Book>getBooks();
	
	public String addBook(String isbn);
	
	public void borrowBook(String id, String username) throws LibraryException;
	
	public void returnBook(String id, String username) throws LibraryException;
	
	public ArrayList<Book> searchBooks(String searchTerm);
	
}
