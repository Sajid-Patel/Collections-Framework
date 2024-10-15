package com.collection.serialization_process;
//class Emp--again used

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

class Test2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(111, "Sajid"));
		al.add(new Emp(222, "Baban"));
		al.add(new Emp(333, "Tabassum"));

		// Serializaton of ArrayList : Writing object
		FileOutputStream fos = new FileOutputStream("aaa.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(al);
		oos.close();
		System.out.println("Serialization Completed");

		// DeSerializaton of ArrayList : Reading object
		FileInputStream fis = new FileInputStream("aaa.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Emp> al2 = (ArrayList<Emp>) ois.readObject();
		for (Emp e : al2) {
			System.out.println(e.eid + " " + e.ename);
		}
	}

}
