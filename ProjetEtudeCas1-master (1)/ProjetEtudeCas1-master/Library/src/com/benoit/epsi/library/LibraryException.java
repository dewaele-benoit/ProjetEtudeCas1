package com.benoit.epsi.library;

public class LibraryException  extends Exception{
	public LibraryException (){
		System.out.println("Impossible d'emprunter ou de retourner le livre");
	}
}
