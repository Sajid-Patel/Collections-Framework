package com.map.treemap;

import java.util.TreeMap;

class Test {

	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("Sajid", 111);
		tm.put("Patel", 222);
		tm.put("Baban", 333);
		System.out.println(tm);

		TreeMap<Integer, String> tm1 = new TreeMap<Integer, String>();
		tm1.put(5, "Patel");
		tm1.put(3, "Engineer");
		tm1.put(9, "Sajid");
		tm1.put(1, "Pune");
		System.out.println(tm1);

	}

}
