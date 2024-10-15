package com.collection.cursors;
import java.util.Enumeration;
import java.util.Vector;
class Enumeration_Eg1 {

	public static void main(String[] args) {
		Vector<String> v= new Vector<String>();
		v.add("Sajid");
		v.add("Patel");
		v.add("Engineer");
		v.add("Pune");
		v.add("Event");
		
		//Read the data by using Enumeration: Normal version
		Enumeration<String> e1=v.elements();
		while(e1.hasMoreElements()) {
			String s=e1.nextElement();
			System.out.println(s);
		}

	}

}
