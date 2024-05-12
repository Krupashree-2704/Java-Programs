package edu.qsp.lms.control;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.qsp.lms.model.Book;

import edu.qsp.lms.model.Library;
//controller=>dont ask any i/p
public class LibraryController {
	private Library library = new Library();//shortcut for creating object of class new then Ctrl+spacebar
    //due to private keyword=>we are using this reference in only this class
	//to create method=>public then ctrl+spacebar =>select public method=>non-static method=>saves processing power
	public void addBook(Book book) {
		//getbook gives list of books 
		//after library.getBooks()press cltr+1=>assign stmt to new local var
		List<Book> books = library.getBooks();
		//if shtcut=>if+cltrl+space
		if (books==null) {
			//arraylist=>new AL then ctrl+space 
			books=new ArrayList<>();
			library.setBooks(books);
			
		}
		books.add(book);
	}
	
	
	public Book searchBook(String bookName)
	{
		List<Book> books = library.getBooks();
		//iterator=>iterating all the books
		Iterator<Book> iterator = books.iterator();
		//iteraring over the list=>ctrl+space -iterate with iterator
		while (iterator.hasNext()) {
			Book book = iterator.next();
			//after getting book we have to compare with its book name
			//name=>ignore its case so use equalIgnoreCase and we are providing bookname in arg to comapre it
			if (book.getBookName().equalsIgnoreCase(bookName)) {
				return book;
			}
			
		}
		return null;
	}
	//removing book from list by bookname
	//for deleting/reoving=>boolean datatype
	public boolean removeBookByBookName(String bookName)
	{
		Book book=searchBook(bookName);
		//book is found =>book is not nullor not
		
		if (book!=null) {
			List<Book> books = library.getBooks();
			books.remove(book);//passing book=>we aregetting book by searchBook method
			return true;
		}
		return false;
		
	}
	//we are asking bookname in view
	//we are making object of Book
	/*we are asking bookname in view
	 * then we will make object
	 * then we will pass it in this boolean updateBookPriceByBookName(Book refBook)
	 */
	public boolean updateBookPriceByBookName(Book refBook)
	{
		Book book=searchBook(refBook.getBookName());
		if (book!=null) {
			book.setPrice(refBook.getPrice());
			return true;
			
		}
		return false;
	}
	public List<Book> getAllBooks() {
		return library.getBooks();
	}
}
