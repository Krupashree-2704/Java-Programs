package com.jsp.crud.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LazyDeveloper {
	@Id
	private int id;
	private String name;
	private String preferredIDE;
	private String favouriteError;
	private boolean isNapping;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPreferredIDE() {
		return preferredIDE;
	}

	public void setPreferredIDE(String preferredIDE) {
		this.preferredIDE = preferredIDE;
	}

	public String getFavouriteError() {
		return favouriteError;
	}

	public void setFavouriteError(String favouriteError) {
		this.favouriteError = favouriteError;
	}

	public boolean isNapping() {
		return isNapping;
	}

	public void setNapping(boolean isNapping) {
		this.isNapping = isNapping;
	}

	public LazyDeveloper() {
		
	}
	

}
