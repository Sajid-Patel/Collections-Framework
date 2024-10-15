package com.collection.sorting.comparable;

import java.util.ArrayList;
import java.util.Collections;

//class Employee3
class Test3 {

	public static void main(String[] args) {
		ArrayList<Employee3> al = new ArrayList<Employee3>();
		al.add(new Employee3(111, "Sajid"));
		al.add(new Employee3(333, "Patel"));
		al.add(new Employee3(222, "Ratan"));
		al.add(new Employee3(444, "Durga"));
		
		//sorting done on String base
		Collections.sort(al);
		
		for(Employee3 e:al)
		{
			System.out.println(e.eid+" "+e.ename);
		}
	}

}
