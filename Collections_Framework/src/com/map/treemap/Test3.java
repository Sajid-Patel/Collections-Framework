package com.map.treemap;

import java.util.SortedMap;
import java.util.TreeMap;

class Test3 {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(100, "Patel");
		tm.put(50, "Engineer");
		tm.put(1, "Sajid");
		tm.put(22, "Mumbai");
		tm.put(12, "Pune");
		tm.put(87, "Mysha");
		tm.put(11, "Maira");

		System.out.println(tm);

		System.out.println("_______________________________________________________________________");

		// subMap values
		SortedMap<Integer, String> sm1 = tm.subMap(12, 87);
		TreeMap<Integer, String> tm1 = new TreeMap<Integer, String>(sm1);
		System.out.println(tm1);

		System.out.println("_______________________________________________________________________");

		// tailMap values
		SortedMap<Integer, String> sm2 = tm.tailMap(22);
		TreeMap<Integer, String> tm2 = new TreeMap<Integer, String>(sm2);
		System.out.println(tm2);

		System.out.println("_______________________________________________________________________");

		// HeadMap values
		SortedMap<Integer, String> sm3 = tm.headMap(50);
		TreeMap<Integer, String> tm3 = new TreeMap<Integer, String>(sm3);
		System.out.println(tm3);
	}

}
