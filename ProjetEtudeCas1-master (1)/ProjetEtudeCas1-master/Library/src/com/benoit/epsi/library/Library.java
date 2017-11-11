package com.benoit.epsi.library;

import java.io.IOException;
import java.util.ArrayList;

public class Library implements LibraryInterface {
	// Liste des livres
	private ArrayList<Book> lesBooks = new ArrayList<Book>();
	private ArrayList<Client> lesClients = new ArrayList<Client>();

	
	
	public Library(ArrayList<Book> lesBooks, ArrayList<Client> lesClients) {		
		this.lesBooks = lesBooks;
		this.lesClients = lesClients;
	}
	
	

	public Library(ArrayList<Book> lesBooks) {
		this.lesBooks = lesBooks;
	}
	

	public Library() {
		
	}



	// Getter et setter
	public ArrayList<Book> getLesBooks() {
		return lesBooks;
	}

	public void setLesBooks(ArrayList<Book> lesBooks) {
		this.lesBooks = lesBooks;
	}

	public ArrayList<Client> getLesClients() {
		return lesClients;
	}

	public void setLesClients(ArrayList<Client> lesClients) {
		this.lesClients = lesClients;
	}

	/**
	 * Get a book from its id
	 *
	 * @param id
	 *            the id of the wanter book
	 * @return a book with the given id if there is one
	 */
	public Book getBook(String id) {
		Book leBook = null;
		// Parcour de la liste de livres
		for (Book unBook : lesBooks) {
			// Si le l'id existe on retourne le livre
			if (unBook.getId().equals(id)) {
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
	public String addBook(String ISBN) {
		String id = null;
		if(ValidateISBN.validateIsbn13(ISBN) || ValidateISBN.validateIsbn10(ISBN)){
			// Parcour de la liste des livres
			for (Book unBook : lesBooks) {
				// Si le code ISBN existe 
				if (unBook.getISBN().equals(ISBN)) {
					System.out.println("Le livre existe déjà.");
				}
				else{
					try {
					Book newBook = new Book(ISBN);
					System.out.println(newBook.getId());
					}catch(LibraryException e) {}
				}
			}
		}
		return id;
	}
	
	public void addClient(Client c) {
		this.lesClients.add(c);
	}

	/**
	 * Return the client with this username
	 * 
	 * @param username
	 * @return client
	 */
	public Client getClient(String username) {
		Client theClient = null;
		for (Client unClient : lesClients) {
			if (unClient.getUsername().equals(username)) {
				theClient = unClient;
			}
		}
		return theClient;
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
		Book theBook = this.getBook(id);
		if (theBook == null) {
			throw new LibraryException();
		}
		// si le livre est disponible
		if (theBook.getStatus() == Status.FREE) {
			// Parcour pour chaque livre du client s'il ne l'a pas déjà
			for (Book book : this.getClient(username).getMyBooks()) {
				if (book.getId().equals(id)) {
					System.out.println("Vous avez déjà ce livre en votre possession");
				} else {
					theBook.setStatus(Status.BORROWED);
					this.getClient(username).borrowMyBook(theBook);
				}
			}
		} else {
			throw new LibraryException();
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
		Book theBook = this.getBook(id);
		if (theBook == null) {
			throw new LibraryException();
		}
		if (theBook.getStatus() == Status.BORROWED) {
			theBook.setStatus(Status.FREE);
			this.getClient(username).returnMyBook(theBook);
		} else {
			throw new LibraryException();
		}
	}

	/**
	 * Get all books of the library
	 *
	 * @return the books
	 */
	public ArrayList<Book> getBooks() {
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
	public ArrayList<Book> searchBooks(String searchTerm) {
		ArrayList<Book> booksMatch = new ArrayList<Book>();
		for (Book unBook : lesBooks) {
			// Si ca match avec le titre, l'auteur ou L'ISBN alors on l'ajoute à
			// la liste
			if (unBook.getISBN().equals(searchTerm) || unBook.getTitle().equals(searchTerm)
					|| unBook.getAuthor().equals(searchTerm)) {
				booksMatch.add(unBook);
			}
		}

		return booksMatch;
	}

	
}
