package com.benoit.epsi.library;

public class Book {
	
	private String id;
	private String author;
	private String title;
	private String ISBN;
	private Status status;
	
	/**
	 * Constructeur
	 * @param unId
	 * @param unAuthor
	 * @param unTitle
	 * @param unISBN
	 */
	public Book (String unId, String unAuthor, String unTitle, String unISBN, Status status){
		this.id=unId;
		this.author=unAuthor;
		this.title=unTitle;
		this.ISBN=unISBN;
		this.status=Status.FREE;
	}

	public Book (String ISBN){
		this.ISBN=ISBN;
		this.status=Status.FREE;
	}
	
	
	//Getter et setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
}
