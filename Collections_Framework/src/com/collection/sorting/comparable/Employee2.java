package com.collection.sorting.comparable;

//class Test2

//Comparable with custamizable sorting order 
/*
Problems with comparable in custamizable sorting order =
1>We are mixing normal logics and sorting logics in single class
2>We can perform sorting of one property at a time
*/


//Sorting of eid using normal version of comparable

class Employee2 implements Comparable {
	int eid;
	String ename;

	/*
	 * During object creeation I want to initialize the values then during object
	 * creation Constructor part will be executed
	 */
	public Employee2(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	@Override
	public int compareTo(Object o) {
		Employee2 e = (Employee2) o;
		if (eid == e.eid) 
			return 0;
		 else if (eid > e.eid) 
			return 1;
		 else 
			return -1;
		
	}
}
