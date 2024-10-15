package com.map.treemap;

import java.util.TreeMap;

class Test2 {

	public static void main(String[] args) {
//Adding one Map data into another

		// 1>Constructor Approach
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("Sajid", 111);
		tm.put("Patel", 222);
		tm.put("Baban", 333);

		TreeMap<String, Integer> tm1 = new TreeMap<String, Integer>(tm);
		tm1.put("Engineer", 444);
		tm1.put("Pune", 555);
		tm1.put("Rock SP", 666);

		System.out.println(tm1);

		System.out.println("_______________________________________________________________________");

		// 2>putAll();

		TreeMap<String, Integer> tm3 = new TreeMap<String, Integer>(tm);
		tm3.put("Patel", 452);
		tm3.put("Pune", 12);
		TreeMap<String, Integer> tm4 = new TreeMap<String, Integer>(tm);
		tm4.put("Rock SP", 313);
		tm4.put("Baban", 786);
		TreeMap<String, Integer> tm5 = new TreeMap<String, Integer>(tm);
		tm5.putAll(tm3);
		tm5.putAll(tm4);
		tm5.put("Sajid", 01);
		System.out.println(tm5);

	}

}
