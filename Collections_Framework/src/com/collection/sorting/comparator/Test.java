package com.collection.sorting.comparator;

import java.util.ArrayList;
import java.util.Collections;

class Test {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(222, "Patel"));
		al.add(new Employee(888, "Nasiroddin"));
		al.add(new Employee(333, "Baban"));
		al.add(new Employee(444, "Tabassum"));
		al.add(new Employee(777, "Tanjim"));
		al.add(new Employee(111, "Sajid"));
		al.add(new Employee(666, "Mysha"));
		al.add(new Employee(555, "Maira"));

		//to sort data  using id
		//Collections.sort(al, new EidComp()); 
		
		//to sort data  using name
		Collections.sort(al, new EnameComp());

		for (Employee e : al) {
			System.out.println(e.eid + " " + e.ename);
		}

	}

}
