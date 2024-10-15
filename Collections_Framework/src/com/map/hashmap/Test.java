package com.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

class Test {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(111, "Sajid");
		hm.put(22, "Patel");
		hm.put(22, "Engineer");
		hm.put(15, "Pune");
		hm.put(456, "Baban");
		hm.put(313, "Tabassum");

		System.out.println(hm);

		Set<Integer> s = hm.keySet();
		System.out.println(s);

		Collection<String> c = hm.values();
		System.out.println(c);

		Set<Entry<Integer, String>> s1 = hm.entrySet();
		for (Entry<Integer, String> e : s1) {
			System.out.println(e.getKey() + " " + e.getValue());
		}

	}

}
