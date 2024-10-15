package com.collection.set.hashset;

import java.util.HashSet;

//HashSet insertion order is not preserved
//Duplicates not allowed
class Test1 {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<String>();
		h.add("Sajid");
		h.add("Patel");
		h.add("Pune");
		h.add("Engineer");
		h.add("Sajid");
		System.out.println(h);
		HashSet<String> h1 = new HashSet<String>();
		System.out.println(h1.add("Sajid"));
		System.out.println(h1.add("Sajid"));
		System.out.println(h1.add("Sajid"));
		System.out.println(h1.add("Sajid"));
	
	}

}
