package com.collection.sorting.comparator;

import java.util.Comparator;

class PnameComp implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return p1.pname.compareTo(p2.pname);
	}

}
