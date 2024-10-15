package com.collection.sorting.comparable;

//class Test4

/* 1> covered in this package 
 * 
 * 2> covered in = com.collection.sorting.comparator
 * class Product
 * class Test2
 * class PidComp
 * class PnameComp(Optional for name sorting)

*/


/*
 Problem Statement=
 Take class Product with paramater= id,name,cost
 Take another Test class and take LinkedList ---> insert 4 product objects
 1>Print Product object accending Product Id by using Comparable
 2>Print Product object decending Product Id by using Comparator
   */
class Product implements Comparable {
	int pid;
	String pname;
	int pcost;

	public Product(int pid, String pname, int pcost) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcost = pcost;
	}
//using normal sorting
@Override
public int compareTo(Object o) {
	Product p=(Product)o;
	if(pid==p.pid)
	return 0;
	else if(pid>p.pid)
		return 1;
	else
	return -1;
}

}
