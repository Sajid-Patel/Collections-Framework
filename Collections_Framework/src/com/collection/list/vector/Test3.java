package com.collection.list.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
//Product
import java.util.Vector;

/*
 Reading Product Data From Vector Using All Cursors
 
 Problem Statement=
 Take Product class with id,name,cost
 Take Vector and add 3 objects
 Read data using all Cursors 
 */
class Test3 {

	public static void main(String[] args) {
		Vector<Product> products = new Vector<Product>();
		products.add(new Product(111, "Pen", 20));
		products.add(new Product(222, "Fan", 1500));
		products.add(new Product(333, "Chair", 700));

//Print data using Enumeration Cursor
		Enumeration<Product> e = products.elements();
		while (e.hasMoreElements()) {
			Product p = e.nextElement();
			System.out.println("Print data using Enumeration Cursor = " + p.id + " " + p.name + " " + p.cost);
		}

//Print data using Iterator Cursor
		Iterator<Product> itr = products.iterator();
		while (itr.hasNext()) {
			Product p = itr.next();
			System.out.println("Print data using Iterator Cursor = " + p.id + " " + p.name + " " + p.cost);
		}

		// Print data using ListIterator Cursor

		ListIterator<Product> lstr = products.listIterator();
		while (lstr.hasNext()) {
			Product p = lstr.next();
			System.out.println("Print data using ListIterator Cursor = " + p.id + " " + p.name + " " + p.cost);
		}
	}

}
