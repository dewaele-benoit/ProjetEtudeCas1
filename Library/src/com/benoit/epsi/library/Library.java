package com.benoit.epsi.library;

import java.io.IOException;
import java.util.ArrayList;

public class Library {
	//Liste des livres
	private ArrayList<Book> lesBooks = new ArrayList<Book>();
	
	/**
	* Get a book from its id
	*
	* @param id the id of the wanter book
	* @return a book with the given id if there is one
	*/
	public Book getBook (String id){
		Book leBook = null;
		for (Book unBook : lesBooks){
			if (unBook.getId().equals(id)){
				leBook = unBook;
			}
		}
		return leBook;
	}
	
	/**
	* Add a book with the given ISBN
	*
	* @param isbn the ISBN
	* @return the id of the added book if the isbn exists
	*/
	public String addBook (String ISBN){
		return null;
	}
	
	/**
	* Borrow a book from the library
	*
	* @param id the id of the borrowed book
	* @param username the name of the user
	* @throws BookNotFoundException if no book in the library has the given id
	* @throws UnavailableBookException if all books in the library with the given id
	have been borrowed
	*/
	public void borrowBook(String id, String username) throws BookNotFoundException, UnavailableBookException{
		
	}
	
	/**
	* Return a book back to the library
	*
	* @param id the id of the book to borrow
	* @param username the name of the user
	* @throws BookNotFoundException if no book in the library has the given id
	* @throws AllBooksAlreadyReturnedException if all books with the given id are
	already returned
	*/
	public void returnBook(String id, String username) throws BookNotFoundException, AllBooksAlreadyReturnedException{
		
	}
	
	/**
	* Get all books of the library
	*
	* @return the books
	*/
	public ArrayList<Book> getBooks(){
		return null;
	}
	
	/**
	* Return all books with an author, a title or an ISBN matching the search term
	*
	* @param searchTerm the searched term
	* @return the books matching the search term
	*/
	public ArrayList<Book> searchBooks(String searchTerm){
		return null;
	}
}
	
