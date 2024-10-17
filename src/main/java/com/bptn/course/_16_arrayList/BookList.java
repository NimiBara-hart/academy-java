package com.bptn.course._16_arrayList;

import java.util.ArrayList;

public class BookList {

	public static void main(String[] args) {
		//Create a new ArrayList called "myBooks"
		int counter = 1;
		ArrayList<String> myBooks = new ArrayList<>();
		
		//Add 3 books to the list
		myBooks.add("Book1");
		myBooks.add("Book2");
		myBooks.add("Book3");
		
		//Display all books
		System.out.println("My favorite books are: " + myBooks);
		for(String book : myBooks) {
			System.out.println("Book " + counter + ": " + book);
			counter++;
		}
		
		//Search for a book
		if (myBooks.contains("book1".toLowerCase())) {
			System.out.println("Book found");
		} else {
			System.out.println("Book not found");			
		}
	}

}
