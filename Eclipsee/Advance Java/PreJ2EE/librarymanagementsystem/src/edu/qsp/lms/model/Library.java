package edu.qsp.lms.model;

import java.util.List;
/**
 * Library Class=for creating library
 */
public class Library {
	//attributes
	/**
	 * 
	 * 	Library Name=libraryName
	 */
	private String libraryName;
	/**
	 * Library Address=libraryAddress
	 */
	private String libraryAddress;
	/**
	 * Library Pincode=libraryPincode
	 */
	private int libraryPincode;
	/**
	 * List<Book> named books =for storing list of books
	 */
	private List<Book> books;//Book=>like a datatype(classname)
	//going to store objects in list
	/**
	 * getter for LibraryName:fetches the name of Library
	 */
	public String getLibraryName() {
		return libraryName;
	}
	/**
	 * setter for LibraryName:sets the new name of Library 
	 */
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	/**
	 * getter for LibraryAddress:fetches the address of Library
	 */
	public String getLibraryAddress() {
		return libraryAddress;
	}
	/**
	 * setter for LibraryAddress:sets the new address of Library 
	 */
	public void setLibraryAddress(String libraryAddress) {
		this.libraryAddress = libraryAddress;
	}
	/**
	 * getter for LibraryPincode:fetches the pincode of Library
	 */
	public int getLibraryPincode() {
		return libraryPincode;
	}
	/**
	 * setter for LibraryName:sets the new name of Library 
	 */
	public void setLibraryPincode(int libraryPincode) {
		this.libraryPincode = libraryPincode;
	}
	/**
	 * getter for List<Book> getBooks:fetches the List of books into Library
	 */
	public List<Book> getBooks() {
		return books;
	}
	/**
	 * setter for LibraryName:sets the new list of books in Library 
	 */
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	@Override
	/**
	 * Overriding toString() of Library Class to get all the attributes of Library
	 */
	public String toString() {
		return "Library [libraryName=" + libraryName + ", libraryAddress=" + libraryAddress + ", libraryPincode="
				+ libraryPincode + ", books=" + books + "]";
	}
	

}
