package com.collection.set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

/*
 By default TreeSet prints data in ascending order, here we printed data in decending order  
 */
class Test2 {

	public static void main(String[] args) {
		
TreeSet<String> ts= new TreeSet<String>(new MyComp());
ts.add("Sajid");
ts.add("Baban");
ts.add("Tanjim");
ts.add("Mysha");
System.out.println(ts);
	
	
TreeSet<Integer> ts1= new TreeSet<Integer>(new MyComp1());
ts1.add(1);
ts1.add(2);
ts1.add(3);
ts1.add(110);
ts1.add(20);
ts1.add(100);
System.out.println(ts1);

	

	}

}

class MyComp implements Comparator<String>

{
	@Override
	public int compare(String s1, String s2) {
		
		return -s1.compareTo(s2);
	}
}



class MyComp1 implements Comparator<Integer>
{

	@Override
	public int compare(Integer i1, Integer i2) {
		
		return -i1.compareTo(i2);
	}
	}
