package com.yash.basic;

public class ThirdMax {
	public static void main(String[] args) {

		int a[] = { 10, 20, 80, 70, 50, 60, 40, 30, 90 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}

		}
		System.out.print("Thid Highest Number of Array is =" + a[a.length - 3]);
	}
}
