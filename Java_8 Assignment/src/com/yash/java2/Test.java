package com.yash.java2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

/*WAP to check the given sequence of character in given string. Suppose 
that you are given following string �Taj is situated in Agra.� And you 
have to find following sequence AST. AST should be one after another. If 
you found sta, or tas, or tsa it should print string not found*/

public class Test {

	public static void main(String[] args) {

		String str = "Taj is ast situated ast in Agra";

		List<String> list = Arrays.asList(str.split(" "));

		Object[] a = list.toArray();

		List<String> list2 = list.stream().filter(i -> i.contains("ast")).collect(Collectors.toList());

		System.out.println(list2);

	}

}
