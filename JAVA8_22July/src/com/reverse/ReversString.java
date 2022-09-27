package com.reverse;

public class ReversString {

	public static void main(String[] args) {

		String name = "Vidyadhr";

		int str = name.length();

		String rev = " ";

		for (int i = str - 1; i >= 0; i--) {

			rev = rev + name.charAt(i);

		}
		System.out.println(rev);

	}

}
