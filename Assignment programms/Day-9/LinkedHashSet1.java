//LinkedHashSet implementation

package com.onebill.corejava.Day9Assignment;

import java.util.LinkedHashSet;

//another class
class Book {
	int id;
	String name, author, publisher;
	int quantity;

	public Book(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}
}

public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet();
		set.add("One");
		set.add("Two");
		set.add("Two"); // ignore duplicate
		set.add("Three");
		set.add("Four");
		set.add("Five");
		System.out.println(set);

		LinkedHashSet<Book> hs = new LinkedHashSet<Book>();
		// Creating Books
		Book b1 = new Book(101, "Harry Potter", "J.K.Rowling");
		Book b2 = new Book(102, "Marvel comics", "Stan Lee");
		// Adding Books to hash table
		hs.add(b1);
		hs.add(b2);
		// Traversing hash table
		for (Book b : hs) {
			System.out.println(b.id + " " + b.name + " " + b.author );
		}

	}

}
