package com.yash.basic;

public class HCFLCM {
	static int quotient = 0;

	public static void main(String[] args) {

		int a[] = { 60, 72, 90, 50, 80 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				int temp1 = a[i];
				int temp2 = a[j];

				while (temp2 > 0) {

					int temp = temp2;

					temp2 = temp % temp1;

					temp1 = temp;

				}

				int hcf = temp2;
//	                int lcm = (a[i] * a[j]) / hcf;

				System.out.println("The HCF of the given number " + a[i] + " and " + a[j] + "=" + hcf);

	               // System.out.println("The LCM of the given number " + a[i] + " and " + a[j] + "=" + lcm);
				System.out.println(" ");
			}
		}
	}
}
