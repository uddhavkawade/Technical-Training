package com.yash.basic;
// WAP to print all the alphabets of strings in ascending and descending
// order.
public class StringAsendingDesendingOrder {
	 public static void main(String[] args) {
	        String nameOfTheCompany = "WEAREYASHIANS";
	        char a[] = nameOfTheCompany.toCharArray();
	       System.out.println("The String Characters In Ascending Orders Are :");
	       for (int i = 0; i < a.length; i++) {
	           for (int j = i + 1; j < a.length; j++) { 
	                if (a[i] > a[j]) {
	                    char temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	           System.out.print(a[i] + " ");
	       }
	       System.out.println(" ");
	       System.out.println("The String Characters In Descending Orders Are :");
	       for (int i = 0; i < a.length; i++) {
	            for (int j = i + 1; j < a.length; j++) {
	               if (a[i] < a[j]) {
	                    char temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	            System.out.print(a[i] + " ");
	        }
	   }
}
