package com.collection.cursors;

import java.util.ArrayList;
import java.util.ListIterator;

class ListIterator_Eg1 {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Sajid");
		a1.add("Patel");
		a1.add("Pune");
		a1.add("Engineer");

		
		
		// ListIterator cursor : with normal version : print the data forward & backword
		// direction
		ListIterator lstr1 = a1.listIterator();
		while (lstr1.hasNext()) {
			String s = (String) lstr1.next();
			System.out.println(s);
		}

		System.out.println("-----------------");
	
		while (lstr1.hasPrevious()) {
			String s = (String) lstr1.previous();
			System.out.println(s);
		}

		System.out.println("-----------------");
		
		// ListIterator cursor : with generic version : print the data forward &
		// backword direction
		ListIterator<String> lstr2 = a1.listIterator();
		while (lstr2.hasNext()) {
			String s = lstr2.next();
			System.out.println(s);
		}

		System.out.println("-----------------");
		
		while (lstr2.hasPrevious()) {
			String s = lstr2.previous();
			System.out.println(s);
		}

	}

}
