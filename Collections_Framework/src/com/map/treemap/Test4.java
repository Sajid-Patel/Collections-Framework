package com.map.treemap;

import java.util.Comparator;
import java.util.TreeMap;

class Test4 {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(new MyComp());
		tm.put(100, "Patel");
		tm.put(50, "Engineer");
		tm.put(1, "Sajid");
		tm.put(12, "Pune");
		tm.put(87, "Mysha");
		tm.put(11, "Maira");
		System.out.println(tm);

	}

}

//Constructor-4
//printing data using Comparator to achive my own sorting order
class MyComp implements Comparator<Integer>

{
	@Override
	public int compare(Integer i1, Integer i2) {
		return -i1.compareTo(i2);

	}
}
