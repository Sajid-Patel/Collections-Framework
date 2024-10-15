package com.collection.cloning_process;


class Test implements Cloneable {
	int a = 10;
	int b = 20;

	public static void main(String[] args) throws CloneNotSupportedException {

		Test t = new Test();
		System.out.println(t.a);
		System.out.println(t.b);

		Test t2 = (Test) t.clone();
		System.out.println(t2.a);
		System.out.println(t2.b);

	}

}
