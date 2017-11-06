package com.benoit.epsi.library;

public class AllBooksAlreadyReturnedException extends Exception {
	
	public AllBooksAlreadyReturnedException(){
		System.out.println("Tous les livres avec cet identifiant on été retourné. ");
	}
	
}
