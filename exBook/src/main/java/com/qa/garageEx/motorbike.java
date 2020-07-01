package com.qa.garageEx;

public class motorbike extends vehicle {
	
	private String type;
	private int passengers;
	private int engine;


	
	
	

	public motorbike(String type, int passengers, int engine) {
		super();
		this.type = type;
		this.passengers = passengers;
		this.engine = engine;
		
	}




	public motorbike() {
		super();
		// TODO Auto-generated constructor stub
	}




	public String getType() {
		return type;
	}




	public void setType(String type) {
		this.type = type;
	}




	public int getPassengers() {
		return passengers;
	}




	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}




	public int getEngine() {
		return engine;
	}




	public void setEngine(int engine) {
		this.engine = engine;
	}




	@Override
	public String toString() {
		return "motorbike [type=" + type + ", passengers=" + passengers + ", engine=" + engine + ", isTurbo="
				+ isTurbo() + ", getMake=" + getMake() + ", getModel=" + getModel() + ", getYear=" + getYear()
				+ "]";
	}
	
	




	



	

}
