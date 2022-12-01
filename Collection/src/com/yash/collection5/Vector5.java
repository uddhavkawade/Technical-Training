package com.yash.collection5;

import java.util.Collections;
import java.util.Vector;

public class Vector5 {

	public static void main(String args[]) {

		Vector<String> vector = new Vector();

		vector.add("a");
		vector.add("d");
		vector.add("e");
		vector.add("b");
		vector.add("c");

		System.out.println("original vector : " + vector);
		Collections.sort(vector);

		System.out.println("sorted vector : " + vector);

	}
}