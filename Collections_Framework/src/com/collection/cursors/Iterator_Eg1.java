package com.collection.cursors;

import java.util.ArrayList;
import java.util.Iterator;

class Iterator_Eg1 {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Sajid");
		a1.add("Patel");
		a1.add("Pune");
		a1.add("Engineer");

		// read the data using iterator : normal version
		Iterator itr = a1.iterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			System.out.println(s);
		}

		// read the data using iterator : Generic version
		Iterator<String> itr1 = a1.iterator();
		while (itr1.hasNext())

		{
			String s = itr1.next();
			System.out.println(s);
		}

	}

}
