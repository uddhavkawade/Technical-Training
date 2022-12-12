package com.yash.java1;

public class palindromeNo {
	public static void main(String[] agrs) {
		int num = 5215;
		String s = String.valueOf(num);
		String s1 = "";
		// System.out.println(s);

		for (int i = s.length() - 1; i >= 0; i--) {
			s1 = s1 + s.charAt(i);

		}
		System.out.println(s);

		if (s.equals(s1)) {
			System.out.println("Palidrome num");
		} else {
			System.out.println("Not Palidrome num");
		}

	}
}
