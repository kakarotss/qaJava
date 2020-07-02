package personEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class person {
	
	private String name;
	private int age;
	private String job;
	
	
	public person(String name, int age, String job) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
	public person() {
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + ", job=" + job + "]";
	}
	
	
	public person addPerson() {
		person person = new person();
		
//		System.out.println("Enter 1 to add a person or enter 2 to exit");
		Scanner in = new Scanner(System.in);
		Scanner in1 = new Scanner(System.in);
		
		
			System.out.println("Enter the name of the person:");
			person.setName(in.nextLine());
			System.out.println("Enter the age of the person:");
			person.setAge(in.nextInt());
			System.out.println("Enter the job of the person:");
			person.setJob(in1.nextLine());
//			person.setJob(in.nextLine());
//			in.close();
//			in1.close();
			
			
	
		
		
		
		return person;
		
		
	}
	
	public void printPerson() {
		
		person man1 = new person();
		person man2 = new person();
		person man3 = new person();
		
		man1.setAge(22);
		man1.setJob("software engineer");
		man1.setName("arbab");
		
		man2.setAge(21);
		man2.setJob("senior developer");
		man2.setName("abdullah");
		
		man3.setAge(21);
		man3.setJob("senior software engineer");
		man3.setName("zain");
		

		List<Object> listPerson = new ArrayList<Object>();
		listPerson.add(man1);
		listPerson.add(man2);
		listPerson.add(man3);

		listPerson.forEach(p -> System.out.println(p)); 
		
//		System.out.println("Enter 1 to add a person or enter 2 to exit");
		Scanner in = new Scanner(System.in);
		
		
		int options = 0;
		
		do {
			System.out.println();
			System.out.println("-------------------------------------------");
			System.out.println("Enter 1 to add a person or enter 2 to exit");
			System.out.println("-------------------------------------------");
			 options = in.nextInt();
		switch (options) {
		case 1:
			listPerson.add(addPerson());
			listPerson.forEach(p -> System.out.println(p)); 
			
			break;
		case 2:
			
			System.out.println("Shutting down...");
			break;
		}
		
		}while (options ==1);
		
	}
	

}
