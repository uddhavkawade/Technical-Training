package com.yash.collection2;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {

	public static void main(String args[]) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(3);
		al.add(40);

		int search = Collections.binarySearch(al, 0);
		if (search != -1)
			System.out.println("element present at location " + (search));
		else
			System.out.println("element not present in list");

	}
}
