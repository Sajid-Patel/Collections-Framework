package com.collection.list.arraylist;
/*
 add(); vs addAll(); 
 
 add();    ----add one object
 addAll(); ---- adding collection data
 */
import java.util.ArrayList;

public class Test5 {

	public static void main(String[] args) {

		// Approach 1> Constructor: only one collection into another
		//This approach is not recommanded
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);

		ArrayList<Integer> a2 = new ArrayList<Integer>(a1);
		a2.add(30);
		a2.add(40);
		System.out.println(a2);

		
		
		System.out.println("_____________________________________");
		
		// Approach 2> addAll() : to add more then one collection into another
		//This approach is recommanded
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(100);
		a3.add(200);

		ArrayList<Integer> a4 = new ArrayList<Integer>();
		a4.add(300);
		a4.add(400);

		ArrayList<Integer> a5 = new ArrayList<Integer>();
		a5.add(500);
		a5.add(600);
		a5.addAll(a3);
		a5.addAll(a4);

		System.out.println(a5);

	}

}
