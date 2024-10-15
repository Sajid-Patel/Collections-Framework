package com.collection.list.vector;

import java.util.Iterator;
import java.util.Vector;

/*
 Problem Statement=
 Take vector, add 1 to 30 elements, print only even elements & remove odd elements
 Hint= to add 30 elements usr for() loop & use Iterator() cursor to print data
 */
class Test2 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		for (int i = 1; i < 30; i++)

		{
			v.add(i);
		}
		System.out.println(v);
		
		//remove odd elements using Iterator Ccursor
		Iterator<Integer> itr=v.iterator();
		while(itr.hasNext())
		{
			Integer i= itr.next();
			if(i%2==0)
			{
				System.out.println(i); //even printed
			}
			else
			{
				itr.remove(); //odd removed
			}
			
		}
		
		System.out.println(v); //only  even priented

	}

}
