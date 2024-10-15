package com.collection.sorting.comparator;

import java.util.Comparator;

class PidComp implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		if (p2.pid == p1.pid)// for decending order purpose
			// (p1.pid == p2.pid) //regular expression
			return 0;

		else if (p2.pid > p1.pid) //// for decending order purpose
			// (p1.pid > p2.pid)//regular expression
			return 1;
		else
			return -1;
	}

}
