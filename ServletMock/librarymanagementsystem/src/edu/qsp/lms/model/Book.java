package edu.qsp.lms.model;
/**
 * Book Class = for creating different books into library
 * @publisher: Model
 * @author:MyDoc
 */
public class Book {
	//attributes for books
	/**
	 * @params: bookName,bookAuthor,price,publication
	 */
	/**
	 * Book Name=bookName
	 */
	private String bookName;
	/**
	 * Book Author=bookAuthor
	 */
	private String bookAuthor;
	/**
	 * Book Price=price
	 */
	private double price;
	/**
	 * Book Publication=publication
	 */
	private String publication;
	
	//getters and setter
	/**
	 * getter for BookName:fetches the Name of Book
	 */
	public String getBookName() {
		return bookName;
	}
	/**
	 * setter for BookName:sets the new Name of Book
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	/**
	 * getter for BookAuthor:fetches the Author of Book
	 */
	public String getBookAuthor() {
		return bookAuthor;
	}
	/**
	 * setter for BookAuthor:sets the new Author of Book
	 */
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	/**
	 * getter for Price:fetches the Price of Book
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * setter for Price:sets the new Price of Book
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * getter for Publication:fetches the Publisher of Book
	 */
	public String getPublication() {
		return publication;
	}
	/**
	 * setter for Publication:sets the new Publisher of Book
	 */
	public void setPublication(String publication) {
		this.publication = publication;
	}
	/**
	 * Overrides toString() of Book Class
	 */
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", price=" + price + ", publication="
				+ publication + "]";
	}
	

}
