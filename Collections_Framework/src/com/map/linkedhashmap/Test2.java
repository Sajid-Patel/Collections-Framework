package com.map.linkedhashmap;

import java.util.Iterator;
//class Product
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

//class Product
class Test2 {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Product> lhm = new LinkedHashMap<Integer, Product>();

		lhm.put(1, new Product(111, "Pen", 20));
		lhm.put(2, new Product(222, "Bottle", 100));
		lhm.put(3, new Product(333, "Phone", 5000));
		lhm.put(4, new Product(444, "Chair", 400));

		Set<Entry<Integer, Product>> s = lhm.entrySet();

		/*
		 * Coursors are only for Collection data. For MAP data, get all the Entries in
		 * set Interface [ entrySet(); ] and on that Set we can apply coursor
		 * 
		 * On Set we can apply only Iterator Coursor
		 */
		Iterator<Entry<Integer, Product>> itr = s.iterator();

		while (itr.hasNext()) {
			Entry<Integer, Product> e = itr.next();
			Product p = e.getValue();
			if (p.pid == 111)
				itr.remove();

			if (p.pname.equals("Phone"))
				itr.remove();
		}

		// Print data using for-each loop
		for (Entry<Integer, Product> e : lhm.entrySet()) {
			Product p = e.getValue();
			System.out.println(p.pid + " " + p.pname + " " + p.cost);
		}
	}

}
