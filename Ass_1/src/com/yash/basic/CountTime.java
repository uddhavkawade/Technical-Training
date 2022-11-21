package com.yash.basic;

public class CountTime {
	public static void main(String[] args) {

		// Time calculation for StringBuilder

		long startTime = System.currentTimeMillis();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 100000; i++) {

			sb.append(i);

		}

		System.out.println(sb);

		long endTime = System.currentTimeMillis();

		long t1 = endTime - startTime;

		// Time calculation for StringBuffer

		long startTime2 = System.currentTimeMillis();

		StringBuffer sb2 = new StringBuffer();

		for (int i = 0; i < 100000; i++) {

			sb2.append(i);

		}

		System.out.println(sb2);

		long endTime2 = System.currentTimeMillis();

		long t2 = endTime2 - startTime2;

		System.out.println("Time required for Springbuilder: " + t1);

		System.out.println("Time required for SpringBuffer: " + t2);

		System.out.println("More Time required for string buffer: " + (t2 - t1));

	}
}
