package com.collection.set.linkedhashset;

/*
 Case 1]
 Adding one collection data into another
 1>constructor
 2>addAll()
 
 Case2]com.collection.set.hashset;---->Test 2

 Case3]com.collection.list.arraylist;---> Test 8
 */
import java.util.LinkedHashSet;

class Test2 {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Sajid");
		lhs.add("Patel");
		LinkedHashSet<String> lhss = new LinkedHashSet<String>(lhs);
		lhss.add("Tabassum");
		lhss.add("Baban");
		System.out.println(lhss);

		LinkedHashSet<String> lhs1 = new LinkedHashSet<String>();
		lhs1.add("Nilofar");
		lhs1.add("Mobin");

		LinkedHashSet<String> lhs2 = new LinkedHashSet<String>();
		lhs2.add("Maira");
		lhs2.add("Mysha");

		LinkedHashSet<String> lhs3 = new LinkedHashSet<String>();
		lhs3.add("Tanjim");
		lhs3.add("Taisim");

		lhs3.addAll(lhs1);
		lhs3.addAll(lhs2);

		System.out.println(lhs3);

	}

}
