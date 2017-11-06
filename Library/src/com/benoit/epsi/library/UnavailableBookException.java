package com.benoit.epsi.library;

public class UnavailableBookException extends Exception {
	
	public UnavailableBookException(){
		System.out.println("Tous les livres avec cet identifiant sont emprunté. ");
	}
}
