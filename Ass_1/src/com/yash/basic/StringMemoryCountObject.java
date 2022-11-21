package com.yash.basic;
/* 6.WAP to demonstrate how memory is allocated to string objects in
memory heap and string constant pool.
*/
public class StringMemoryCountObject {
	public static void main(String[] args) {
		String s1 = "yash";
		String s2 = new String("yash");
		if (s1.equals(s2) == true) {
			System.out.println("1 object is created in scp");
			System.out.println("1 object is created in heap");
		} else if (s1.equals(s2) == false) {
			System.out.println("2 object is created in scp");
			System.out.println("1 object is created in scp");
		}
	}
}
