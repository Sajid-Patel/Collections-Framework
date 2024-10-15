package com.collection.list.arraylist;

import java.util.ArrayList;

class Sublist {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sajid");
		al.add("Patel");
		al.add("Pune");
		al.add("Mumbai");
		al.add("Engineer");
		al.add("College");
		al.add("Event");
		al.add("Style");
		al.add("Java");
		System.out.println(al.subList(1, 6));
		/*
		 * This method is used to create Sub List of existing List al.subList(1, 6) here
		 * index numbers are used to create Sublist the 1st Index is included and last
		 * index is excluded
		 */
	}

}
