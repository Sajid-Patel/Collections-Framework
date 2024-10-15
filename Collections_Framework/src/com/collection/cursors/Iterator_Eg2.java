package com.collection.cursors;

import java.util.ArrayList;
import java.util.Iterator;

class Iterator_Eg2 {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Sajid");
		al1.add("Patel");
		al1.add("Engineer");
		al1.add("Pune");

		// Iterator cursor -- to remove data: Pune

		Iterator<String> itr = al1.iterator();

		while (itr.hasNext())
			
		{
			String s = itr.next();
			if (s.equals("Pune")) 
				itr.remove();
		}

		System.out.println(al1);
	}

}
