package com.epsi.library;

public class Book {
	
	//Parameters of a book
	private String id;
	private String author;
	private String title;
	private String ISBN;
	private int quantity;

	/**
	 * Constructeur
	 * 
	 * @param unId
	 * @param unAuthor
	 * @param unTitle
	 * @param unISBN
	 */
	public Book(String unId, String unAuthor, String unTitle, String unISBN, int quantity) {
		this.id = unId;
		this.author = unAuthor;
		this.title = unTitle;
		this.ISBN = unISBN;
		this.quantity = quantity;
	}

	/**
 	* 
 	* @return the id of the book
 	*/
	public String getId() {
		return id;
	}

	/**
	 * Modify the id of the book
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/**
	 * 
	 * @return the author of the book
	 */
	public String getAuthor() {
		return author;
	}
	
	/**
	 * Modify the author of the book
	 * @param author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * 
	 * @return the title of the book
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Modify the title of the book
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 
	 * @return the ISBN of the book
	 */
	public String getISBN() {
		return ISBN;
	}

	/**
	 * Modify the ISBN of the book
	 * @param iSBN
	 */
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	/**
	 * 
	 * @return the quantity of the book
	 */
	public int getQuantity() {
		return quantity;
	}
	
	/**
	 * Modify the quantity of the book
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	
}
