package com.jsp.crud.driver;

import com.jsp.crud.model.LazyDeveloper;
import com.jsp.crud.utility.Utility;

//C Insert persist
public class Insert {

	public static void main(String[] args) {
		LazyDeveloper lazyDeveloper = new LazyDeveloper();
		lazyDeveloper.setId(1);
		lazyDeveloper.setName("Rahul");
		lazyDeveloper.setPreferredIDE("Notepad");
		lazyDeveloper.setFavouriteError("Fatal Error");
		lazyDeveloper.setNapping(true);
		
		Utility.entityTransaction.begin();
		Utility.entityManager.persist(lazyDeveloper);
		Utility.entityTransaction.commit();
		
		System.out.println("Insert Operation Successfully");
		
		

	}

}

