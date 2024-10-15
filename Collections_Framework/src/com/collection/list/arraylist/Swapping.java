package com.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

class Swapping {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sajid");
		al.add("Patel");
		al.add("Pune");
		al.add("Mumbai");
		al.add("Engineer");

		System.out.println("Befor Swaping: " + al);

		Collections.swap(al, 1, 4); // used to swap data using Index number
		
		System.out.println("After Swaping: " + al);
	}

}
