package com.collection.cursors;

import java.util.ArrayList;
import java.util.ListIterator;

class ListIterator_Eg2 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sajid");
		al.add("Patel");
		al.add("Engineer");
		al.add("Pune");

		ListIterator<String> lstr = al.listIterator();
		lstr.add("Rock SP");

		while (lstr.hasNext()) {
			String s = lstr.next();

			if (s.equals("Engineer")) {
				lstr.remove();
			}

			if (s.equals("Pune")) {
				lstr.set("Mumbai");
			}

		}

		System.out.println(al);
	}

}
