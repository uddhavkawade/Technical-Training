package com.yash.collection3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {
	    public static void main(String[] agrs) {
	        //store elements in List
	        List<Integer> list = new ArrayList<Integer>();
	        list.add(10);
	        list.add(40);
	        list.add(30);
	        list.add(20);
	        list.add(10);



	       for (Integer a : list) {
	            System.out.println(a);
	        }
	        //remove all duplicates value
	        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
	        for (int i = 0; i <= list.size(); i++) {
	            set.addAll(list);
	        }
	        System.out.println("after removing duplicate "+set);



	       //ascending order
	        Set<Integer> sorted = new TreeSet<Integer>();
	        for (int j = 0; j <= set.size(); j++) {
	            sorted.addAll(set);
	        }
	        System.out.println("ascending order "+sorted);
	    }
}
