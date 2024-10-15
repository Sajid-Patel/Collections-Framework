package com.collection.list.arraylist;

import java.util.ArrayList;

//Employee2
//Student2

class Test2 {

	public static void main(String[] args) {
//Collections are not type safe
		ArrayList obj = new ArrayList();
		obj.add(new Employee2(111, "Sajid"));
		obj.add(new Student2(222, "Patel"));
		obj.add(null);
		obj.add(10);
		obj.add("Sajid");

		System.out.println(obj);

		System.out.println("___________________");

//Type Checking
		for (Object o : obj) {
			if (o instanceof Employee2) {
				Employee2 e = (Employee2) o;
				System.out.println(e.eid + " " + e.ename);
			}

			if (o instanceof Student2) {
				Student2 s = (Student2) o;
				System.out.println(s.sid + " " + s.sname);
			}

			if (o instanceof String) {
				System.out.println(o);
			}
			if (o instanceof Integer) {
				System.out.println(o);
			}
			if (o == null) {
				System.out.println(o);
			}

		}

		System.out.println("___________________");

		Student2 ss = (Student2) obj.get(1);
		System.out.println(ss.sid + " " + ss.sname);

		Employee2 ee = (Employee2) obj.get(0);
		System.out.println(ee.eid + " " + ee.ename);

		System.out.println("___________________");

		// use Generics: to provide type safety to collections
		ArrayList<Employee2> emps = new ArrayList<Employee2>();

		emps.add(new Employee2(12, "Sajid"));
		emps.add(new Employee2(13, "Patel"));

		for (Employee2 e : emps) {
			System.out.println(e.eid + " " + e.ename);
		}

		System.out.println("___________________");

		Employee2 e = emps.get(1);
		System.out.println(e.eid + " " + e.ename);

		Employee2 e1 = emps.get(0);
		System.out.println(e1.eid + " " + e1.ename);
	}

}
