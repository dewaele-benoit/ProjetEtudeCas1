package com.benoit.epsi.library;

public class Main {

	public static void main(String[] args) {
		
		//Instance new Library
		Library lib = new Library();
		//Add two books in this library 
		lib.addBook("9781234567897", "1", "Le loup dans la foret" ,"Didier",2);
		lib.addBook( "123456789X", "2","Un ecureuil","Thierry", 1);
		//Add two clients in this library 
		lib.addClient("Michel", "1", "reader", "michel@hotmail.com", "55 rue des cacahuètes");
		lib.addClient("Pascal", "2", "reader", "pascal@hotmail.com", "2 rue de la forêt");
		//Borrow a book
		try {
			lib.borrowBook("1", "Michel");
		}catch (LibraryException e){
			e.printStackTrace();
		}
		//Then return this book
		try {
			lib.borrowBook("1", "Michel");
		}catch (LibraryException e){
			e.printStackTrace();
		}
		//Borrow a new book
		try {
			lib.returnBook("1", "Michel");
		}catch (LibraryException e){
			e.printStackTrace();
		}
		
		try{
			lib.borrowBook("2", "Pascal");
		}
		catch(LibraryException e){
			e.printStackTrace();
		}
	}
	
}
