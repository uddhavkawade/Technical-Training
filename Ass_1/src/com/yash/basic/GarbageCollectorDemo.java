package com.yash.basic;

public class GarbageCollectorDemo {
	public static void main(String[] args) {
		System.out.println("Finalizedemo.main() starts");
		String s = new String("Uddhav");

		s = null;
		System.gc();
		System.out.println("Finalizedemo.main() ends");

	}

	public void finalize() {
		System.out.println("Finalizedemo.finalize() called");
	}
}
