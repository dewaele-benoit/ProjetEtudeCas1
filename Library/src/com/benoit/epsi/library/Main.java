package com.benoit.epsi.library;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws LibraryException {

		// System.out.println(ValidateISBN.validateIsbn13("9781234567897"));

		// System.out.println(ValidateISBN.validateIsbn10("123456789X"));
		
		System.out.println("1. Get all books.");
		System.out.println("2. Search book.");
		System.out.println("3. Borrow a book.");
		System.out.println("4. Return a book");
		System.out.println("5. Add book.");
		System.out.println("6. Get book by id");
		
		Library l = new Library();
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre :");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			l.getBooks();
			break;
		case 2:
			System.out.println("Veuillez saisir un mot de recherche :");
			String term = sc.nextLine();
			l.searchBooks(term);
			break;
		case 3:
			System.out.println("Veuillez saisir l'identifiant du livre à emprunter :");
			String idBorrow = sc.nextLine();
			System.out.println("Veuillez saisir votre nom d'utilisateur :");
			String usernameBorrow = sc.nextLine();
			l.borrowBook(idBorrow, usernameBorrow);
			break;
		case 4:
			System.out.println("Veuillez saisir l'identifiant du livre à retourner :");
			String idReturn = sc.nextLine();
			System.out.println("Veuillez saisir votre nom d'utilisateur :");
			String usernameReturn = sc.nextLine();
			l.returnBook(idReturn, usernameReturn);
			break;
		case 5: 
			System.out.println("Veuillez saisir l'ISBN du livre à ajouter :");
			String isbnAdd = sc.nextLine();
			l.addBook(isbnAdd);
			break;
		case 6:
			System.out.println("Veuillez saisir l'identifiant du livre que vous voulez voir :");
			String idGetBook = sc.nextLine();
			l.getBook(idGetBook);
			break;
		}

	}

}
