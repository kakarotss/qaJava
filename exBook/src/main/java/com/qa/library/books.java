package com.qa.library;

public class books implements booksInterface {
	private String title;
	private int year;
	private String checkedOutBy = "N/A";

	public books() {
		// TODO Auto-generated constructor stub
	}
	
	

	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
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
