package com.yash.exception4;

public class Item {
	private static String name;
	private static String price;
	private static String Maximum_no_ofItem_canBought;

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Item.name = name;
	}

	public static String getPrice() {
		return price;
	}

	public static void setPrice(String price) {
		Item.price = price;
	}

	public static String getMaximum_no_ofItem_canBought() {
		return Maximum_no_ofItem_canBought;
	}

	public static void setMaximum_no_ofItem_canBought(String maximum_no_ofItem_canBought) {
		Maximum_no_ofItem_canBought = maximum_no_ofItem_canBought;
	}

}
