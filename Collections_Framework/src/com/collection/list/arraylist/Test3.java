package com.collection.list.arraylist;

import java.util.ArrayList;

class Test3 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20.5);
		al.add("Sajid");
		al.add('P');
		al.add(10);
		al.add(null);

		System.out.println(al);

		System.out.println(al.size()); // to get size of ArrayList

		al.add(2, 50.50); // to add element using Index value of ArrayList
		System.out.println(al);

		al.remove(4); // to delete element using Index value of ArrayList
		System.out.println(al);

		al.set(0, 30);// to replace element using Index value of ArrayList
		System.out.println(al);

		al.remove("Sajid"); // to delete element using content in object of ArrayList
		System.out.println(al);

	}

}
