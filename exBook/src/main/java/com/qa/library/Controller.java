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
		
		person person = new person();
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
		List<journal> jourList = new ArrayList<journal>();
//		List<books> allList = new ArrayList<books>();
		
		booksList.add(book);
		jourList.add(jour);
		
		int options = 0;
		
		System.out.println("Welcome to the Lib- please sign up");
		person = person.register();
		System.out.println("Welcome "+ person.getUsername());
		
		
		
for (int i = 0; i< booksList.size(); i++) {
	
			System.out.println("------------------");
			System.out.println("Printing all books");
			System.out.println("------------------");
			System.out.println("ID: "+ i +"   "+booksList.get(i));
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
		}

for (int i = 0; i< jourList.size(); i++) {
	
	System.out.println("---------------------");
	System.out.println("Printing all journals");
	System.out.println("---------------------");
	System.out.println("ID: "+ i +"   "+jourList.get(i));
	System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
}

if(person.getUsername() == "admin") {
	
}

else
{
	System.out.println("Please select one of the following options");
	System.out.println("1  Check out a book");
	System.out.println("2  Check out a journal out");
	System.out.println("3  Check in a book");
	System.out.println("4  Check in a journal");
	
}


		

	}

}
