package exBook;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Ex_1 {
	public static final Logger LOGGER = Logger.getLogger(Ex_1.class);

	// EX 1
//	public static String thatsMyName(String name) {
//		String yourName = name;
//		return yourName;
//	}
//	
//	
//
//	public static void main(String[] args) {
//		
//		// TODO Auto-generated method stub
//		System.out.println("Whats your name?");
//		Scanner in = new Scanner(System.in);
//		String name = in.nextLine();
//		in.close();
//		System.out.println(thatsMyName("You are "+name));
//	}

	public static int addition(int number, int number2) {
		return number + number2;

	}

	public static int subtraction(int number, int number2) {
		return number - number2;

	}

	public static int division(int number, int number2) throws InvalidDivisionExcepion {
		if (number < number2) {
			throw new InvalidDivisionExcepion("Division failed- " + number + " is smaller than " + number2);
		}
		return number / number2;

	}

	public static int multiplication(int number, int number2) {
		return number * number2;

	}

	public static void logMessage(String message) {
		LOGGER.info(message);
	}

	public static void main(String[] args) throws InvalidDivisionExcepion {

		LOGGER.info("dsgsd");

//		logMessage("I dont exactly know how youre working");

		// EX 2 modded
		System.out.println("--------------------------");
		System.out.println("CALCULATOR");
		System.out.println("--------------------------");

		System.out.println("Enter an option (1-4)");
		System.out.println("1- Addition");
		System.out.println("2 - Subtraction");
		System.out.println("3 - Division");
		System.out.println("4 - Multiplication");

		int options;
		Scanner in = new Scanner(System.in);
		try {
			options = in.nextInt();

			int num1;
			int num2;

			switch (options) {
			case 1:
				System.out.println("Addition- enter the first number ");
				num1 = in.nextInt();
				System.out.println("Addition- enter the second number ");
				num2 = in.nextInt();
				in.close();

				System.out.println("Your answer is: " + addition(num1, num2));
				break;

			case 2:
				System.out.println("Subtraction- enter the first number ");
				num1 = in.nextInt();
				System.out.println("Subtraction- enter the second number ");
				num2 = in.nextInt();

				System.out.println("Your answer is: " + subtraction(num1, num2));
				in.close();
				break;

			case 3:
				System.out.println("Division- enter the first number ");
				num1 = in.nextInt();
				System.out.println("Division- enter the second number ");
				num2 = in.nextInt();
				in.close();

				try {
					System.out.println("Your answer is: " + division(num1, num2));
				} catch (InvalidDivisionExcepion d) {
					System.out
							.println("Entered numbers cannot be divided because " + num1 + " is smaller than " + num2);
				}
				in.close();

				break;

			case 4:
				System.out.println("Multiplication- enter the first number ");
				num1 = in.nextInt();
				System.out.println("Multiplication- enter the second number ");
				num2 = in.nextInt();

				System.out.println("Your answer is: " + multiplication(num1, num2));
				in.close();
				break;

			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid inputs, shutting down application");
		}

	}

//	public static void main(String[] args) {
//		String[] unit = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
//		
//		String[] tens = {"twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
//		
//		int t = 0;
//		int u = 0;
//		System.out.println();
//		System.out.println(100%3);
//		System.out.println();
//		
//		for(int i =0; i < 28; i++) {
//			if (i < 19) {
//			System.out.println(unit[i]);
//			} else if (i > 19 && i < 100) {
//				System.out.println(tens[t]);
//				for (int j = 0; j< 9; j++)
//				{
//					System.out.println(tens[t]+ " " + unit[u]);
//					u++;					
//				}
//				
//				u=0;
//				
//				t++;
//				if (t == 8) {
//					t=0;
//				}
//				
//			}
//		}
//	}
//
}
