package com.collection.sorting.comparable;
//class Test3
//sorting of ename using generic versionn of commparable

class Employee3 implements Comparable<Employee3> {
	int eid;
	String ename;
	/*
	 * During object creeation I want to initialize the values then during object
	 * creation Constructor part will be executed
	 */
	public Employee3(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	@Override
	public int compareTo(Employee3 e) {
	return ename.compareTo(e.ename);
	}
	
}
