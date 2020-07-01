package com.qa.library;

import java.util.ArrayList;
import java.util.List;

import com.qa.garageEx.vehicle;

public class Controller {

	public Controller() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		person person = new person();
//		person.setUsername("arbreezy");
//		person.setPassword("why");
		
		books book = new books();
		book.setTitle("the subtle art of not giving a");
		book.setYear(2015);
		
		journal jour = new journal();
		jour.setAuthor("stephen");
		jour.setTitle("How to not be dumb");
		jour.setYear(2011);
		
		List<books> booksList = new ArrayList<books>();
		
		booksList.add(book);
		

	}

}
