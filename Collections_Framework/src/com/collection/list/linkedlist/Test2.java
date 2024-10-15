package com.collection.list.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

//Book
/*
 Problem Statement=
 Take a class Book with paramaters =  id, name, author
 Create a LinkedList<Book> and insert 3 Book objects 
          1> remove C language   listIterator() cursor 
          2> print remaining data using for each() loop                                  
 */
class Test2 {

	public static void main(String[] args) {
		LinkedList<Book> books = new LinkedList<Book>();
		books.add(new Book(111, "Java", " Sajid"));
		books.add(new Book(222, "C", " Rock SP"));
		books.add(new Book(333, "CPP", "Patel"));

//By using ListIterator remove : "C"
		ListIterator<Book> lstr = books.listIterator();
		while (lstr.hasNext()) // to check objects are available or not use hasNext()
		{
			Book b = lstr.next(); // to read the objects
			if (b.name.equals("C")) {
				lstr.remove();
			}
		}
		// Print data usinf For-each loop
		for (Book b : books) {
			System.out.println(b.id + " " + b.name + " " + b.Author);
		}
	}

}
