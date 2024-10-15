package com.collection.sorting.comparable;

import java.util.ArrayList;
import java.util.Collections;

//class Employee 

class Test2 {

	public static void main(String[] args) {
		ArrayList<Employee2> al = new ArrayList<Employee2>();
		al.add(new Employee2(111, "Sajid"));
		al.add(new Employee2(333, "Patel"));
		al.add(new Employee2(222, "Ratan"));
		al.add(new Employee2(444, "Durga"));
		Collections.sort(al);
		
		//sorting done on int base
		for(Employee2 e:al)
		{
			System.out.println(e.eid+" "+e.ename);
		}
		
	}

}
