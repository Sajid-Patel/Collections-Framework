package com.map.treemap;
//class Product

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

/*
 Problem Statement=
 TreeMap<Product,Customer> : 1> Insert 3objs
                             2> print data decending ordeer of pid
 */
class Test5 {

	public static void main(String[] args) {
		TreeMap<Product, Integer> tm = new TreeMap<Product, Integer>(new MyComp1());
		tm.put(new Product(111, "Laptop"), 01);
		tm.put(new Product(222, "Keyboard"), 02);
		tm.put(new Product(333, "CPU"), 03);
		tm.put(new Product(444, "MotherBoard"), 04);
		tm.put(new Product(555, "GPU"), 05);

		Set<Product> s = tm.keySet();
		for (Product p : s) {
			System.out.println(p.id + " " + p.name);
		}

	}

}

class MyComp1 implements Comparator<Product>

{
	@Override
	public int compare(Product p1, Product p2) {

		return -p1.id.compareTo(p2.id);
	}
}