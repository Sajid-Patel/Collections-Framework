package com.collection.set.hashset;

// Union, Intersection, Difference
import java.util.HashSet;

class Test3 {

	public static void main(String[] args) {
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		hs1.add(5);
		System.out.println("HashSet 1 = " + hs1);

		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(3);
		hs2.add(4);
		hs2.add(5);
		System.out.println("HashSet 2 = " + hs2);

		// Union
		// hs1.addAll(hs2);
		// System.out.println("Union = " + hs1); // Union = [1, 2, 3, 4, 5]

		// Intersection
		// hs1.retainAll(hs2);
		// System.out.println("Intersection = " + hs1); // Intersection = [3, 4, 5]

		// Difference
		// hs1.removeAll(hs2);
		// System.out.println("Difference = " + hs1); // Difference = [1, 2]

		// Subset
		// System.out.println(hs1.containsAll(hs2));
		// System.out.println("Subset = " + hs1);

	}

}
