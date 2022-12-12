package com.yash.basic;

public class EvenOddPrime {

	public int isEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }



   public int isOdd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }



   public boolean isPerfect(int n) {
        int sum = 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n)
            return true;
        return false;
    }



   public int countPerfect(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPerfect(arr[i])) {
                count++;
            }
        }
        return count;
    }



   public boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }



   public int countPrime(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                count++;
            }
        }
        return count;
    }



   public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 28, 45 };
        EvenOddPrime a = new EvenOddPrime();
        System.out.println("Even = " + a.isEven(arr));
        System.out.println("Odd = " + a.isOdd(arr));
        System.out.println("Perfect = " + a.countPerfect(arr));
        System.out.println("Prime = " + a.countPrime(arr));
    }
}
