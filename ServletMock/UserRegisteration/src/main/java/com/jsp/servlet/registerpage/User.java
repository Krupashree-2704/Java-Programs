package com.jsp.servlet.registerpage;

import java.util.List;



public class User {
	private String username;
    private String password;
    private String fullName;
    private String email;
//Made list of user
    private static List<User>user;
    public static List<User> getUser() {
		return user;
	}
	public static void setUser(List<User> user) {
		User.user = user;
	}
	public User(String username, String password, String fullName, String email) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
      
    }
    public User()
    {
    	
    }


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
//    make here list of user 
}

