package com.benoit.epsi.library;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library implements LibraryInterface{
	// Liste des livres
	private List<Book> lesBooks = new ArrayList<Book>();
	private List<Client> lesClients = new ArrayList<Client>();
	
	/**
	 * Get a book from its id
	 *
	 * @param id
	 *            the id of the wanter book
	 * @return a book with the given id if there is one
	 */
	public Optional<Book> getBook(String id) {
		return Optional.ofNullable(searchBooks(id).get(0));
	}

	/**
	 * Add a book with the given ISBN
	 *String unId, String unAuthor, String unTitle, String unISBN, int quantity
	 * @param isbn the ISBN
	 * @return the id of the added book if the isbn exists
	 */
	public Optional<String> addBook(String ISBN, String id, String title, String author, int quantity) {
		if(ValidateISBN.validateIsbn13(ISBN) || ValidateISBN.validateIsbn10(ISBN)){
			if (searchBooks(id).isEmpty() || searchBooks(ISBN).isEmpty()){
				lesBooks.add(new Book(id, author, title, ISBN, quantity));
			}
			else{
				searchBooks(id).get(0).setQuantity(searchBooks(id).get(0).getQuantity()+1);
			}
		}
		return Optional.ofNullable(searchBooks(id).get(0).getId());
	}

	/**
	 * Borrow a book from the library
	 *
	 * @param id
	 *            the id of the borrowed book
	 * @param username
	 *            the name of the user
	 * @throws LibraryException
	 *             if the book cannot be returned
	 */
	public void borrowBook(String id, String username) throws LibraryException {
		for (Client c : lesClients){
			if (c.getUsername().equals(username)){
				if(searchBooks(id).isEmpty()){
					throw new LibraryException();
				}
				else{
					Book borrowBook = searchBooks(id).get(0);
					if(borrowBook.getQuantity()>0 && !c.getMyBooks().contains(borrowBook)){
						c.getMyBooks().add(borrowBook);
						borrowBook.setQuantity(borrowBook.getQuantity()-1);
					}
					else{
						throw new LibraryException();
					}
				}
			}
		}
	}

	/**
	 * Return a book back to the library
	 *
	 * @param id
	 *            the id of the book to borrow
	 * @param username
	 *            the name of the user
	 * @throws LibraryException
	 *             if the book cannot be returned
	 */
	public void returnBook(String id, String username) throws LibraryException {
		for (Client c : lesClients){
			if (c.getUsername().equals(username)){
				if (c.getMyBooks().isEmpty()){
					throw new LibraryException();
				}
				else{
					for (Book b : c.getMyBooks()){
						if (b.getId().equals(id)){
							b.setQuantity(b.getQuantity()+1);
							c.getMyBooks().remove(b);
							break;
						}
					}
				}
			}
		}
	}

	/**
	 * Get all books of the library
	 *
	 * @return the books
	 */
	public List<Book> getBooks() {
		return lesBooks;
	}

	/**
	 * Return all books with an author, a title or an ISBN matching the search
	 * term
	 *
	 * @param searchTerm
	 *            the searched term
	 * @return the books matching the search term
	 */
	public List<Book> searchBooks(String searchTerm) {
		List<Book> booksMatch = new ArrayList<Book>();
		for (Book unBook : lesBooks) {
			// Si ca match avec le titre, l'auteur ou L'ISBN alors on l'ajoute à
			// la liste
			if (unBook.getISBN().equals(searchTerm) || unBook.getTitle().equals(searchTerm)
					|| unBook.getAuthor().equals(searchTerm) || unBook.getId().equals(searchTerm)) {
				booksMatch.add(unBook);
			}
		}

		return booksMatch;
	}

	public void addClient(String username, String id, String role, String email, String address){
		lesClients.add(new Client( username,  id,  role,  email,  address));
	}
	
}
