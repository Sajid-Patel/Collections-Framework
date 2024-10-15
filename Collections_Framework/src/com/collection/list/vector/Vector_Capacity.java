package com.collection.list.vector;

import java.util.ArrayList;
import java.util.Vector;

class Vector_Capacity {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(); // Initial Capacity-10
		System.out.println(v.capacity());

		v.add("Sajid");
		v.add("Patel");
		v.add("Engineer");
		v.add("Pune");
		v.add("Rock SP");
		System.out.println(v);

		System.out.println(v.capacity());

		/*
		 * Vector<String> v = new Vector<String>(2); //user defined Capacity-2
		 * System.out.println(v.capacity());
		 */

		/*
		 * Vector<String> v = new Vector<String>(2,9); //increment Capacity-11
		 * System.out.println(v.capacity());
		 */
		
		//Adding one collection data int another
		ArrayList<String> al=new ArrayList<String>(v);
		al.add("AA");
		al.add("BB");
		al.add("CC");
		System.out.println(al);
		
	}

}
