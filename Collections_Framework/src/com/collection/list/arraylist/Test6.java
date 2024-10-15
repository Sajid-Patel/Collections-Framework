package com.collection.list.arraylist;

import java.util.ArrayList;

//Employee2--again used

/*
 contains()--  It checks object presence
 containsAll()--- It checks Collections presence
 */
class Test6 {

	public static void main(String[] args) {
		Employee2 e1 = new Employee2(11, "Sajid");
		Employee2 e2 = new Employee2(12, "Patel");
		Employee2 e3 = new Employee2(13, "SP");
		Employee2 e4 = new Employee2(14, "Rock $P");

		ArrayList<Employee2> a1 = new ArrayList<Employee2>();
		a1.add(e1);
		a1.add(e2);

		ArrayList<Employee2> a2 = new ArrayList<Employee2>();
		a2.addAll(a1);
		a2.add(e3);
		a2.add(e4);

		System.out.println(a2.contains(e1));
		System.out.println(a2.containsAll(a1));
		a2.remove(e1);

		System.out.println(a2.contains(e1));
		System.out.println(a2.contains(e1));

		for (Employee2 e : a2) {
			System.out.println(e.ename + " " + e.eid);
		}

	}

}
