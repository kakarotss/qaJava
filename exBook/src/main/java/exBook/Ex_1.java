package exBook;

import java.util.Scanner;

public class Ex_1 {
	
	public static String thatsMyName(String name) {
		String yourName = name;
		return yourName;
	}
	
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Whats your name?");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		in.close();
		System.out.println(thatsMyName("You are "+name));
		
		
		
	}

}
