package com.collection.list.vector.stack;

import java.util.Stack;

class Test1 {

	public static void main(String[] args) {
		Stack<String> s= new Stack<String>();
		s.push("Sajid");
		s.push("Patel");
		s.push("Pune");
		s.push("Enhineer");
		
		System.out.println(s);
		
		System.out.println(s.search("Patel"));
	
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
	}
	

}
