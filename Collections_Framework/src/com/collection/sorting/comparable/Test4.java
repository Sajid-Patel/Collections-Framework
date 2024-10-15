package com.collection.sorting.comparable;

import java.util.Collections;
import java.util.LinkedList;

//class Product
class Test4 {

	public static void main(String[] args) {

		LinkedList<Product> ll = new LinkedList<Product>();
		ll.add(new Product(121, "Router", 3000));
		ll.add(new Product(211, "Laptop", 50000));
		ll.add(new Product(344, "Table", 1300));
		ll.add(new Product(001, "Chair", 400));
		ll.add(new Product(569, "Mouse", 1500));
		
		Collections.sort(ll);
		 for (Product p:ll) {
			 System.out.println(p.pid+" "+p.pname+" "+p.pcost);
		 }
	}

}
