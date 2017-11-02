package com.benoit.epsi.library;

public interface Library {
	
	public Book getBook(String id);
	
	public String addBook(String isbn);
	
	public void borrowBook(String id, String username) throws BookNotFoundExecption, UnavaibleBookException;
	
	public void returnBook(String id, String username) throws BookNotFoundException, AllBooksAlreadyReturnedException;
	
}
