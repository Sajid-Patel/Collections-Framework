package com.collection.set.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

class Test {

	public static void main(String[] args) {
		LinkedHashSet<Employee> lhs = new LinkedHashSet<Employee>();
		lhs.add(new Employee(145, "Sajid"));
		lhs.add(new Employee(865, "Patel"));
		lhs.add(new Employee(517, "Engineer"));
		lhs.add(new Employee(635, "Pune"));
		lhs.add(new Employee(746, "Java"));
		lhs.add(new Employee(145, "Sajid"));
	
		Iterator<Employee> itr=lhs.iterator();
		
		while(itr.hasNext())
		{
			Employee e= itr.next();
			
			if(e.eid==635)
				itr.remove();
			
			if(e.ename.equals("Java"))
				itr.remove();
					//System.out.println(e.eid+" "+ e.ename); 
			//if we dont want to make changes in data then directly we can print
		    //if we want to make changer the use if() and print usinf for-each loop
		}
		
		for(Employee e:lhs)
		{
			System.out.println(e.eid+" "+ e.ename); 	
		}

	}

}
