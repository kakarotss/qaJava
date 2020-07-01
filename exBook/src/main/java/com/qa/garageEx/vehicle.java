package com.qa.garageEx;

public class vehicle {
	
	private String type;
	private String make;
	private String model;
	private int year;
	private boolean turbo;
	
	




	

public boolean isTurbo() {
		return turbo;
	}




	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}




public String getType() {
		return type;
	}




	public void setType(String type) {
		this.type = type;
	}




	public String getMake() {
		return make;
	}




	public void setMake(String make) {
		this.make = make;
	}




	public String getModel() {
		return model;
	}




	public void setModel(String model) {
		this.model = model;
	}




	public int getYear() {
		return year;
	}




	public void setYear(int year) {
		this.year = year;
	}




public vehicle() {
	
}




	
	
@Override
public String toString() {
	return "vehicle [type=" + type + ", make=" + make + ", model=" + model + ", year=" + year + ", turbo=" + turbo
			+ "]";
}




public vehicle(String type, String make, String model, int year, boolean turbo) {
//		super();
		this.type = type;
		this.make = make;
		this.model = model;
		this.year = year;
		this.turbo = turbo;
	}












public int priceCalc(String type, int doors, boolean turb) {
	
	 int pri = 0;
	
	if(type == "car") {
		pri= pri+800;
		
		if (doors>2008) {
			pri= pri+400;
		}
	
		else {
			pri= pri+150;
		}
		if(turb) {
			pri = pri+500;
		}
		
		
	}else {
		pri= pri+400;
		if (doors>2008) {
			pri= pri+200;
		}
		
		if(turb) {
			pri=pri+600;
		}
	}
	
	
	return pri;
		
	}
	
	

}


