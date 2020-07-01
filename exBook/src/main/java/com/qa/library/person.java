package com.qa.library;

public class person extends per {
	
	private String username;
	private String password;
	

	public person() {
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



	@Override
	public person register(String Username, String Password) {
		person person = new person();
		person.setUsername(Username);
		person.setPassword(Password);
		return person;
		// TODO Auto-generated method stub
		
	}

	

}
