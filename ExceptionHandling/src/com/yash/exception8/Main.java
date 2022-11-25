package com.yash.exception8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void printStrongNess(String input) throws PasswordFormatException {
		// Checking lower alphabet in string
		int n = input.length();
		boolean hasLower = false, hasUpper = false, hasDigit = false, specialChar = false;
		Set<Character> set = new HashSet<Character>(
				Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'));
		for (char i : input.toCharArray()) {
			if (Character.isLowerCase(i))
				hasLower = true;
			if (Character.isUpperCase(i))
				hasUpper = true;
			if (Character.isDigit(i))
				hasDigit = true;
			if (set.contains(i))
				specialChar = true;
		}
		// Strength of password
		System.out.print("Strength of password:- ");
		if (hasDigit && hasLower && hasUpper && specialChar && (n >= 8)
				|| hasDigit && hasLower && hasUpper && specialChar && (n >= 8)) {
			System.out.println("your password is Strong");
		} else {

			// throw an object of user defined exception
			throw new PasswordFormatException("your password is weak");
		}
	}

	// Driver Code
	public static void main(String[] args) throws PasswordFormatException {

		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter passoword");

		String userName = myObj.nextLine(); // Read user input
		printStrongNess(userName);
	}

}
