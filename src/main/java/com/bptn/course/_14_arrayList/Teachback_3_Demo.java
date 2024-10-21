package com.bptn.course._14_arrayList;

import java.util.ArrayList;
import java.util.List;

public class Teachback_3_Demo {

	public static void main(String[] args) {
		// Create an ArrayList of Strings
		ArrayList<String> fruits = new ArrayList<>();

		// Add elements to the ArrayList
		fruits.add("Apple");
		fruits.add("Grapes");
		fruits.add("Cherry");
		fruits.add("Mango");

		// Print the ArrayList
		System.out.println("Fruits: " + fruits);

		// Create
		fruits.add(2, "Pineapple");
		System.out.println("Fruits: " + fruits);
		
		// Read
		System.out.println("Read fruit: " + fruits.get(1));

		// Modify
		System.out.println("Replace a fruit: " + fruits.set(3, "Orange"));
		System.out.println("Fruits: " + fruits);
		

		// Delete
		System.out.println("Delete a fruit: " + fruits.remove(0));
		System.out.println("Fruits: " + fruits);
		System.out.println("Delete a fruit: " + fruits.remove("Grapes"));	
		System.out.println("Fruits: " + fruits);
		}
	}

