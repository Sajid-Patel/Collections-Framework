package com.collection.cursors;

//Book

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Eg3 {

	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(new Book(111, "Java", "Sajid"));
		books.add(new Book(222, "C", "Patel"));
		books.add(new Book(333, "Python", "Rock"));
		books.add(new Book(333, "CPP", "SP"));

		Iterator<Book> itr = books.iterator();

		while (itr.hasNext()) {
			Book b = itr.next();

			if (b.id == 111)
				itr.remove();

			if (b.name.equals("Python"))
				itr.remove();
		}

		// print the remaining data
		for (Book b : books) {
			System.out.println(b.id + " " + b.name + " " + b.author);
		}

	}

}
