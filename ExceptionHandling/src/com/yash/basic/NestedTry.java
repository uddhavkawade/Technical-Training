package com.yash.basic;

public class NestedTry {

	public static void main(String[] args) {

		try {
			System.out.println("Outer try Block");
			try {

				System.out.println("This is Innnear try Block");
				System.out.println(10 / 0);

			} catch (ArithmeticException ae) {
				System.out.println("Innear try catch Exception");
			}
			System.out.println("Outer Catch Exception");

		} catch (Exception e) {

			System.out.println("Outer Exception");
		}
		{
			System.out.println("finally block");
		}
	}
}
