package com.qa.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class controller {

	public controller() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList(new String[]{"Michael", "Dean", "James", "Chris"});
		
		System.out.println("List of all names: "+ names);
		System.out.println();
		List<String> results = names.stream()
				.filter(s -> s !="James").collect(Collectors.toList());
		
		
		System.out.println("List of all names apart from James: "+ results);
		System.out.println();
		
		List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12);
		System.out.println("List of all numbers: " +numbers);
		System.out.println();
		
		
		int max = numbers.stream().mapToInt(v -> v).max().orElseThrow(NoSuchElementException::new);
		System.out.println("Largest number: "+max);
		System.out.println();
		

		int min = numbers.stream().mapToInt(v -> v).min().orElseThrow(NoSuchElementException::new);
		System.out.println("Smallest number: "+min);
		System.out.println();
		
		List<Integer> even = numbers.stream().map(v -> v).filter(v -> v %2 ==0).collect(Collectors.toList());
		List<Integer> odd = numbers.stream().map(v -> v).filter(v -> v %2 ==1).collect(Collectors.toList());
		System.out.println("List of even numbers from the list: "+even);
		System.out.println();
		System.out.println("List of odd numbers from the list: "+odd);
		System.out.println();
		
		int sum = numbers.stream().mapToInt(v -> v).sum();
		System.out.println("Sum of all numbers in the list: "+sum);
		System.out.println();
		
		List<Integer> squared = numbers.stream().map(v -> v*v).collect(Collectors.toList());
		System.out.println("List of squared numbers: "+squared);
		
		
		
		

	}

}
