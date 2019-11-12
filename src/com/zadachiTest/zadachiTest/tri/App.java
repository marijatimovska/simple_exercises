package com.zadachiTest.zadachiTest.tri;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class App {

	public static void main(String[] args) {
		Array arr = new Array();
		int[] array = { 5, 6, 2, 4, 1, 3, 4, 7};
		// int[] array = { 5, 6, 2, 4, 1, 3, 4, 7, 15, 35, 25, 3, 15, 10 };
		// Arrays.sort(array);// To print in non increasing order
		int sum = 8;
		int n = array.length;

		// THE ONLY ONE THAT WORKS ID ARRAY HAS A LOT OF NUMBERS
		arr.test(array, n, sum);

		System.out.println("~~~~~~~~~~~~~~~~~\n");

		List<Integer> list = new ArrayList<Integer>();
		for (int i : array) {
			list.add(i);
		}

		HashSet<List<Integer>> allSubsets = new HashSet<>();
		arr.findSubsets(allSubsets, list, sum);
		System.out.println(allSubsets);

		System.out.println("~~~~~~~~~~~~~~~~~\n");

		arr.printCombinations(array, -1, sum, new int[] {});

		System.out.println("~~~~~~~~~~~~~~~~~\n");
		

	}

}
