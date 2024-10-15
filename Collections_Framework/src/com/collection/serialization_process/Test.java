package com.collection.serialization_process;

//class Emp
import java.io.FileInputStream;
//class Emp
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Test {

	void serializationDemo() throws IOException {
		Emp e = new Emp(111, "Sajid");
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		oos.close();
		System.out.println("serialization process completed");
	}

	// throws--> lets jvm handle exception
	// IOException is parent class
	// ClassNotFoundException is child class
	void deserializationDemo() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Emp e = (Emp) ois.readObject();
		System.out.println(e.eid + " " + e.ename);
		ois.close();

	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Test t = new Test();
		t.serializationDemo();
		t.deserializationDemo();

	}

}
