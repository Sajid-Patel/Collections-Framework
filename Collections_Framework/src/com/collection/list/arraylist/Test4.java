package com.collection.list.arraylist;

//To add one collection data into another collections

import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);

		ArrayList<Integer> a2 = new ArrayList<Integer>(a1);
		a2.add(100);
		a2.add(200);
		a2.add(300);
		a2.add(400);
		System.out.println(a2);

	}

}
