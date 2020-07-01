package com.qa.garageEx;

import java.util.ArrayList;
import java.util.List;

public class controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		motorbike mot = new motorbike();
		car car = new car();
		vehicle veh = new vehicle();
		

		
//		vehicle car = new car();
		car.setMake("Ford");
		car.setModel("Mondeo");
		car.setEngine(2000);
		car.setDoors(5);
		car.setYear(2015);
		car.setType("car");
		car.setTurbo(true);
		
		
		
		mot.setMake("Kawasaki");
		mot.setModel("Ninja");
		mot.setEngine(2000);
		mot.setPassengers(5);
		mot.setYear(2000);
		mot.setType("bike");
		mot.setTurbo(true);
		
		
		
	
		
		
		
		
		
		List<vehicle> vehicleList = new ArrayList<vehicle>();
		
		vehicleList.add(car);
		vehicleList.add(mot);
//		vehicleList.add(mot);
//		vehicleList.add(mot1);
		
		
//		vehicleList.forEach(v -> System.out.println(v.toString() +" price "+ v.priceCalc("car", 5, false))); 
		
//		System.out.println(vehicleList[1]);
		
		for (int i = 0; i< vehicleList.size(); i++) {
			
			System.out.println("ID: "+ i +"   "+vehicleList.get(i) + "Price: " +vehicleList.get(i).priceCalc(vehicleList.get(i).getType(), vehicleList.get(i).getYear(), vehicleList.get(i).isTurbo()));
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
		}
		
		
		
		

}
}