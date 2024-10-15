package com.collection.cloning_process;

import java.util.ArrayList;

class Test1 {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("Sajid");
		al.add("Patel");
		al.add("Engineer");
		al.add("Pune");
		
		ArrayList<String> copy=(ArrayList<String>)al.clone();
		System.out.println(copy);
	}

}
