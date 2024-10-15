package com.collection.set.hashset;

/*
 Case 1] com.collection.set.linkedhashset;--->Test2
 
 Case2]
 Parent p= new Child();
 Set s= new HashSet();
 
 Case3]com.collection.list.arraylist;---> Test 8
 
 */
import java.util.HashSet;
import java.util.Set;

class Test2 {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		s.add("Sajid");
		s.add("Patel");
		s.add("Baban");
		s.add("Tabassum");
		System.out.println(s);

	}

}
