package com.yash.basic.exception;

public class MainClass {
	public static void main(String[] args) {
		Account account = new Account();
		System.out.println("Current balance : " + account.balance());
		account.withdraw(500);
		System.out.println("Current balance : " + account.balance());
		
	
	}
}
