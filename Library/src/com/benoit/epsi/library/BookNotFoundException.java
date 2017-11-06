package com.benoit.epsi.library;

import java.util.ArrayList;

public class BookNotFoundException extends Exception{
	public BookNotFoundException(){
		System.out.println("Aucun livre ne correspond à cet identifiant. ");
	}
}
