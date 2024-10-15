package com.collection.set.treeset;

import java.util.TreeSet;

class Test {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Sajid");
		ts.add("Patel");
		ts.add("Mysha");
		ts.add("Baban");
		ts.add("Tanjim");
		System.out.println(ts);
		
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		ts1.add(265);
		ts1.add(1);
		ts1.add(222);
		ts1.add(130);
		ts1.add(264);
		System.out.println(ts1);
		
		/*TreeSet ts2 = new TreeSet(); //Hetrogenous Data not allowed
		ts2.add("Tabassum");
		ts2.add(10);
		System.out.println(ts2);
		
		TreeSet ts3 = new TreeSet(); //Null values not allowed
		ts3.add("Mobin");
		ts3.add(null)
		System.out.println(ts3);
		
		*/
	}

}
