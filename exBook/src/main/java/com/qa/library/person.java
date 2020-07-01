package com.qa.library;

import java.util.Scanner;

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
	public person register() {
		person person = new person();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter username: ");
		person.setUsername(in.nextLine());
		System.out.println("Enter password: ");
		person.setPassword(in.nextLine());
		return person;
		// TODO Auto-generated method stub
		
	}

	

}
