package com.qa.garageEx;

public class car extends vehicle {
	
	private int doors;
	private int engine;

	
	
	

	
	public car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	





	public car(int doors, int engine) {
		super();

		this.doors = doors;
		this.engine = engine;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}







	@Override
	public String toString() {
		return "car [doors=" + doors + ", engine=" + engine + ", isTurbo=" + isTurbo() + ", getType=" + getType()
				+ ", getMake=" + getMake() + ", getModel=" + getModel() + ", getYear=" + getYear() + "]";
	}
	
	


	
	

}
