package com.mapjava8;

import java.util.HashMap;
import java.util.Map;

public class MapUpdateTest {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("car 1", "Maruti");

		map.put("Car 2", "Tata");
		map.put("car 3", "KIA");
		map.put("car 3", "Mahindra");
		map.put("car 4", "TOYOTO");
		map.put("car 5", "MG");

		map.computeIfPresent("car 1", (key, value) -> "Tata");

		map.computeIfAbsent("car 7", (Value) -> "Reno");

		map.entrySet().iterator().forEachRemaining(System.out::println);

		System.out.println("===================Printing values only=======================");

		map.values().stream().forEach(System.out::println);
		// map.keySet().stream().forEach(System.out::println);

	}

}
