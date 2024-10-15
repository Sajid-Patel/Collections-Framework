package com.collection.sorting.comparable;
//Comparable with Default sorting order [String and Wrapper Class]
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

class Test1 {

	public static void main(String[] args) {

		// Case1]
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sajid");
		al.add("Patel");
		al.add("AA");
		al.add("Z");
		al.add("Engineer");
		al.add("Pune");
		System.out.println("Before Sorting:" + al);

		Collections.sort(al);
		System.out.println("After Sorting:" + al);

		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(10);
		l.add(3);
		l.add(1);
		l.add(0);
		l.add(7);
		System.out.println("Before Sorting:" + l);

		Collections.sort(l);
		System.out.println("After Sorting:" + l);

		// Case2] java.lang.ClassCastException
		ArrayList a2 = new ArrayList();
		a2.add(10);
		a2.add("Sajid");
		Collections.sort(a2);

		// Case3]java.lang.NullPointerException
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(null);
		Collections.sort(v);
	}

}
