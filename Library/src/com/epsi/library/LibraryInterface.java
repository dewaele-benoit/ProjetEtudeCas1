package com.epsi.library;

import java.util.List;
import java.util.Optional;

public interface LibraryInterface {
	
	/**
	* Get a book from its id
	*
	* @param id the id of the wanter book
	* @return a book with the given id if there is one
	*/
	Optional<Book> getBook(String id);
	/**
	* Add a book with the given ISBN
	*
	* @param isbn the ISBN
	* @return the id of the added book if the isbn exists
	*/
	Optional<String> addBook(String ISBN, String id, String title, String author, int quantity);
	/**
	* Borrow a book from the library
	*
	* @param id the id of the borrowed book
	* @param username the name of the user
	* @throws LibraryException the book cannot be borrowed
	*/
	void borrowBook(String id, String username) throws LibraryException;
	/**
	* Return a book back to the library
	*
	* @param id the id of the book to borrow
	* @param username the name of the user
	* @throws LibraryException if the book cannot be returned
	*/
	void returnBook(String id, String username) throws LibraryException;
	/**
	* Get all books of the library
	*
	* @return the books
	*/
	List<Book> getBooks();
	/**
	* Return all books with an author, a title or an ISBN matching the search term
	*
	* @param searchTerm the searched term
	* @return the books matching the search term
	*/
	List<Book> searchBooks(String searchTerm);
	
}
