package com.yash.jaba8_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StateCityMain {

	public static void main(String[] args) {

		List<SAQ2City> cs = Arrays.asList(
				new SAQ2City(1, "pune", new StateStream(101, "maharashtra"), 9.5f, 500000, 493),
				new SAQ2City(2, "nagpur", new StateStream(101, "maharashtra"), 7.7f, 400000, 393),
				new SAQ2City(3, "hydrabad", new StateStream(102, "telangana"), 5.8f, 350000, 450),
				new SAQ2City(4, "karimnagar", new StateStream(102, "telangana"), 8f, 650000, 350),
				new SAQ2City(5, "patna", new StateStream(103, "bihar"), 6f, 450000, 500),
				new SAQ2City(6, "gaya", new StateStream(103, "bihar"), 8.6f, 600000, 300));

		System.out.println("\n" + "find city with less area and highest population");
		List<SAQ2City> value = cs.stream().sorted(
				Comparator.comparing(SAQ2City::getPopulation).thenComparing(SAQ2City::getArea_of_city).reversed())
				.limit(1).collect(Collectors.toList());
		System.out.println(value + "/n");

		System.out.println("\n" + "find city with high population index and high city area");
		List<SAQ2City> value1 = cs.stream().sorted(
				Comparator.comparing(SAQ2City::getPollutionIndex).thenComparing(SAQ2City::getArea_of_city).reversed())
				.limit(1).collect(Collectors.toList());
		System.out.println(value1 + "\n");

		System.out.println("\n" + "print city with less population index first");
		List<SAQ2City> value2 = cs.stream().sorted(Comparator.comparing(SAQ2City::getPollutionIndex))
				.collect(Collectors.toList());
		System.out.println(value2 + "\n");

		System.out.println("\n" + "print city with lowest population index and lowest area");
		List<SAQ2City> value3 = cs.stream()
				.sorted(Comparator.comparing(SAQ2City::getPollutionIndex).thenComparing(SAQ2City::getArea_of_city))
				.limit(1).collect(Collectors.toList());
		System.out.println(value3 + "\n");

		System.out.println("count how many city in state");
		long count = cs.stream().map(SAQ2City::getCityname).count();
		System.out.println(count + "\n");

		System.out.println("total area of each state");
		long sum = cs.stream().collect(Collectors.summingLong(SAQ2City::getArea_of_city));
		System.out.println(sum + "\n");

	}

}
