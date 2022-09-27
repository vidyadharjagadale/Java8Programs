package com.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class AppEmp {
	public static void main(String[] args) {

		List<Employee> emplist = new ArrayList();

		emplist.add(new Employee(1, "Vidyadhar", "Jagadale", 30, "Male", 45201.0));
		emplist.add(new Employee(2, "Vijay", "Jagadale", 35, "Male", 500000.0));
		emplist.add(new Employee(3, "Pinu", "Jagadale", 15, "Male", 8000.0));
		emplist.add(new Employee(4, "Monu", "Jagadale", 12, "Male", 20000.0));
		
		Optional<Employee> sorted=emplist.stream().sorted(Comparator.comparingDouble
				(Employee::getSalary).reversed()).skip(1).findFirst();

		System.out.println(sorted.get().getSalary());
	}

}
