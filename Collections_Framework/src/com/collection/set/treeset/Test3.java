package com.collection.set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

//class Product
class Test3 {

	public static void main(String[] args) {
		TreeSet<Product> ts = new TreeSet<Product>(new MyCom());
		ts.add(new Product(111, "Book", 50));
		ts.add(new Product(222, "Pen", 10));
		ts.add(new Product(333, "Scale", 8));
		ts.add(new Product(444, "Bag", 650));
		ts.add(new Product(555, "Tiffin", 400));
		for (Product p : ts)
			System.out.println(p.pid + " " + p.pname + " " + p.pcost);

	}

}

class MyCom implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return -p1.pname.compareTo(p2.pname);
	}

}
