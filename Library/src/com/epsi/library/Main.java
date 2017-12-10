package com.epsi.library;

public class Main {

	public static void main(String[] args) {
		
		//Instance new Library
		Library library = new Library();
		//Add two books in this library 
		library.addBook("9781234567897", "1", "Le loup dans la foret" ,"Didier",2);
		library.addBook( "123456789X", "2","Un ecureuil","Thierry", 1);
		//Add two clients in this library 
		library.addClient("Michel", "1", "reader", "michel@hotmail.com", "55 rue des cacahuètes");
		library.addClient("Pascal", "2", "reader", "pascal@hotmail.com", "2 rue de la forêt");
		//Borrow a book
		try {
			library.borrowBook("1", "Michel");
		}catch (LibraryException e){
			e.printStackTrace();
		}
		//Then return this book
		try {
			library.returnBook("1", "Michel");
		}catch (LibraryException e){
			e.printStackTrace();
		}
		//Borrow a new book
		try{
			library.borrowBook("2", "Pascal");
		}
		catch(LibraryException e){
			e.printStackTrace();
		}
	}
	
}
