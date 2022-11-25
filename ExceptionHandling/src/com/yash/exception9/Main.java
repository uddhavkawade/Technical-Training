package com.yash.exception9;

import java.util.Scanner;

public class Main {
	static int collarCount = 0;

	public static void getCollarDetails() {

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			System.out.println("Enter collar size");

			double collarSize = scanner.nextDouble();

			if (collarSize >= 29.4 && collarSize <= 30.6) {
				collarCount++;

			}

		}
		try {
			if (collarCount > 5) {
				System.out.println("Total collars with accepted standard deviation =" + collarCount);
			} else {
				throw new CollarStandardDeviateException("The collars Standard Deviation is not satisfying");

			}

		} catch (CollarStandardDeviateException e) {

			System.out.println(e);
		}

	}

	public static void main(String[] args) {

		getCollarDetails();

	}
}
