package com.qa.garageEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class controller {
	
	public static car addCar() {
		car car = new car();
		System.out.println("Enter Make");
		Scanner in1 = new Scanner(System.in);
		car.setMake(in1.nextLine());
		System.out.println("Enter Model");
		car.setModel(in1.nextLine());
		System.out.println("Enter Engine Size i.e. 2000");
		car.setEngine(in1.nextInt());
		System.out.println("Enter Number of Doors");
		car.setDoors(in1.nextInt());
		System.out.println("Enter Year");
		car.setYear(in1.nextInt());
		car.setType("car");
		System.out.println("Turbo? enter 1 for yes and enter 2 for no");
		int turboCheck = in1.nextInt();
		if (turboCheck ==1) {
		car.setTurbo(true);
		}else {
			car.setTurbo(false);
			
		}
		
		return car;
	}
	
	
	public static motorbike addMot() {
		motorbike mot = new motorbike();
		System.out.println("Enter Make");
		Scanner in1 = new Scanner(System.in);
		mot.setMake(in1.nextLine());
		System.out.println("Enter Model");
		mot.setModel(in1.nextLine());
		System.out.println("Enter Engine Size i.e. 2000");
		mot.setEngine(in1.nextInt());
		System.out.println("Enter Number of Passengers");
		mot.setPassengers(in1.nextInt());
		System.out.println("Enter Year");
		mot.setYear(in1.nextInt());
		mot.setType("bike");
		System.out.println("Turbo? enter 1 for yes and enter 2 for no");
		int turboCheck = in1.nextInt();
		if (turboCheck ==1) {
		mot.setTurbo(true);
		}else {
			mot.setTurbo(false);
			
		}
		
		return mot;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		motorbike mot = new motorbike();
		car car = new car();
//		vehicle veh = new vehicle();
		
		
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
		
for (int i = 0; i< vehicleList.size(); i++) {
			
			System.out.println("ID: "+ i +"   "+vehicleList.get(i) + "Price: " +vehicleList.get(i).priceCalc(vehicleList.get(i).getType(), vehicleList.get(i).getYear(), vehicleList.get(i).isTurbo()));
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
		}

int exit = 0;

for(int h = 0; h<10; h++) {
	

		
		System.out.println("Please select one of the following options");
		System.out.println("1 - Add car");
		System.out.println("2 - Add bike");
		System.out.println("3 - Delete vehicle");
		System.out.println("4 - Exit");
		
		int option = 0;
		Scanner in = new Scanner(System.in);
		option = in.nextInt();
		
		switch (option){
			case 1:
				car = addCar();
				vehicleList.add(car);
				break;
				
			case 2:
				mot = addMot();
				vehicleList.add(mot);
				break;
				
			case 3:
				System.out.println("Enter the vehicle ID you want to delete");
				int delId = in.nextInt();
				vehicleList.remove(delId);
				break;
				
			case 4:
				exit = 1;
				break;
				
		
				
		}
		
		
		
		

		
		for (int i = 0; i< vehicleList.size(); i++) {
			
			System.out.println("ID: "+ i +"   "+vehicleList.get(i) + "Price: " +vehicleList.get(i).priceCalc(vehicleList.get(i).getType(), vehicleList.get(i).getYear(), vehicleList.get(i).isTurbo()));
			System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
		}
		
		if (exit ==1) {
			
			System.out.println("Shutting down");
			break;
		}
		
}
		
		
		

}
}