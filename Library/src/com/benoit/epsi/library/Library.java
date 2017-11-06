package com.benoit.epsi.library;

import java.io.IOException;
import java.util.ArrayList;

public class Library {
	//Liste des livres
	private ArrayList<Book> lesBooks = new ArrayList<Book>();
	private ArrayList<Client> lesClients = new ArrayList<Client>();
	
	/**
	* Get a book from its id
	*
	* @param id the id of the wanter book
	* @return a book with the given id if there is one
	*/
	public Book getBook (String id){
		Book leBook = null;
		//Parcour de la liste de livres 
		for (Book unBook : lesBooks){
			//Si le l'id existe on retourne le livre
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
		String id = null;
		//Parcour de la liste des livres
		for (Book unBook : lesBooks){
			//Si le code ISBN existe id prend la valeur de l'id du livre
			if (unBook.getISBN().equals(ISBN)){
				id = unBook.getId(); 
			}
		}
		//Si l'id reste null alors on ajoute le livre avec le code ISBN
		if (id == null){
			Book newBook = new  Book (ISBN);
		}
		return id;
	}
	
	/**
	* Borrow a book from the library
	*
	* @param id the id of the borrowed book
	* @param username the name of the user
	* @throws BookNotFoundException if no book in the library has the given id
	* @throws UnavailableBookException if all books in the library with the given id have been borrowed
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
		return lesBooks;
	}
	
	/**
	* Return all books with an author, a title or an ISBN matching the search term
	*
	* @param searchTerm the searched term
	* @return the books matching the search term
	*/
	public ArrayList<Book> searchBooks(String searchTerm){
		ArrayList<Book> booksMatch = new ArrayList<Book>();
		for (Book unBook : lesBooks){
			//Si ca match avec le titre, l'auteur ou L'ISBN alors on l'ajoute à la liste
			if (unBook.getISBN().equals(searchTerm) || unBook.getTitle().equals(searchTerm) || unBook.getAuthor().equals(searchTerm)){
				booksMatch.add(unBook); 
			}
		}
		
		return booksMatch;
	}
}
	
