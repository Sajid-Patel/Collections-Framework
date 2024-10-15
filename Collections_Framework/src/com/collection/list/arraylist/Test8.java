package com.collection.list.arraylist;

/*
 Case1]com.collection.set.linkedhashset;--->Test2
 
 Case2]com.collection.set.hashset;---->Test 2
 
 Case3] Eliminating duplicate
 ArrayList allows duplicate and HashSet don't allows Duplicate
 so pass ArrayList data into HashSet to eliminate duplicate
 */
import java.util.ArrayList;
import java.util.HashSet;

class Test8 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sajid");
		al.add("Patel");
		al.add("Sajid");
		al.add("Baban");
		al.add("Tabassum");
		al.add("Mysha");
		al.add("Mysha");
		al.add("Maira");
		HashSet<String> hs = new HashSet(al);
		System.out.println(hs);

	}

}
