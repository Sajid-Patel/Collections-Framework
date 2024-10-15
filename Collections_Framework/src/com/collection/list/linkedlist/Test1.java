package com.collection.list.linkedlist;

import java.util.LinkedList;

class Test1 {

	public static void main(String[] args) {
		LinkedList<String> LL = new LinkedList<String>();
		LL.add("Sajid");
		LL.add("Patel");
		LL.add("Engineer");
		LL.add(null);
		LL.add("Pune");
		System.out.println(LL);

		LL.addFirst("Mumbai");
		LL.addLast("Banglore");

		System.out.println(LL.size());
		System.out.println(LL);

		LL.add(2, "Event");
		System.out.println(LL);

		LL.set(3, "Change");
		System.out.println(LL);

		LL.remove(4);
		LL.remove("Patel");
		System.out.println(LL);

		LL.removeFirst();
		LL.removeLast();
		System.out.println(LL);

	}

}
