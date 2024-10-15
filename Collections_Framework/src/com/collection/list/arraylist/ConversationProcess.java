package com.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/*
1] Arrays --> Collection

2] Collections-->Arrays
 */
class ConversationProcess {

	public static void main(String[] args) {
		// Conversion of Arrays to Collection
		String[] s = { "aaa", "bbb", "ccc" };

		ArrayList<String> a1 = new ArrayList<String>(Arrays.asList(s));
		a1.add("Sajid");
		a1.add("Patel");
		System.out.println(a1);

		// Conversion of Generic Collection to Arrays
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Pune");
		a2.add("Mumbai");

		String[] s1 = new String[a2.size()];
		a2.toArray(s1);

		for (String ss : s1) {
			System.out.println(ss);
		}

		// Conversion of normal Collection to Arrays
		ArrayList a3 = new ArrayList();
		a3.add("Rock $P");
		a3.add(786);
		Object[] o = a3.toArray();
		for (Object oo : o) {
			System.out.println(oo);
		}

	}

}
