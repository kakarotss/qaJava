package com.qa.library;

public class journal implements booksInterface{
	
	private String title;
	private int Year;
	private String Author;
	private String checkedOutBy = "N/A";

	public journal() {
		// TODO Auto-generated constructor stub
	}
	
	

	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public int getYear() {
		return Year;
	}



	public void setYear(int year) {
		Year = year;
	}



	public String getAuthor() {
		return Author;
	}



	public void setAuthor(String author) {
		Author = author;
	}



	public String getCheckedOutBy() {
		return checkedOutBy;
	}



	public void setCheckedOutBy(String checkedOutBy) {
		this.checkedOutBy = checkedOutBy;
	}



	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		
	}
	
	

}
