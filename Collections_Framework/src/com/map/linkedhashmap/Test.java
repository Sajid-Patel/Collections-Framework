package com.map.linkedhashmap;
//class Employee
//class Student


/*
 Problem Statement=
 Take LinkedHashMap in Test Class as key-value pair,
 take two more classes 
                     1>Key = Employee(eid & ename)
                     2>Value = Student(sid & sname)
 
 
 
 
 */
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;


class Test {

	public static void main(String[] args) {
		LinkedHashMap<Employee, Student> lhm = new LinkedHashMap<Employee, Student>();
		lhm.put(new Employee(111, "Sajid"), new Student(01, "Mysha"));
		lhm.put(new Employee(222, "Baban"), new Student(02, "Maira"));
		lhm.put(new Employee(333, "Tanjim"), new Student(03, "Nilofar"));
		lhm.put(new Employee(444, "Taisim"), new Student(04, "Tabassum"));
		lhm.put(new Employee(555, "Mobin"), new Student(05, null));

		// print the keySet();
		Set<Employee> s = lhm.keySet();
		for (Employee e : s) {
			System.out.println(e.eid + " " + e.ename);
		}

		// print the values();
		for (Student s1 : lhm.values())

		{
			System.out.println(s1.sid + " " + s1.sname);
		}

		// entrySet();
		Set<Entry<Employee, Student>> s2 = lhm.entrySet();
		Iterator<Entry<Employee, Student>> itr = s2.iterator();
		while (itr.hasNext()) {
			Entry<Employee, Student> e = itr.next();
			Employee ee = e.getKey();
			System.out.println(ee.eid + " " + ee.ename);

			Student stu = e.getValue();
			System.out.println(stu.sid + " " + stu.sname);
		}
	}

}
