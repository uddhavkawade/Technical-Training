package com.yash.basic;
/*
 * //12.WAP to sort array on the basis of unit place. For example we are
 * having following numbers:- 10,2,3,41,12,13,19,81,9. Output will be
 * 10,41,81,2,12,3,13,19,9.
 */
public class SortArrayUnitPlace {
   public static void main(String[] args) {
       int a[] = { 10, 2, 3, 41, 12, 13, 19, 81, 9 };
       for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                    int temp1 = a[i] % 10;  
                   int temp2 = a[j] % 10;
                   if (temp1 > temp2) {
                       int var = a[i];
                        a[i] = a[j];
                        a[j] = var;
               }
           }
            System.out.println(a[i]);
       }
   }
}
