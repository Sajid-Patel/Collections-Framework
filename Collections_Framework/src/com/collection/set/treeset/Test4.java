package com.collection.set.treeset;

import java.util.SortedSet;
import java.util.TreeSet;

class Test4 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for (int i = 0; i <= 10; i++) {
			ts.add(i);
		}
		System.out.println(ts);

		SortedSet<Integer> s1 = ts.subSet(3, 8);
		TreeSet<Integer> t1 = new TreeSet<Integer>(s1);
		System.out.println(t1);

		SortedSet<Integer> s2 = ts.tailSet(4);
		TreeSet<Integer> t2 = new TreeSet<Integer>(s2);
		System.out.println(t2);

		SortedSet<Integer> s3 = ts.headSet(5);
		TreeSet<Integer> t3 = new TreeSet<Integer>(s3);
		System.out.println(t3);
	}

}
