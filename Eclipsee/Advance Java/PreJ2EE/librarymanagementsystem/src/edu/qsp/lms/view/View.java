package edu.qsp.lms.view;

import java.util.*;

import edu.qsp.lms.control.LibraryController;
import edu.qsp.lms.model.Book;
import edu.qsp.lms.model.Library;

public class View {
	/**
	 * myinput=object of a Scanner Class which helps to take input to scanner class
	 *  
	 */
	static Scanner myinput = new Scanner(System.in);
	/**
	 * controller = object of a LibraryController Class which is accessible globally
	 */
	static LibraryController controller = new LibraryController();// only one copy accessible universly
	/**
	 * library=object of a Library Class which is accessible globally
	 */
	static Library library = new Library();
	// startup instructions;write in static block:why to load all the information
	// one time only at startup
	/**
	 * In static block=executes only once at the time when program starts
	 * It ask the user to enter name of library,address of library,pincode of library
	 * @params:
	 * libraryName,libraryAddress,libraryPincode
	 */
	static {
		
		System.out.println("---------------------Welcome to Library Management system------------------------");
		System.out.println("Enter name of Library:");
		String libraryName = myinput.nextLine();
		library.setLibraryName(libraryName);
		System.out.println("Enter address of Library:");
		String libraryAddress = myinput.nextLine();
		library.setLibraryAddress(libraryAddress);
		System.out.println("Enter pincode of Library:");
		int libraryPincode = myinput.nextInt();
		myinput.nextLine();// ----------------------------------------------------------scanner
							// problem:buffer main kuch space store karta hai
		library.setLibraryPincode(libraryPincode);
	}

	public static void main(String[] args) {
		/**
		 * do..while loop:It executes the main menu repeatedly untill user exits the execution of program
		 */
		do {
			System.out.println("Select Operation to Perform");
			System.out.println(
					"1.Add Book\n2.Remove Book\n3.Update Book\n4.Get Book by Book name\n5.Get All Books\n0.Exit");
			
			System.out.println("Enter Digit Respective to Desired Option");
			/**
			 * userchoice= it is used to take input from user to perform the mentioned task
			 */
			int userchoice = myinput.nextInt();
			// after hiting enter :int type:consumes line:to overcome:use scannerobj.nextLine()
			myinput.nextLine();
			//to format:switch cases--Cltr+shift+F
			switch (userchoice) {
			case 0:
				//exiting:close scanner
				myinput.close();
				System.out.println("------EXITED-------");
				System.exit(0);//to exit from program:System.exit(status:0)
				break;
			case 1:
				Book book = new Book();
				//here we have to create one var and then pass var into setters of Book 
				//to overcome in setter only 
				System.out.println("Enter Book Name:");
				book.setBookName(myinput.nextLine());
				System.out.println("Enter Author Name:");
				book.setBookAuthor(myinput.nextLine());
				System.out.println("Enter Price of Book:");
				book.setPrice(myinput.nextDouble());
				myinput.nextLine();
				System.out.println("Enter Publication:");
				book.setPublication(myinput.nextLine());
				//
				controller.addBook(book);
				break;

			case 2:
				System.out.println("Enter Name of Book to be Reomved: ");
				String bookToBeRemoved=myinput.nextLine();
				boolean verify=controller.removeBookByBookName(bookToBeRemoved);
				//
				if (verify) {
					System.out.println("Book removed from library");
				} else {
					System.out.println("Book does not Exists in Library");

				}
				//	
				break;
				//to change varname all over:ribbon>refactor>rename
			case 3:
				Book book3 = new Book();
				System.out.println("Enter name of book to update");
			    String bookToUpdate=myinput.nextLine();
			    book3.setBookName(bookToUpdate);
			    System.out.println("Enter Price to Update");
			    double newPrice=myinput.nextDouble();
			    book3.setPrice(newPrice);
			    //
			    boolean verifyUpdate=controller.updateBookPriceByBookName(book3);
			    if (verifyUpdate) {
					System.out.println("Price Updated");
				} else {
					System.out.println("Mentioned Book Does not Exist in Library");
				}
				break;

			case 4:
				System.out.println("Enter Name of Book to be Searched:");
				String bookToGet=myinput.nextLine();
				Book book4=controller.searchBook(bookToGet);
				if (book4!=null) {
					System.out.println(book4);
				}
				else
				{
					System.out.println("Book Not Found");
				}

				break;
			case 5:
				System.out.println(controller.getAllBooks());
				break;

			default:
				System.out.println("--------------------Invalid Selection-----------------");
				break;
			}
		} while (true);
	}//get library details
}
