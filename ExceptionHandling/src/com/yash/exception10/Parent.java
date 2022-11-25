package com.yash.exception10;

import java.util.Arrays;

public class Parent {
	Main m1 = new Main();

	void largest(int[] arr) {
		try {
			System.out.println("I am from Parent class");
			Arrays.sort(arr);

		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println(e);
		}

	}
}
