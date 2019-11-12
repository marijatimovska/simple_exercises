package com.iwec.palindrom;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PalindromFunctional {

	public static void main(String[] args) {
		System.out.println("Words that are palindromes: ");
		filter(palindrome, (str) -> str.equalsIgnoreCase(new StringBuilder(str).reverse().toString()));

		/*
		 * if(s.equals(new StringBuilder(s).reverse().toString()));
		 * filter(palindrome,(str) -> str.startsWith("L") && str.endsWith("l")); 
		 * filter(palindrome,(str) -> str.startsWith("R") && str.endsWith("r"));
		 */

	}
	private static final List<String> palindrome = Arrays.asList("Level", "Door", "Mug", "Radar", "Java", "Laptop");

	public static void filter(List<String> words, Predicate<String> condition) {
		words.stream().filter((word) -> (condition.test(word))).forEach((word) -> {
			System.out.println(word + " ");
		});
	}

}
