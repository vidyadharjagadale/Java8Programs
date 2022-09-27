package com.mapjava8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class SetExample {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("Amalner");
		set.add("Jalgaon");
		set.add("Dhule");
		set.add("Nasik");
		set.add("Shirpur");

		Set<String> sett = new HashSet<>(Arrays.asList("Pihu", "Monu", "Pinu"));

		Stream<String> stream = set.stream();
		stream.forEach((element) -> {
			System.out.println(element);
		});
		
		System.out.println("========================================");

		sett.stream().forEach(System.out::println);

	}

}
