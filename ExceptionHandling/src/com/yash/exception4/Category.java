package com.yash.exception4;

public class Category {
	private static String catid;
	private static String categoryname;

	public static String getCatid() {
		return catid;
	}

	public static void setCatid(String catid) {
		Category.catid = catid;
	}

	public static String getCategoryname() {
		return categoryname;
	}

	public static void setCategoryname(String categoryname) {
		Category.categoryname = categoryname;
	}
}
