package com.collection.sorting.comparator;

import java.util.Comparator;

//generic version
class EnameComp implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.ename.compareTo(e2.ename);
	}

}
