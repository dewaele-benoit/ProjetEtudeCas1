package com.benoit.epsi.library;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws LibraryException {

		//System.out.println(ValidateISBN.validateIsbn13("9781234567897"));

		//System.out.println(ValidateISBN.validateIsbn10("123456789X"));
		
		Library lib = new Library();

		/**
		 * String ISBN, String id, String title, String author, int quantity
		 */
		
		lib.addBook("9781234567897", "1", "Le loup dans la foret" ,"Didier",2);
		lib.addBook( "123456789X", "2","Un ecureuil","Thierry", 1);
		
		lib.addClient("Michel", "1", "reader", "michel@hotmail.com", "55 rue des cacahuètes");
		lib.addClient("Pascal", "2", "reader", "pascal@hotmail.com", "2 rue de la forêt");
		
		lib.borrowBook("1", "Michel");
		
		lib.returnBook("1", "Michel");
		
		lib.borrowBook("2", "Pascal");
	}
	
}
