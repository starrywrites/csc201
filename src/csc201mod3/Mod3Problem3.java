//@author Peyton Starr
//@unit Module 3
//@assignment Programming Problems
//@problem PROBLEM 3 - BOOK

package csc201mod3;

import java.util.Arrays;

public class Mod3Problem3 {

	public static void main(String[] args) {
		// Create an array of Book objects
		Book bookObj1 = new Book("Red Dragon", "Thomas Harris", 348);
		Book bookObj2 = new Book("Silence of the Lambs", "Thomas Harris", 421);
		Book bookObj3 = new Book("Hannibal", "Thomas Harris", 564);
		Book bookObj4 = new Book("Hannibal Rising", "Thomas Harris", 336);
		Book[] bookObjArray = {bookObj1, bookObj2, bookObj3, bookObj4};
		
		// Create volume object
		Volume volObj = new Volume("Hannibal Lecter", 4, bookObjArray);
		
		// Display the properties of volume
		System.out.println(volObj.toString());
	}
}

class Book {
	// Create variables
	String title;
	String author;
	String numberOfPages;

	// Create default constructor
	public Book() {
		this("None", "None", 0);
	}
	
	// Create constructor with parameters
	public Book(String t, String a, int p) {
		title = t;
		author = a;
		numberOfPages = Integer.toString(p);
	}
	
	public String toString() {
		return title + "/" + author + "/" + numberOfPages;
	}
}

class Volume {
	// Create variables
	String volumeName;
	String numberOfBooks;
	Book[] bookArray;	

	// Create default constructor
	public Volume() {
		this("None", 0, null);
	}
	
	// Create constructor with parameters
	public Volume(String v, int n, Book[] b) {
		volumeName = v;
		numberOfBooks = Integer.toString(n);
		bookArray = b;
	}
	
	public String getBookArray(Book x) {
		// Call toString method from Book using object
		return x.toString();
	}
	
	public String toString() {
		return volumeName + ", " + numberOfBooks + ", " + Arrays.toString(bookArray);
	}	
}